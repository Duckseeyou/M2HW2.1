public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);
        while (true){
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("У вас " + e.getRemainingAmount() + " сом на счету");
                try {
                    account.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
        }
    }
}
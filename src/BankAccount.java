public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount += sum;
        System.out.println("Вы положили " + sum + " сом на счет");
    }

    public void withDraw(int sum) throws LimitException{
        if (amount < sum){
            throw new LimitException("Запрашиваемая сумма превышает остаток на вашем счету", amount);
        }
        this.amount -= sum;
        System.out.println("Вы сняли " + sum + " сом со счета");
    }
}

package AbstractionsInterfaces.BankAccount;

public class CreditAccount extends Account {

    CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void addMoney(int amount) {
        int result = getBalance() + amount;
        if (result <= 0) {
            changeBalance(getBalance() + amount);
            System.out.println("Кредитный счет равен " + getBalance());
        } else {
            int res = amount + getBalance();
            System.out.println("Кредитный счет не может быть положительным! Для того чтобы закрыть кредит пополните счет на сумму " + (amount - res));
        }
    }
}

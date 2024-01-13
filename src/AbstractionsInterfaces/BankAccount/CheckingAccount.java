package AbstractionsInterfaces.BankAccount;

public class CheckingAccount extends Account {
    CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) { //платить
        int result = getBalance() - amount;
        if (result >= 0) {
            changeBalance(getBalance() - result);
            System.out.println("Вы оплатили на сумму: " + amount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}

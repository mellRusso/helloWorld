package AbstractionsInterfaces.BankAccount;

public class SavingsAccount extends Account {
    SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("С данного счета нельзя оплачивать!");
    }
}

package AbstractionsInterfaces.BankAccount;

public abstract class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void changeBalance(int result) {
        balance = result;
    }

    public void pay(int amount) { //платить
        balance -= amount;
    }

    public void transfer(Account account, int amount) { //перевести
        int result = balance - amount;
        if (result >= 0) {
            account.balance += amount;
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств для перевода");
        }
    }
    public void addMoney(int amount) { //пополнить
        balance += amount;
        System.out.println("Ваш баланс равен: " + balance);
    }
}
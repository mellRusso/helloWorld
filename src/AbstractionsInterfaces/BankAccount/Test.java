package AbstractionsInterfaces.BankAccount;

public class Test {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(5000);
        Account creditAccount = new CreditAccount(0);
        Account checkingAccount = new CheckingAccount(1000);

        savingsAccount.pay(5000); //пробуем оплатить со сберегательного счета
        savingsAccount.transfer(creditAccount, 6000); //пробуем перевести большую сумму нежели у нас есть!
        savingsAccount.addMoney(1000); //пополняем счет

        creditAccount.addMoney(5000); //пробуем пополнить кредитный счет
        creditAccount.pay(5000); //оплачиваем с кредитного счета

        checkingAccount.pay(500); //оплачиваем на сумму меньше чем на балансе
        checkingAccount.pay(10000); //на сумму больше чем на балансе
        checkingAccount.transfer(savingsAccount, 400); //переводим на сберегательный счет
    }
}

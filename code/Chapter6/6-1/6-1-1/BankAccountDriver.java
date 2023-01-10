public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.owner = "Terry";
        account.account = "6250941006528599";
        account.balance = 50;

        System.out.println("Owner: " + account.owner);
        System.out.println("Account: " + account.account);
        System.out.println("Balance: " + account.balance);

        account.deposit(100);
        System.out.println("Balance: " + account.balance);

        account.withdraw(70);
        System.out.println("Balance: " + account.balance);
    }
}

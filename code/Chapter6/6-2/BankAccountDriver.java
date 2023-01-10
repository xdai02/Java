public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(
                "Account 1 Owner: " + account1.getOwner()
        );
        System.out.println(
                "Account 1 Account: " + account1.getAccount()
        );
        System.out.println(
                "Account 1 Balance: " + account1.getBalance()
        );

        BankAccount account2 = new BankAccount(
                "Terry", "6250941006528599", 50
        );
        System.out.println(
                "Account 2 Balance: " + account2.getBalance()
        );

        account2.withdraw(20);
        System.out.println(
                "Account 2 Balance: " + account2.getBalance()
        );

        account2.withdraw(10, 1);
        System.out.println(
                "Account 2 Balance: " + account2.getBalance()
        );
    }
}

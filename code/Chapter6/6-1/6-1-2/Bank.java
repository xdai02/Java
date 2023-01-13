public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setOwner("Terry");
        account.setAccount("6250941006528599");
        account.setBalance(50);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Account: " + account.getAccount());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(100);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(70);
        System.out.println("Balance: " + account.getBalance());
    }
}

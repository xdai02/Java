public class BankAccount {
    private final int ACCOUNT_DIGITS = 16;

    private String owner;
    private String account;
    private double balance;

    public void setOwner(String owner) {
        if (!owner.isEmpty()) {
            this.owner = owner;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setAccount(String account) {
        if (account.length() == ACCOUNT_DIGITS) {
            this.account = account;
        }
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

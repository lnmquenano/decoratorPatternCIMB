public class SavingsAccount implements BankAccount {
    int accountNumber;
    String accountName;
    double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Name: " + accountName + "\n" +
               "Balance: " + balance;
    }
}

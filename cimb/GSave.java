public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}

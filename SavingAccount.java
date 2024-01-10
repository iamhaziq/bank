public class SavingAccount extends Account {
    private double annualInterest = 0.25;

    public SavingAccount(double init_balance) {
        super(init_balance);
        
    }

    public boolean monthlyInterestDeposit(double amount) {
        if (amount > 0) {
            double interest = getBalance() * (annualInterest / 12);
            deposit(interest);
            return true;
        }
        return false;
    }
}
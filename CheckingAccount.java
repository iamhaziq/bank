

public class CheckingAccount extends Account {
    private double insufficientFee = 50;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
            return true;
        } else if (amount > getBalance()) {
            balance = balance - (amount + insufficientFee);
                return true;
            }
        
        return false;
    }
}

package day7.challenge2;

class SavingsAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        if (amount > 0)
        {
            setBalance(getBalance() + amount);
            TransHistory.add("Deposit: " + amount+ "the balance now is"+getBalance());
        }
        else
        {
            System.err.println("invalid amount");
        }
    }
    @Override
    public void withdraw(double amount)
    {
        if (amount > 0) {
            if (getBalance() >= amount) {
                setBalance(getBalance() - amount);
                TransHistory.add("Withdraw: " + amount+"the balance now is: "+getBalance());
            } else {
                System.err.println("balance is not enough");
            }
        }
        else
        {
            System.err.println("invalid amount");
        }
    }
}

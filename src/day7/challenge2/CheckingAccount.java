package day7.challenge2;

class CheckingAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        if (amount > 0)
        {
            setBalance(getBalance() + amount*0.98);
            System.out.println("Deposit: " + (amount*0.98)+ "the balance now is"+getBalance());
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
            if (getBalance() >= amount*1.02) {
                setBalance(getBalance() - amount*1.02);
                TransHistory.add("Withdraw: " + amount*1.02+"the balance now is: "+getBalance());
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

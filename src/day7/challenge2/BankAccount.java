package day7.challenge2;

import java.util.ArrayList;
import java.util.List;

abstract class BankAccount implements Transactable
{
    private double balance;
    List<String> TransHistory = new ArrayList<>();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    void displayTrans()
    {
        System.out.println("the transaction history:");
        for (String items: TransHistory)
        {
            System.out.println(items);
        }
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

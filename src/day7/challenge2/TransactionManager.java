package day7.challenge2;
import java.util.ArrayList;
import java.util.List;
class TransactionManager {
    List<BankAccount> accounts = new ArrayList<>();

    void addAccount(BankAccount cmp) {
        accounts.add(cmp);
    }

    void trackTransactions(BankAccount acount_env, BankAccount acount_recieve, double amount)
    {
        if ((accounts.stream().anyMatch(account -> account.equals(acount_env)))
                && (accounts.stream().anyMatch(acc -> acc.equals(acount_recieve)))) {
            acount_env.withdraw(amount);
            acount_recieve.deposit(amount);
            System.out.println(acount_env + "Send " + amount);
            System.out.println(acount_recieve + "recieve " + amount);
            for (BankAccount items : accounts) {
                items.displayTrans();
            }

        } else {
            System.out.println("invalid account");
        }
    }
}

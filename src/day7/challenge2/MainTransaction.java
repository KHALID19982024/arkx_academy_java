package day7.challenge2;
class MainTransaction{
    public static void main(String[] args) {
        /*BankAccount compteKhalid = new SavingsAccount();
        compteKhalid.setBalance(200000.8);
        compteKhalid.deposit(1000);
        compteKhalid.withdraw(500);
        compteKhalid.displayTrans();*/

        //Manger transaction
        BankAccount mohamed = new CheckingAccount();
        BankAccount ali = new SavingsAccount();
        BankAccount hassan = new CheckingAccount();
        TransactionManager bank = new TransactionManager();
        bank.addAccount(ali);
        bank.addAccount(hassan);
        ali.setBalance(10000);
        hassan.setBalance(5000);
        hassan.withdraw(4550);
        ali.deposit(500);
        ali.withdraw(800);
        ali.displayTrans();
        hassan.displayTrans();
        TransactionManager trans = new TransactionManager();
        trans.addAccount(ali);
        trans.addAccount(hassan);
        trans.trackTransactions(ali,hassan,200);
        trans.trackTransactions(ali,mohamed,200);
    }
}
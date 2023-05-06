public class Account {
    private String name;
    private double balance;
    private Transaction lastTransaction;

    public Account(String name, double balance, Transaction lastTransaction) {
        this.name = name;                               //nome del conto
        this.balance = balance;                         //bilancio del conto
        this.lastTransaction = lastTransaction;         //ultima transazione
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Transaction lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    //METODO DI AGGIORNAMENTO DEL BILANCIO DEL CONTO
    public void updateBalance(double amount) {
        balance += amount;
    }

    //METODO DI AGGIORNAMENTO DELL'ULTIMA TRANSAZIONE DEL CONTO
    public void updateLastTransaction(Transaction transaction) {
        lastTransaction = transaction;
    }
}
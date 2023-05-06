import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("LUCA", 1000.0, null);
        Account account2 = new Account("VICTOR", 500.0, null);

        Transaction transaction = new Transaction(200.0, account1, account2);

        Bank bank = new Bank();

        bank.addAccount(account1);
        bank.addAccount(account2);

        //LISTA DI CONTI
        List<Account> accounts = bank.getAccounts();
        System.out.println("Lista dei conti:");
        for (Account account : accounts) {
            System.out.println("Nome: " + account.getName() + ", Bilancio: " + account.getBalance());
        }

        //CERCA OGGETTO SPECIFICO
        String accountName = "Account1";
        Account retrievedAccount = bank.getAccount(accountName);
        System.out.println("\nAccount trovato: " + retrievedAccount.getName() + ", Bilancio: " + retrievedAccount.getBalance());

        //RIMOZIONE OGGETTO SPECIFICO
        bank.removeAccount(accountName);
        System.out.println("\nAccount rimosso: " + accountName);

        //OTTENERE ACCOUNT RIMOSSO
        try {
            retrievedAccount = bank.getAccount(accountName);
            System.out.println("Account trovato: " + retrievedAccount.getName() + ", Bilancio: " + retrievedAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Account non trovato: " + accountName);
        }
    }
}

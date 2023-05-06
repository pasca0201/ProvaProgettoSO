import java.util.ArrayList;
import java.util.List;

public class Bank {
        private List<Account> accounts;         //lista di account

        public Bank() {
                accounts = new ArrayList<>();
        }

        //METODO DI CREAZIONE DI ACCOUNT
        public void addAccount(Account account) {
                if (account == null) {         //eccezione se parametro == null
                        throw new IllegalArgumentException("Account cannot be null");
                }
                accounts.add(account);
        }

        //METODO DI RIMOZIONE ACCOUNT
        public void removeAccount(String name) {
                if (name == null) {             //eccezione se parametro == null (prima eccezione)
                        throw new IllegalArgumentException("Name cannot be null");
                }
                boolean removed = false;
                for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getName().equals(name)) {
                                accounts.remove(i);
                                removed = true;
                                i--;            //torno posizione precedente
                        }
                }
                if (!removed) {                 //eccezione se nome non presente (seconda eccezione)
                        throw new IllegalArgumentException("Account with given name not found");
                }
        }

        //METODO DI RECUPERO ACCOUNT -> RESTITUISCE ACCOUNT IN BASE AL NOME
        public Account getAccount(String name) {
                if (name == null) {             //eccezione se parametro == null (prima eccezione)
                        throw new IllegalArgumentException("Name cannot be null");
                }
                for (Account account : accounts) {
                        if (account.getName().equals(name)) {
                                return account;
                        }
                }                               //eccezione se nome non presente (seconda eccezione)
                throw new IllegalArgumentException("Account with given name not found");
        }

        public List<Account> getAccounts() {
                return accounts;
        }
}

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added : " + account.accountID);
    }

    public void removeAccount(String name) {
        accounts.removeIf(account -> account.name == name);
        System.out.println("Account removed : " + name);
    }

    public void updateAccount(int accountID, String newName, String newContactNum) {
        for (Account account : accounts) {
            if (account.accountID == accountID) {
                account.name = newName;
                account.contactNum = newContactNum;
                System.out.println("Account updated: " + accountID);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public Account searchByAccountName(String name) {
        for (Account account : accounts) {
            if (account.name == name) {
                return account;
            }
        }
        return null;
    }
}

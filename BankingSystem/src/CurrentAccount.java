public class CurrentAccount extends Account {

    public CurrentAccount(int accountID, String name, float balance, String contactNum, String upiID) {
        super(accountID, name, balance, contactNum, upiID);
    }

    @Override
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Transfer to CurrentAcc: " + amount + "| New Balance: " + balance);
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew from CurrentAcc: " + amount + "| New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!!!");
        }
    }

    @Override
    public void transferFunds(Account toAccount, float amount) {
        if (balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Money transferred successfully: " + amount + " to account " + toAccount.accountID);
        } else {
            System.out.println("Insufficient funds!!!");
        }
    }
}

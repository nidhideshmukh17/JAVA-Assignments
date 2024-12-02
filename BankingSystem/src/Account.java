public abstract class Account {
     int accountID;
     String name;
     float balance;
     String contactNum;
     String upiID;

    public Account(int accountID, String name, float balance, String contactNum, String upiID) {
        this.accountID = accountID;
        this.name = name;
        this.balance = balance;
        this.contactNum = contactNum;
        this.upiID = upiID;
    }

    public abstract void deposit(float amount);

    public abstract void withdraw(float amount);

    public abstract void transferFunds(Account toAccount, float amount);

    public void viewStatement() {
        System.out.println("Account statement: " + accountID);
    }
}

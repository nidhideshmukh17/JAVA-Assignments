public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(int accountID, String name, float balance, String contactNum, String upiID, float interestRate) {
        super(accountID, name, balance, contactNum, upiID);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited to SavingsAcc: " + amount + "| New Balance: " + balance);
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew from SavingsAcc : " + amount + "| New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!!!");
        }
    }

    @Override
    public void transferFunds(Account toAccount, float amount) {
        if (balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred money: " + amount + " to account " + toAccount.accountID);
        } else {
            System.out.println("Insufficient funds!!!");
        }
    }
}

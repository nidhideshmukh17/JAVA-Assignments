public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(1, "Nidhi", 2000, "1357924680", "nidhi@ybl", 3.5f);
        CurrentAccount current = new CurrentAccount(2, "StartUp", 5000, "0864213579", "Startup@upi");

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.deposit(500);
        current.withdraw(800);

        savings.transferFunds(current, 600);
        savings.viewStatement();

        bank.updateAccount(1,"Nids", "1234567809");

        bank.searchByAccountName("Nidhi");

        bank.removeAccount("Startup");
    }
}

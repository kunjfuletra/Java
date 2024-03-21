package constuctorchaining.bank;

public class Main {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount();
        account.deposit(200);
        account.withdraw(50);
        account.withdraw(200);
    }
}

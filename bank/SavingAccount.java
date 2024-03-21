package bank;

public class SavingAccount extends BankAccount{
	public void withdraw(double amount) {
		if (amount < balance) {
			System.out.print("Insufficient Amount");
		}
		else {
			
			balance = balance - amount; 
		}
	}
	public void deposit(double amount) {
		balance = balance + amount; 
	}
}

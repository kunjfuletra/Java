package bank;

public class BankAccount {
	protected double balance;
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public double getbalance() {
		return this.balance;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount; 
	}
	public void deposit(double amount) {
		balance = balance + amount; 
	}
}

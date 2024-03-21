package bank;

class bank{
	public static void main(String[] args) {
		BankAccount one = new BankAccount();
		one.deposit(100);
		one.deposit(200);
		one.withdraw(100);
		one.withdraw(300);
	}
}

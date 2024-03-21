package constuctorchaining.bank;

class BankAccount {
    int balance;
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(int amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        
    }

    public int getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    @Override
    public void withdraw(int amount) {
    	
        if (balance - amount < 100) 
        {
            System.out.println("Withdrawal failed.Balace should be greater than 100");
        } else {
            super.withdraw(amount);
        }
    }
}

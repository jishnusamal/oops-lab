package Lab_7;

class BankAccount {
	String name;
	long accNumber;
	double balance;
	double minBalance = 10000;
	
	BankAccount(String name, long accNumber, double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("You've deposited "+ deposit + ". Your total balance is "+ this.balance);
		
	}
	
	void withdraw(double amount) {
		if ((this.balance - amount) > this.minBalance) {
			this.balance -= amount;
			System.out.println("You've withdrawn "+ amount + ". Your remaining balance is "+ this.balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void displayAccountDetails() {
		System.out.println("Name: "+ this.name);
		System.out.println("Account Number: "+ this.accNumber);
		System.out.println("Balance: "+ this.balance);
	}
}

class SavingsAcc extends BankAccount {
	static double rate = 0.3;
	String accType = "Savings Account";
	
	SavingsAcc(String name, long accNumber, double balance) {
		super(name, accNumber, balance);
	}
	
	void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Account Type: "+ this.accType);
		System.out.println("Rate of Interest: "+ SavingsAcc.rate);
	}
}

class CurrentAcc extends BankAccount {
	String accType = "Current Account";
	double minBal = 10000;
	
	CurrentAcc(String name, long accNumber, double balance) {
		super(name, accNumber, balance);
	}
	
	double calculateServiceTax() {
		double shortBal = this.minBal - this.balance;
		return 0;
	}
	
	void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Account Type: "+ this.accType);
//		System.out.println("Rate of Interest: "+ SavingsAcc.rate);
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {
		SavingsAcc Piyush = new SavingsAcc("Piyush Sahoo", 400147707, 20000);
		Piyush.deposit(10000);
		Piyush.displayAccountDetails();
		Piyush.withdraw(1234.6);
		Piyush.deposit(308*3);
	}

}

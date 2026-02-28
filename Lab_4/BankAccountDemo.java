package Lab_4;

class BankAccount {
	static enum type {
		Savings, Checking, Current
	};
	
	String name;
	long accNumber;
	type accType;
	double bal;
	double minBal = 10000;
	static double rate = 0.3;
	
	BankAccount() {
		this.name = "";
		this.accNumber = 0;
		this.accType = type.Savings;
		this.bal = 0;
	}
	
	BankAccount(String name, long accNumber, type accType, double bal) {
		this.name = name;
		this.accNumber = accNumber;
		this.accType = accType;
		this.bal = bal;
	}
	
	void deposit(double deposit) {
		this.bal += deposit;
		System.out.println("You've deposited "+ deposit + ". Your total balance is "+ this.bal);
		
	}
	
	void withdraw(double amount) {
		if ((this.bal - amount) > this.minBal) {
			this.bal -= amount;
			System.out.println("You've withdrawn "+ amount + ". Your remaining balance is "+ this.bal);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void displayAccountDetails() {
		System.out.println();
		System.out.println("Name: "+ this.name);
		System.out.println("Account Number: "+ this.accNumber);
		System.out.println("Account Type: "+ this.accType);
		System.out.println("Balance: "+ this.bal);
		System.out.println("Rate of Interest: "+ BankAccount.rate);
		System.out.println();
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount Piyush = new BankAccount("Piyush Sahoo", 400147707, BankAccount.type.Savings, 20000);
		Piyush.deposit(10000);
		Piyush.displayAccountDetails();
		Piyush.withdraw(1234.6);
		Piyush.deposit(308*3);
	}

}

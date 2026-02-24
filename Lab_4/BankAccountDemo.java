package Lab_4;

class BankAccount {
	static enum type {
		SB, ACC
	};
	
	String name;
	long accNumber;
	type accType;
	double balance;
	double minBalance = 10000;
	static double rate = 0.3;
	
	BankAccount() {
		this.name = "";
		this.accNumber = 0;
		this.accType = type.SB;
		this.balance = 0;
	}
	
	BankAccount(String name, long accNumber, type accType, double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.accType = accType;
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
		System.out.println();
		System.out.println("Name: "+ this.name);
		System.out.println("Account Number: "+ this.accNumber);
		System.out.println("Account Type: "+ this.accType);
		System.out.println("Balance: "+ this.balance);
		System.out.println("Rate of Interest: "+ BankAccount.rate);
		System.out.println();
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount Piyush = new BankAccount("Piyush Sahoo", 400147707, BankAccount.type.SB, 20000);
		Piyush.deposit(10000);
		Piyush.displayAccountDetails();
		Piyush.withdraw(1234.6);
		Piyush.deposit(308*3);
	}

}

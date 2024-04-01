package entities;

public class Account {
	private int number; 
	private String holder;
	private double balance;
	
	
	public Account (int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double inicitalDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(inicitalDeposit);
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	
	public void withdrawn (double amount) {
		balance -= amount + 5.0;
	}

	public int getNumber() {
		return number;
	}

	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	public String toString() {
		return "Account: " + number + ", Holder:" + holder + ", Balance: $ " + String.format("%.2f", balance);
		
	}
	

	
	
	

	
	

}

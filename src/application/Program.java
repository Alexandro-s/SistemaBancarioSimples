package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account account;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder:  ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char responde = sc.next().charAt(0);
		if (responde == 'y') {
			
			System.out.println("Enter initial deposit value:  ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account (number, holder, initialDeposit);
		}
		else {
			account = new Account (number,holder); 	
		}
		
		System.out.println();
		System.out.println("Acount data: ");	
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Upadated account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdrawn(withdrawValue);
		System.out.println("Upadated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}

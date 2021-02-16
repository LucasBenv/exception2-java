package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.withdrawException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{
			
			
			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();
			System.out.print("Holder:");
			String holder = sc.next();
			sc.next();
			System.out.print("Initial balance:");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double WithdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, WithdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
			
		}catch(withdrawException e){
			System.out.println("Withdraw error:: " + e.getMessage());
		}catch(RuntimeException e){
			System.out.println("Erro inesperado: " + e);
		}
		
	}

}

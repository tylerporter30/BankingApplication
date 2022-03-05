package ATMRevatureProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTransactions {

	

	@SuppressWarnings("unlikely-arg-type")
	public void transactions() {
		
		Scanner s = new Scanner(System.in);
		
		double amount;
		double balance = 0;
		
		System.out.println("\nWould you like to 'withdraw', 'deposit', or 'transfer'? Please type one of the three options.");
		
	
		String trans = s.nextLine();
		
		
		
		while(!s.equals("done") && !s.equals("Done")) {
			
			try {

				if(trans.equalsIgnoreCase("withdraw")){
					
					System.out.println("\nHow much would you like to withdraw? (Please type a '-' before your amount)");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
		
				}
					
				else if(trans.equalsIgnoreCase("deposit")){
						
					System.out.println("\nHow much would you like to deposit?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
				}
						
				else if(trans.equalsIgnoreCase("transfer")) {
							
					System.out.println("\nHow much would you like to transfer?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
				}

				else {
						
					System.out.println("\nThank you for banking with us.");
					break;
					}
				}
			
			catch(InputMismatchException e) {
				if(s.nextLine().equalsIgnoreCase("done")) {
				System.out.println("\nThank you for banking with us!");
				break;
				}
			}
		}
		s.close();
	}
}




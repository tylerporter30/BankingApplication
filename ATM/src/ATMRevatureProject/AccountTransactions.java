package ATMRevatureProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTransactions {

	
	public void transactions() {
		
		Scanner s = new Scanner(System.in);
		
		double amount;
		double balance = 0;
		
		System.out.println("Would you like to 'withdraw', 'deposit', or 'transfer'? Please type one of the three options.");
		
		String trans = s.nextLine();
		
		
		
		while(!s.equals("done") && !s.equals("Done")) {
			
			try {
				
			
				//double money =  s.nextDouble();
			
					
		
				if(trans.equals("withdraw") || trans.equals("Withdraw")){
					
					System.out.println("How much do you want to withdraw?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("Withdraw Account: " + balance + " \nPlease type 'done' when you want to exit.");
		
				}
					
				else if(trans.equals("deposit") || trans.equals("Deposit")){
						
					System.out.println("How much do you want to deposit?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("Deposit Account: " + balance + " \nPlease type 'done' when you want to exit.");
				}
						
				else if(trans.equals("transfer") || trans.equals("Transfer")) {
							
					System.out.println("How much do you want to transfer?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("Transfer Account: " + balance + " \nPlease type 'done' when you want to exit.");
				}

				else {
						
					System.out.println("Thank you for banking with us.");
					}
				}
			
			catch(InputMismatchException e) {
				if(s.nextLine().equalsIgnoreCase("done")) {
				System.out.println("Thank you for banking with us!");
				break;
				}
			}
		}
		s.close();
	}
}




package ATMRevatureProject;

import java.util.Scanner;

public class Administrator extends AccountInformation {
	
	public void admin() {

		AccountInformation actInfo = new AccountInformation(); //creating an object from the AccountInformation Class
		//actInfo.userInfo(); 
		
		//print statement asking the Admin what they want to do
		System.out.println("Press '1' to view customer account information. \n"
				+ "Press '2' to approve/deny open applications for accounts. \n"
				+ "Press '3' to withdraw, deposit, or transfer from an account. \n"
				+ "Press '4' to cancel accounts.");
		
		//setting up scanner class and using .nextLine to take in user input from the console
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		//running a conditional to ask the Admin what they want to do next by pressing numbers 1-4
		if (input.equals("1")) {
			
			actInfo.userInfo();	
		}
			
			else if (input.equals("2")) {
				System.out.println("Press '1' to approve or '2' to deny the account. ");
				
				String input1 = s.nextLine(); //using .nextLine to ask what the user puts in to approve or deny
				if(input1.equals("1")) {
					System.out.println("Account has been approved.");	
				}
				
				else {
					System.out.println("Account has been denied.");
				}
			}
			
			else if (input.equals("3")) {
				System.out.println("Press 'w' to withdraw, 'd' to deposit, or 't' to transfer.");
				
				String input1 = s.nextLine();
				if(input1.equalsIgnoreCase("w")) {
					System.out.println("withdraw");
				}
				
				else if (input1.equalsIgnoreCase("d")) {
					System.out.println("deposit");
				}
				
				else if (input1.equalsIgnoreCase("t")) {
					System.out.println("transfer");
				}
				
				else {
					System.out.println("Please type in the correct letter.");
				}
			}
			
			else if (input.equals("4")) {
				System.out.println("Do you want to cancel this account? If so, type 'CANCEL'.");
				actInfo.userInfo();
				
				String input1 = s.nextLine();
				if(input1.equals("CANCEL")) {
					
					System.out.println("Account has been cancelled!");
				}
				
				else {
					System.out.println("Please type CANCEL in capital letters and type it correctly.");
					
				}
			}
			
		else {
			System.out.println("Have a great day.");
		}
	}
}

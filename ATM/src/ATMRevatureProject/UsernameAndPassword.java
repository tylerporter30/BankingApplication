package ATMRevatureProject;

import java.util.Scanner;

public class UsernameAndPassword {

	
	
	public void userInput() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to our bank!");
		System.out.println("Are you a new customer or an employee?");
		System.out.println("Please type the number '1' if you are a new customer, the number '2' if you are an administrator, or the number '3' if you are an employee.");
		
		String input = s.nextLine();
		
		if(input.equals("1")){
			
			System.out.println("Would you like to apply for a bank account? Please type 'yes' or 'no'.");
			
			String input1 = s.nextLine();
			
			if(input1.equals("yes") || input1.equals("Yes")){
				
				System.out.println("Thank you for applying.");
				
				System.out.println("To create an account, you must create a username and password.");
				System.out.println("Please enter your username.");
				
				String userNameInput = s.nextLine(); //reading only string user input
				System.out.println("Your username is: " + userNameInput);
				
				System.out.println("Please enter your password.");
				
				String passwordInput = s.nextLine(); //reading only string user input
				System.out.println("Your password is: " + passwordInput);
				
				
				AccountTransactions accountTrans = new AccountTransactions(); //created an object form AccountTransaction class
				
				if(input.equals("1")){
					
				accountTrans.transactions();
				}
				
				else {
					System.out.println("Thank you, have a great day");
				}
			}		
		}
		
		else if (input.equals("2")) {
			
			System.out.println("Welcome Administrator, I hope you are having a great day! What would you like to do?");
			
			//AccountInformation actInfo = new AccountInformation();
			//actInfo.userInfo();
			Administrator ad = new Administrator();
			ad.admin();
			
		}
		
		else if (input.equals("3")) {
			
			System.out.println("Welcome Employee, I hope you are having a great day! What would you like to do?");
			
			//AccountInformation actInfo = new AccountInformation();
			//actInfo.userInfo();
			Employee employee = new Employee();
			employee.emp();
			
		}
		
		else {
			
			System.out.println("Thank you, have a great day.");
			
		}
		//s.close();
	}	
}

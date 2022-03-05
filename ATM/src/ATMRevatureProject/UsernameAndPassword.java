package ATMRevatureProject;

import java.util.Scanner;

public class UsernameAndPassword implements java.io.Serializable {
	
	
	//public String newUserName;
	
		
	public void userInput() {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("\n-------------Welcome to our bank!-------------\n");
		System.out.println("Are you a new customer or an employee?");
		System.out.println("Please type the one of the following numbers \n\n1: if you are a new customer \n2: if you are an administrator \n3: if you are an employee.");
		System.out.println("\n----------------------------------------------");
		
		String input = s.nextLine();
		
		if(input.equals("1")){
			
			System.out.println("\nWould you like to apply for a bank account? Please type 'yes' or 'no'.");
			
			String input1 = s.nextLine();
			
			if(input1.equals("yes") || input1.equals("Yes")){
				
				System.out.println("Thank you for applying.");
				
				System.out.println("\nTo create an account, you must create a username and password.");
				System.out.println("Please enter your username.");
				
				//reading only string user input
				String userNameInput = s.nextLine(); 
				System.out.println("Your username is: " + userNameInput);
				//newUserName = userNameInput;
				
				System.out.println("\nPlease enter your password.");
				
				String passwordInput = s.nextLine(); //reading only string user input
				System.out.println("Your password is: " + passwordInput);
				
				
				AccountTransactions accountTrans = new AccountTransactions(); //created an object form AccountTransaction class
				
				if(input.equals("1")){
					
				accountTrans.transactions();
				}
				
				else {
					System.out.println("\nThank you, have a great day");
				}
			}		
		}
		
		else if (input.equals("2")) {
			
			System.out.println("\nWelcome Administrator, I hope you are having a great day! What would you like to do?");
			
			//WriteObjects actInfo = new WriteObjects();
			//actInfo.userInfo();
			Administrator ad = new Administrator();
			ad.admin();
			
		}
		
		else if (input.equals("3")) {
			
			System.out.println("\nWelcome Employee, I hope you are having a great day! What would you like to do?");
			
			//WriteObjects actInfo = new WriteObjects();
			//actInfo.userInfo();
			Employee employee = new Employee();
			employee.emp();
			
		}
		
		else {
			
			System.out.println("\nThank you, have a great day.");
			
		}
		//s.close();
	}	
}

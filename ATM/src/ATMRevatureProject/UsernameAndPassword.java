package ATMRevatureProject;

import java.util.Scanner;

public class UsernameAndPassword extends AccountTransactions {

	
	
	public void userInput() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to our bank!");
		System.out.println("Are you wanting to bank with us or are you an employee?");
		System.out.println("Please type the number '1' if you are a customer. If you are an employee please type the number '2'.");
		
		String input = s.nextLine();
		
		if(input.equals("1")){
			
			System.out.println("Please type 'yes' or 'no' if you want to apply for a bank account.");
			
			String input1 = s.nextLine();
			
			if(input1.equals("yes") || input1.equals("Yes")){
				
				System.out.println("Thank you for applying.");
				
				System.out.println("To create an account please type in a username and password.");
				System.out.println("Please enter your username.");
				
				String userNameInput = s.nextLine(); //reading only string user input
				System.out.println("Your username is: " + userNameInput);
				
				System.out.println("Please enter your password.");
				
				String passwordInput = s.nextLine(); //reading only string user input
				System.out.println("Your password is: " + passwordInput);
				
			}
			else {
				System.out.println("Thank you, have a great day");
			}
		}
		
		else if (input.equals("2")) {
			
			System.out.println("Welcome, I hope you have a great day at work!");
			
		}
		
		else {
			
			System.out.println("Thank you, have a great day.");
		}
		
		//s.close();
	}
	
}

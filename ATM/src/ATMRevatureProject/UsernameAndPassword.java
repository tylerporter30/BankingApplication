package ATMRevatureProject;

import java.util.Scanner;

public class UsernameAndPassword {

	
	
	public void userInput() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to our bank!");
		System.out.println("Please type 'yes' or 'no' if you want to apply for a bank account.");
		
		String yes = s.nextLine();
		
		if(yes.equals("yes") || yes.equals("Yes")){
			
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
			
			System.out.println("Thank you, have a great day.");
		}
		
		
		
		
		//s.close();
	}
	
}

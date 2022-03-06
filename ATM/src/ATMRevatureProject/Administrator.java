package ATMRevatureProject;

import java.util.Scanner;

public class Administrator {
	
	
	public void admin() {
		
		
		Scanner s = new Scanner(System.in);
		
		String username;
		String password;
		
		 System.out.println("Enter username : ");
         username = s.next();
         s.nextLine();

         System.out.println("Enter password : ");
         password = s.next();
         s.nextLine();
         
         if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
        	 
 
        	 
        	//print statement asking the Admin what they want to do
     		System.out.println("\n1: to view customer account information. \n"
     				+ "2: to approve/deny open applications for accounts. \n"
     				+ "3: to withdraw, deposit, or transfer from an account. \n"
     				+ "4: to cancel accounts.");
         }
	}
}
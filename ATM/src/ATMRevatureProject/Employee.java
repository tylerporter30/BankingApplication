package ATMRevatureProject;

import java.util.Scanner;

public class Employee {

	public void emp() {

		Scanner s = new Scanner(System.in);
		
		String username;
		String password;
		
		 System.out.println("Enter username : ");
         username = s.next();
         s.nextLine();

         System.out.println("Enter password : ");
         password = s.next();
         s.nextLine();
         
         if(username.equalsIgnoreCase("employee") && password.equalsIgnoreCase("password")) {
	 
		
		System.out.println("\n1: to view customer account information. \n"
				+ "2: to approve/deny open applications for accounts.");
		
         } 
         else {
        	 System.out.println("An error has occured. Please try again.");
         }
	}
}


package ATMRevatureProject;

import java.util.Scanner;

public class Employee extends WriteObjects {

	public void emp() {

		WriteObjects actInfo = new WriteObjects();
		//actInfo.userInfo(); 
		
		System.out.println("\n1: to view customer account information. \n"
				+ "2: to approve/deny open applications for accounts.");
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		if (input.equals("1")) {
			
			actInfo.userInfo();	
		}
			
			else if (input.equals("2")) {
				System.out.println("Press '1' to approve or '2' to deny the account. ");
				
				String input1 = s.nextLine(); //using .nextLine to ask what the user puts in to approve or deny
				if(input1.equals("1")) {
					System.out.println("Account has been approved.");	
				}
				
				else if (input1.equals("2")) {
					System.out.println("Account has been denied.");
				}
				
				else {
					System.out.println("Please type the correct number.");
				}
			}
		
		else {
			System.out.println("Have a great day.");
		}
	}
}


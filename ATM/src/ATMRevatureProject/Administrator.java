package ATMRevatureProject;

import java.util.Scanner;

public class Administrator extends AccountInformation {
	
	public void admin() {

		//AccountInformation actInfo = new AccountInformation();
		//actInfo.userInfo(); 
		
		System.out.println("Press '1' to view customer account information. \n"
				+ "Press '2' to approve/deny open applications for accounts. \n"
				+ "Press '3' to withdraw, deposit, or transfer from an account. \n"
				+ "Press '4' to cancel accounts.");
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		if (input.equals("1")) {
			System.out.println("print 1");
		}
			
			else if (input.equals("2")) {
				System.out.println("2 print");
			}
			
			else if (input.equals("3")) {
				System.out.println("3 print");
			}
			
			else if (input.equals("4")) {
				System.out.println("4 print");
			}
			
		else {
			System.out.println("Have a great day.");
		}
	}

}

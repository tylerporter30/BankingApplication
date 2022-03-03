package ATMRevatureProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountInformation {
	
	public void userInfo() {
		
		User u = new User();
		u.name = "Tyler";
		u.address = "ABC Road";
		u.SSN = 123456789;
		u.accountNum = 444555;
		u.checkingAct = 1000;
		u.savingsAct = 5000;
		
		System.out.println("Account Name: " + u.name +
				"\nAddress: " + u.address +
				"\nSSN: " +u.SSN + 
				"\nAccount Number: " + u.accountNum + 
				"\nChecking Account: " + u.checkingAct + 
				"\nSavings Account: " + u.savingsAct);
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("./src/ATMserialization.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(u);
			out.close();
			fileOut.close();
			
		}
		catch (IOException ex) {
			
			ex.printStackTrace();
			
		}
	}
}

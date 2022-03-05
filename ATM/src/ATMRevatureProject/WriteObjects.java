package ATMRevatureProject;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteObjects extends UsernameAndPassword {
			
	public void userInfo() {
					
		User u = new User();
		
		//u.password = newUserName;
	    
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
		
		//System.out.println(u.password);
		
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("./src/ATMserialization.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(u);
			out.close();
			fileOut.close();
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}



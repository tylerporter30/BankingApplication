/*
package ATMRevatureProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {
	
	public static void main(String[] args) {
		
		//System.out.println("Reading Objects...");
		
		try {
			
			FileInputStream fileOut = new FileInputStream("./src/ATMserialization.ser");
			ObjectInputStream out = new ObjectInputStream(fileOut);
			
			//User user1 = (User)out.readObject();
			//User user2 = (User)out.readObject();
			
			//out.writeObject(u);
			out.close();
			fileOut.close();
			
			//System.out.println(user1);
			//System.out.println(user2);
		}
		
		catch (IOException e) {
			
			e.printStackTrace();	
		} 
		
		//catch (ClassNotFoundException e) {
		
			//e.printStackTrace();
		//}
	}

}
*/
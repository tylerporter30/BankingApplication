package ATMRevatureProject;

public class User implements java.io.Serializable {
	
	//object serialization
	//convert serialized object, write it to a file
	//read from file and deserialize it
	
	public String name;
	public String address;
	public int SSN;
	public int number;
	public int checkingAct;
	public int savingsAct;
	
	public void mailCheck() {
		
		System.out.println("Mailing a check to " + name + " " + address);
	}
}

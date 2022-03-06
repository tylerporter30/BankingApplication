package ATMRevatureProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//"./src/ATMserialization.ser"

public class Main implements java.io.Serializable {
	
	Map<String, Customer> customerMap;

   Main() {

        customerMap = new HashMap<String, Customer>();

    }

    

	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			Customer customer;
	        String username, password;
	        double amount;
	        Main bank = new Main();
	        //int choice;
	        //outer: while (true) {
			
			
			System.out.println("\n-------------Welcome to our bank!-------------\n");
			System.out.println("Are you a new customer or an employee?");
			System.out.println("Please type the one of the following numbers \n\n1: if you are a new customer \n2: if you are an administrator \n3: if you are an employee.");
			System.out.println("\n----------------------------------------------");
			
			//String choice = s.nextLine();
			String input = s.nextLine();
			
			if(input.equals("1")){
				
				System.out.println("\nWould you like to apply for a bank account? Please type 'yes' or 'no'.");
				
				String input1 = s.nextLine();
				
				if(input1.equals("yes") || input1.equals("Yes")){
					
					System.out.println("Thank you for applying.");
					
					System.out.println("\nTo create an account, you must create a username and password.");
					
					System.out.print("Enter name : ");
                    String name = s.nextLine();
					
					System.out.println("Please enter your username.");					
					//reading only string user input
					username = s.next();
					System.out.println("Your username is: " + username);
					
					System.out.println("\nPlease enter your password.");
					password = s.next();
					System.out.println("Your password is: " + password);
					
					System.out.print("Enter initial deposit : ");

					amount = s.nextDouble();
                    customer = new Customer(username, password, name, amount);
                    bank.customerMap.put(username, customer);
					
                  
                    
					
				if(input.equals("1")){
						
					customer.transactions();
					}
					
					else {
						System.out.println("\nThank you, have a great day");
					}
				}
				
				else {
					System.out.println("\nThank you for considering our bank, have a great day");
				}
			}
			
			else if (input.equals("2")) {
				
				System.out.println("\nWelcome Administrator, I hope you are having a great day! Please login.");
				
				Administrator ad = new Administrator();
				ad.admin();
				
				
				String input2 = s.nextLine();
				
				//running a conditional to ask the Admin what they want to do next by pressing numbers 1-4
				if (input2.equals("1")) {
					
				     for (Customer v : bank.customerMap.values()) {

		                 System.out.println(v.username + " " + v.name + " " + " " + v.balance);
		             }
				}
					
					else if (input2.equals("2")) {
						System.out.println("Press '1' to approve or '2' to deny the account. ");
						
						String input1 = s.nextLine(); //using .nextLine to ask what the user puts in to approve or deny
						if(input1.equals("1")) {
							System.out.println("Account has been approved.");	
						}
						
						else {
							System.out.println("Account has been denied.");
						}
					}
					
					else if (input2.equals("3")) {
						System.out.println("Press 'w' to withdraw, 'd' to deposit, or 't' to transfer.");
						
						String input1 = s.nextLine();
						if(input1.equalsIgnoreCase("w")) {
							System.out.println("withdraw");
						}
						
						else if (input1.equalsIgnoreCase("d")) {
							System.out.println("deposit");
						}
						
						else if (input1.equalsIgnoreCase("t")) {
							System.out.println("transfer");
						}
						
						else {
							System.out.println("Please type in the correct letter.");
						}
					}
					
					else if (input2.equals("4")) {
						System.out.println("Do you want to cancel this account? If so, type 'CANCEL'.");
						//actInfo.userInfo();
						
						String input1 = s.nextLine();
						if(input1.equals("CANCEL")) {
							
							System.out.println("Account has been cancelled!");
						}
						
						else {
							System.out.println("Please type CANCEL in capital letters and type it correctly.");
							
						}
					}
		         }
			
			if (input.equals("3")) {
				
				System.out.println("\nWelcome Employee, I hope you are having a great day! Please login.");
				
				Employee employee = new Employee();
				employee.emp();
				
				
				String inputem = s.nextLine();
				
				if (inputem.equals("1")) {
					
					 for (Customer v : bank.customerMap.values()) {

		                 System.out.println(v.username + " " + v.name + " " + " " + v.balance);
		             }
					
				}
					
					else if (inputem.equals("2")) {
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
			
			else {
				
				System.out.println("\nThank you, have a great day.");
				
			}
	     
            try {

                // Saving of object in a file

                FileOutputStream file = new FileOutputStream("./src/ATMserialization.txt");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(bank);
                out.close();
                file.close();

                System.out.println("Object has been serialized");
            }

            catch (IOException ex) {
            }

            System.out.println("\nThank you for banking with us.");
            
	}
}
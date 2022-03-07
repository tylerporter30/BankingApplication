package ATMRevatureProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


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
	        
	        while (true) {
	  		
			System.out.println("\n-------------Welcome to our bank!-------------\n");
			System.out.println("Are you a new customer or an employee?");
			System.out.println("Please type the one of the following numbers: \n\n1: For New Customer \n2: For Administrator \n3: For Employee");
			System.out.println("\n----------------------------------------------");
			
			String user = s.nextLine();
						
			if(user.equals("1")){
				
				System.out.println("\nWould you like to apply for a bank account? Please type 'yes' or 'no'.");
				
				String apply = s.nextLine();
				
				if(apply.equals("yes") || apply.equals("Yes")){
					
					System.out.println("Thank you for applying. Please type 'j' if this will be a joint account or 'i' if this will be an individual account.");
					
					String applyJoint = s.nextLine();
					
					if(applyJoint.equalsIgnoreCase("j")) {
						
						System.out.println("\nPlease type joint holders name.");
						String applyJointHolder = s.nextLine();
						System.out.println("Joint account name is: " + applyJointHolder);
					}
					
					else {
						
					}										
					
					System.out.println("\nTo apply for an account, please enter your name and create a username and password.");
					
					System.out.print("\nEnter name : ");
                    String name = s.nextLine();
					
					System.out.println("\nPlease enter your username.");					
					//reading only string user input
					username = s.next();
					System.out.println("Your username is: " + username);
					
					System.out.println("\nPlease enter your password.");
					password = s.next();
					System.out.println("Your password is: " + password);
					
					System.out.print("\nEnter initial deposit : ");

					amount = s.nextDouble();	
					
                    customer = new Customer(username, password, name, amount);
                    bank.customerMap.put(username, customer);
                     
                    customer.transactions();
		
				}
				
				else {
					System.out.println("\nThank you for considering our bank, have a great day");
				}
			}
			
			else if (user.equals("2")) {
				
				System.out.println("\nWelcome Administrator, I hope you are having a great day! Please login.");
				
				Administrator ad = new Administrator();
				ad.admin();			
				
				String adminOptions = s.nextLine();
				
				//running a conditional to ask the Admin what they want to do next by pressing numbers 1-4
				if (adminOptions.equals("1")) {
					
				     for (Customer v : bank.customerMap.values()) {

		                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
		                 
		             }
				}
					
					else if (adminOptions.equals("2")) {
						System.out.println("Press '1' to approve or '2' to deny the account. ");
						
						String approval = s.nextLine(); //using .nextLine to ask what the user puts in to approve or deny
						if(approval.equals("1")) {
							
							System.out.println("Which customer's account would you like to approve?");
							
							 for (Customer v : bank.customerMap.values()) {

				                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
				             }
							 
							 String approve = s.nextLine();
							 if(approve.equals(approve))
							System.out.println("Account has been approved.");	
						}
						
						else if (approval.equals("2")) {
							
							System.out.println("Which customer's account would you like to deny?");
							
							 for (Customer v : bank.customerMap.values()) {

				                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
				             }
							
							String deny = s.nextLine();
							if(deny.equals(deny))
								bank.customerMap.clear();
							System.out.println("Account has been denied.");
						}
						
						else {
							System.out.println("Please type the correct number.");
						}
					}
					
					else if (adminOptions.equals("3")) {
						System.out.println("Press 'w' to withdraw, 'd' to deposit, or 't' to transfer.");
						
						String task = s.nextLine();
						if(task.equalsIgnoreCase("w")) {
							System.out.println("withdraw");
						}
						
						else if (task.equalsIgnoreCase("d")) {
							System.out.println("deposit");
						}
						
						else if (task.equalsIgnoreCase("t")) {
							System.out.println("transfer");
						}
						
						else {
							System.out.println("Please type in the correct letter.");
						}
					}
					
					else if (adminOptions.equals("4")) {
						System.out.println("Do you want to cancel an account? If so, type 'CANCEL'.");
						
						String cancel = s.nextLine();
						if(cancel.equalsIgnoreCase("CANCEL")) {
							
							System.out.println("Which customer's account would you like to cancel?");
							
							 for (Customer v : bank.customerMap.values()) {

				                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
				             }
							
							String deny = s.nextLine();
							if(deny.equals(deny))
								bank.customerMap.clear();
							
							System.out.println("Account has been cancelled!");
						}
						
						else {
							System.out.println("Error - Account has not been cancelled!");
							
						}
					}
		         }
			
			if (user.equals("3")) {
				
				System.out.println("\nWelcome Employee, I hope you are having a great day! Please login.");
				
				Employee employee = new Employee();
				employee.emp();			
				
				String empOptions = s.nextLine();
				
				if (empOptions.equals("1")) {
					
					 for (Customer v : bank.customerMap.values()) {

		                 System.out.println(v.username + " " + v.name + " " + " " + v.balance);
		             }
					
				}
					
					else if (empOptions.equals("2")) {
						System.out.println("Press '1' to approve or '2' to deny the account. ");
						
						String approval = s.nextLine(); //using .nextLine to ask what the user puts in to approve or deny
						if(approval.equals("1")) {
							
							System.out.println("Which customer's account would you like to approve?");
							
							 for (Customer v : bank.customerMap.values()) {

				                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
				             }
							 
							 String approve = s.nextLine();
							 if(approve.equals(approve))
							System.out.println("Account has been approved.");	
						}
						
						else if (approval.equals("2")) {
							
							System.out.println("Which customer's account would you like to deny?");
							
							 for (Customer v : bank.customerMap.values()) {

				                 System.out.println(v.name + " " + v.username + " " + " " + v.balance);
				             }
							
							String deny = s.nextLine();
							if(deny.equals(deny))
								bank.customerMap.clear();
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

            }

            catch (IOException ex) {
            }
            
            /*
            try {
            	
            	//Customer c = null;
    			
    			FileInputStream fileIn = new FileInputStream("./src/serialization.ser");
    			ObjectInputStream in = new ObjectInputStream(fileIn);
    			//c = (Customer) in.readObject();
    			//System.out.println("Name " + c.name);
    			in.close();
    			fileIn.close();
    			
    		}
    		
            
            
    		catch (IOException ex) {
    			
    			ex.printStackTrace();
    			
    		}
    		*/

            System.out.println("\nThank you for banking with us.");
            //break;
			}
	}
}
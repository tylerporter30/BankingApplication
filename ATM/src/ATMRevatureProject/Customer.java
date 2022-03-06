package ATMRevatureProject;

import java.text.NumberFormat;
import java.util.*;

class Customer implements SavingsAccount {

    String username, password, name;
    double balance;
    ArrayList<String> transactions;
    


    Customer(String username, String password, String name, double balance) {

        this.username = username;
        this.password = password;
        this.name = name;
        this.balance = balance;
        transactions = new ArrayList<String>(5);
        addTransaction(String.format("Initial deposit - " + NumberFormat.getCurrencyInstance().format(balance)));
    }

    
    @Override

    public void deposit(double amount) {

        balance += amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " credited to your account. Balance - " + NumberFormat.getCurrencyInstance().format(balance)));
    }

    @Override

    public void withdraw(double amount) {

        //if (amount > (balance - 200)) {
            //System.out.println("Insufficient balance.");
           // return;
        //}

        balance -= amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " debited from your account. Balance - " + NumberFormat.getCurrencyInstance().format(balance)));
    }

    private void addTransaction(String message) {

        transactions.add(0, message);
        if (transactions.size() > 5) {
            transactions.remove(5);
            transactions.trimToSize();
        }
    }
    

	@SuppressWarnings("unlikely-arg-type")
	public void transactions() {
		
		Customer customer = new Customer(name, name, name, balance);
		Scanner s = new Scanner(System.in);
		
		double amount;
		double balance = 0;
		
		System.out.println("\nWould you like to 'withdraw', 'deposit', 'transfer', or 'history'? Please type 'W', 'D', 'T', or 'H'.");
		
	
		String trans = s.nextLine();
		
		
		
		while(!s.equals("done") && !s.equals("Done")) {
			
			try {

				if(trans.equalsIgnoreCase("w")){
					
					System.out.println("\nHow much would you like to withdraw?");
					amount = s.nextDouble();
					balance = balance - amount;
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
		
				}
					
				else if(trans.equalsIgnoreCase("d")){
						
					System.out.println("\nHow much would you like to deposit?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					customer.deposit(amount);
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
			
				}
						
				else if(trans.equalsIgnoreCase("t")) {
							
					System.out.println("\nHow much would you like to transfer?");
					
					amount = s.nextDouble();
					balance = balance + amount;
					System.out.println("\nAccount Balance: " + balance + " \nPlease type 'done' when you want to exit.");
				}
				
				else if(trans.equalsIgnoreCase("h")) {
					
					for (String transactions : customer.transactions) {

                        System.out.println(transactions);
                        break;
                    }
				}

				else {
						
					System.out.println("\nThank you for banking with us.");
					break;
					}
				}
			
			catch(InputMismatchException e) {
				if(s.nextLine().equalsIgnoreCase("done")) {
				System.out.println("\nThank you for banking with us!");
				break;
				}
			}
		}
		s.close();
	}
}
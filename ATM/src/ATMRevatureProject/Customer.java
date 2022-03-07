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
        transactions = new ArrayList<String>(10);
        addTransaction(String.format("Initial deposit - " + NumberFormat.getCurrencyInstance().format(balance)));
    }
 
    @Override
    public void deposit(double amount) {

        balance += amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " credited to your account. \nBalance - " + NumberFormat.getCurrencyInstance().format(balance)));
    }

    @Override
    public void withdraw(double amount) {

        balance -= amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) + " debited from your account. \nBalance - " + NumberFormat.getCurrencyInstance().format(balance)));
    }

    private void addTransaction(String message) {

        transactions.add(0, message);
        if (transactions.size() > 10) {
            transactions.remove(10);
            transactions.trimToSize();
        }
    }
    
	@SuppressWarnings("unlikely-arg-type")
	public void transactions() {
		
		Customer customer = new Customer(name, name, name, balance);
		Scanner s = new Scanner(System.in);
		
		double amount;
		double balance = 0;
		
		System.out.println("\nWould you like to 'withdraw', 'deposit', 'transfer', or 'history'? Please type 'W', 'D', 'T', or 'H'. \n(Type 'done' when you want to exit.)");
		
		String trans = s.nextLine();	
		
			try {

				if(trans.equalsIgnoreCase("w")){
					
					System.out.println("\nHow much would you like to withdraw?");
					amount = s.nextDouble();
					s.nextLine();
					balance = balance - amount;
					customer.withdraw(amount);
					System.out.println();
					
					//Prints Customer Transactions
					for (String transactions : customer.transactions) {
						System.out.println(transactions);
						}
		
				}
					
				else if(trans.equalsIgnoreCase("d")){
						
					System.out.println("\nHow much would you like to deposit?");
					
					amount = s.nextDouble();
					s.nextLine();
					balance = balance + amount;
					customer.deposit(amount);
					
					for (String transactions : customer.transactions) {
					System.out.println(transactions);
					}
				}
						
				else if(trans.equalsIgnoreCase("t")) {
							
					System.out.println("\nHow much would you like to transfer?");
					
					amount = s.nextDouble();
					s.nextLine();
					balance = balance - amount;
					customer.withdraw(amount);
					
					String account;
					System.out.println("What account number would you like to send " + amount + " to?");
					account = s.nextLine();
					System.out.println("You have successfully transferred " + amount + " to acocunt number: " + account + ".");
					
					//Prints Customer Transactions
					for (String transactions : customer.transactions) {
						System.out.println(transactions);
						}					
				}
				
				else if(trans.equalsIgnoreCase("h")) {
					
					for (String transactions : customer.transactions) {

                        System.out.println(transactions);
					}                    
				}

				else {
						
					System.out.println("\nThank you for banking with us.");
					}
				}
			
			catch(InputMismatchException e) {
				if(s.nextLine().equalsIgnoreCase("done")) {
				System.out.println("\nThank you for banking with us!");
				}
			}
		}
}
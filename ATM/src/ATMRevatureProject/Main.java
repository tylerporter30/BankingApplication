package ATMRevatureProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		UsernameAndPassword userNamePassword = new UsernameAndPassword();
		userNamePassword.userInput();
		
		AccountTransactions accountTrans = new AccountTransactions();
		accountTrans.transactions();
		
		//AccountInformation actInfo = new AccountInformation();
		//actInfo.userInfo();
		
		Employee employee = new Employee();
		employee.userInfo();
	

		
		s.close();
	}
}
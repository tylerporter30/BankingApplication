package ATMRevatureProject;

public class Main {

	public static void main(String[] args) {

		UsernameAndPassword userNamePassword = new UsernameAndPassword();
		userNamePassword.userInput();
		
		AccountTransactions accountTrans = new AccountTransactions();
		accountTrans.transactions();
		
		//AccountInformation actInfo = new AccountInformation();
		//actInfo.userInfo();
		
		Employee employee = new Employee();
		employee.userInfo();
	

		
	}
}
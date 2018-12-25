public class Tester 
{
	public static void main(String[] args)
	{
		//This begins a new account in which the initial balance is 200
		// and the interest rate is 5%.
		SavingsAccount myAccount = new SavingsAccount(200, 5);
		
		//Make a deposit...notice we use an inherited method, deposit
		myAccount.deposit(132.14);
		myAccount.addInterest( );
		
		//Here, we use another inherited method, getBalance
		System.out.println("Final balance is: " + myAccount.getBalance( ) );
	}
}
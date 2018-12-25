public class SavingsAccount extends BankAccount
{
	public SavingsAccount (double amount, double rate) //constructor
	{
		super(amount);   			//Calls the constructor in
		interestRate = rate;   	//BankAccount and sets balance
	}
	public void addInterest( )
	{
		double interest = getBalance( ) * interestRate / 100;
		deposit(interest);
	}
	private double interestRate;
}
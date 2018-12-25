public class BankAccount
{
	public BankAccount (double amt) //constructor
	{
		balance = amt;
	}
	public double getBalance( )
	{
		return balance;// You supply the code here that returns the state variable, balance.
	}
	public void deposit(double d)
	{
		balance = balance + d; //You supply code here that adds d to balance.
	}
	public void withdraw(double d)
	{
		balance = balance - d; //You supply code here that subtracts d from balance.
	}
	private double balance;
}
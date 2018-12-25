/*Bank Account
 *Hady Salama
 *01/30/2018
 */
 
 public class BankAccount 
 {
 	private double balance;
 	private String name;

 	public BankAccount(double balance1, String name1)
 	{
 		balance = balance1;
 		name = name1;
 	}
 	
 	public void deposit(double depositAmt)
 	{
 		balance = balance + depositAmt;
 	}
 	
 	public void withdraw(double withdrawAmt)
 	{
 		balance = balance - withdrawAmt;
 	}
 	
 	public double getBalance()
 	{
 		return balance;
 		
 	}
 	
 	public String getName()
 	{
 		return name;
 		
 	}
 }

 
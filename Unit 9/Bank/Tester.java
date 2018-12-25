/*Bank Account
 *Hady Salama
 *01/30/2018
 */
 
import java.util.Scanner;
public class Tester
 {
 	public static void main(String Args[])
 	{
 		System.out.println("Please enter your name below");
 		Scanner reader = new Scanner(System.in);
 		String name = reader.nextLine();
 		BankAccount myAccount = new BankAccount(1000, name);
 		System.out.println("Hi " + myAccount.getName() + " your balance is $" + myAccount.getBalance());
 		System.out.println("Please enter the amount you want to deposit: ");
 		double deposit = reader.nextDouble();
 		myAccount.deposit(deposit);
 		System.out.println("Please enter the amount you want to withdraw: ");
 		double withdraw = reader.nextDouble();
 		myAccount.withdraw(withdraw);
 		System.out.println("The account balance for " + name + " is $" + myAccount.getBalance());
 	}
 }
/*Gas Mileage
 *Hady Salama
 *01/30/2018
 */
 
public class Tester 
 {
 	public static void main(String args[])
 	{
 		AutoMobile myBmw = new AutoMobile(24); //Creates New Car Object.
 		
 		myBmw.fillUp(20); //Fills up the Bmw.
 		
 		myBmw.takeTrip(100); // The Bmw takes a 100 mile trip.
 		
 		double fuelLeft = myBmw.reportFuel(); //Set a variable equal to the fuel report of the Bmw object.
 		
 		System.out.println(fuelLeft); //Outputs the fuel left in the Bmw's tank.
 		
 	}
 }
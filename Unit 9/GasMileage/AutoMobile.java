/*Gas Mileage
 *Hady Salama
 *01/30/2018
 */
 
 
 public class AutoMobile
 {
 	private double mileage;
 	private double tank;
 	
 	public AutoMobile(double mpg)
 	{
 		mileage = mpg;
 		double tank = 0;
 	}
 	
 	public void fillUp(double amt)
 	{
 		tank = tank + amt;
 	}
 	
 	public void takeTrip(double distance)
 	{
 		tank = tank - (distance/mileage);
 	}
 	
 	public double reportFuel()
 	{
 		return tank;
 	}
 }
 
 
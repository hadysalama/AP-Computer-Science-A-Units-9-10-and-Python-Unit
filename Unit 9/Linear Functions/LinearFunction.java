/*Linear Functions
 *Hady Salama
 *02/2/2018
 */

public class LinearFunction 
{
	private double m;
	private double b;
	
	public LinearFunction(double slope, double intercept)
	{
		m = slope;
		b = intercept;
	}
	
	public double getSlope()
	{
		return m;
	}
	
	public double getYintercept()
	{
		return b;
	}
	
	public double getRoot()
		
	{
		return (-1 * b)/m;
	}
	
	public double getYvalue(double x) 
	{
		return (m*x) + b;
	}
	
	public double getXvalue(double y)
	{
		return (y-b)/m;
	}
}
// GraphicsLab06st.java
// The Polymorphic Graphics Shapes Program
// Student, starting Version


import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;


public class GraphicsLab06st
{
	public static void main(String args[])
	{
		Windows win = new Windows();
		win.setSize(800,600);
		win.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		win.show();
	}
}


class Windows extends Frame
{

	public void paint(Graphics g)
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square());
		shapes.add(new Triangle());
		shapes.add(new Octagon());
		shapes.add(new Circle());

		drawGrid(g);

		for(Shape shape: shapes)
		{
			shape.drawShape(g);
			shape.displayName(g);
			shape.displayNumSides(g);
		}
	}

	public void drawGrid(Graphics g)
	{
		g.drawLine(0,300,800,300);
		g.drawLine(400,0,400,600);
	}
	
	public interface Shape 
	{
		public void drawShape(Graphics g);
		public void displayName(Graphics g);
		public void displayNumSides(Graphics g);
	}
	
	abstract class AbstractShape implements Shape 
	{
		protected int numSides;
		protected String shapeName;
		protected int titleX;
		protected int titleY;
		protected int messageX;
		protected int messageY;
		
		public AbstractShape()
		{
			
		}
		
		public void displayName(Graphics g)
		{
			g.drawString(shapeName, titleX, titleY);
		}
		
		
		public void displayNumSides(Graphics g)
		{
			g.drawString("A " + shapeName + " has " + numSides + " sides.", messageX, messageY);
		}
	}
	
	class Square extends AbstractShape
	{
		public Square()
	    {
			numSides = 4;
			shapeName = "Square"; 
			titleX = 20;
			titleY = 60;
			messageX = 100;
			messageY = 250;
	    }
	
	    public void drawShape(Graphics g)
	    {
	    	g.fillRect(100,50,150,150);
	    }
	    
	}
	
	class Triangle extends AbstractShape
	{
		public Triangle()
	    {
			numSides = 3;
			shapeName = "Triangle";
			titleX = 420;
			titleY = 60;
			messageX = 500;
			messageY = 250;
	    }

	    public void drawShape(Graphics g)
	    {
	    	Polygon tri = new Polygon();
	    	tri.addPoint(500,200);
	    	tri.addPoint(700,200);
	    	tri.addPoint(600,50);
	    	g.fillPolygon(tri);
	    }
	    
	}
	
	class Octagon extends AbstractShape
	{
		public Octagon()
		{
			numSides = 8;
			shapeName = "Ocatgon";
			titleX = 20;
			titleY = 320;
			messageX = 100;
			messageY = 550;
			
			
		}
		
		public void drawShape(Graphics g)
	    {
	    	Polygon oct = new Polygon();
	    	oct.addPoint(169,325);
	    	oct.addPoint(231,325);
	    	oct.addPoint(275,369);
	    	oct.addPoint(275,431);
	    	oct.addPoint(231,475);
	    	oct.addPoint(169,475);
	    	oct.addPoint(125,431);
	    	oct.addPoint(125,369);
	    	
	    	g.fillPolygon(oct);
	    }
	}
	
	class Circle extends AbstractShape
	{
		public Circle()
		{
			numSides = 0;
			shapeName = "Circle";
			titleX = 420;
			titleY = 320;
			messageX = 500;
			messageY = 550;
			
		}
		
		public void drawShape(Graphics g)
	    {
	    	
	    	g.fillOval(500,350,150,150);
	    	
	 
	    }
	}
}

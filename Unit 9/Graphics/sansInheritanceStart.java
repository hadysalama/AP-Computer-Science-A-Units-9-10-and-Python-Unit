// GraphicsLab06v100.java
// The Polymorphic Graphics Shapes Program without Polymorphism


import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;


public class sansInheritanceStart
{
	public static void main(String args[])
	{
		Windows win = new Windows();
		win.setSize(800,600);
		win.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		win.show();
	}
}

class Windows extends Frame
{

	public void paint(Graphics g)
	{
		drawGrid(g);

		Square square = new Square();
		square.drawSquare(g);
		square.displayName(g);
		square.displayNumSides(g);
		
		//construct the triangle object here
		
		Triangle triangle = new Triangle();
		triangle.drawTriangle(g);
		triangle.displayName(g);
		triangle.displayNumSides(g);
		
		//construct the octagon object here
		
		Octagon octagon = new Octagon();
		octagon.drawOctagon(g);
		octagon.displayName(g);
		octagon.displayNumSides(g);
		
		//construct the circle object here
		
		Circle circle = new Circle();
		circle.drawCircle(g);
		circle.displayName(g);
		circle.displayNumSides(g);

	}

	public void drawGrid(Graphics g)
	{
		g.drawLine(0,300,800,300);
		g.drawLine(400,0,400,600);
	}
}

class Square
{
	public Square()
    {
		
    }

    public void drawSquare(Graphics g)
    {
    	g.fillRect(100,50,150,150);
    }
	
	public  void displayName(Graphics g)
	{
		g.drawString("Square", 20, 60);
	}

	public  void displayNumSides(Graphics g)
	{
    	g.drawString("A Square has 4 sides.", 100, 250);
	}
}

class Triangle
{
	public Triangle()
    {

    }

    public void drawTriangle(Graphics g)
    {
    	Polygon tri = new Polygon();
    	tri.addPoint(500,200);
    	tri.addPoint(700,200);
    	tri.addPoint(600,50);
    	g.fillPolygon(tri);
    }
	
	public  void displayName(Graphics g)
	{
		g.drawString("Triangle", 420, 60);
	}

	public  void displayNumSides(Graphics g)
	{
    	g.drawString("A Triangle has 3 sides.", 500, 250);
	}
}

//create the octagon class here

class Octagon 
{
	public Octagon()
	{
		
	}
	
	public void drawOctagon(Graphics g)
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
    public  void displayName(Graphics g)
	{
		g.drawString("Octagon", 20, 320);
	}

	public  void displayNumSides(Graphics g)
	{
    	g.drawString("An Octagon has 8 sides.", 100, 550);
	}
	
}


//create the circle class here

class Circle 
{
	public Circle()
	{
		
	}
	
	public void drawCircle(Graphics g)
    {
    	
    	g.fillOval(500,350,150,150);
    	
 
    }
    public  void displayName(Graphics g)
	{
		g.drawString("Circle", 420, 320);
	}

	public  void displayNumSides(Graphics g)
	{
    	g.drawString("A Circle has 0 sides.", 500, 550);
	}
	
}
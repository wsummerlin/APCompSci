//Calculates values such as area and perimeter of a rectangle. Can strip apcslib.jar dependency by commenting 
//out sketchpad and drawingtool 
//Code Copyright 2015 @ Will Summerlin and bound by the licence found in README.md


import apcslib.*;

public class Rectangle {

	// Data declarations --------------------------------------------------------
	
	private double myX, myY, myWidth, myHeight; // Respective X, Y, W, and H values
	private DrawingTool pen;
	private SketchPad paper; //500 x 500 Default
	
	
	//Default constructor 
	public Rectangle(){
		myX = 0;
		myY = 0;
		myWidth = 0;
		myHeight = 0;
		paper = new SketchPad(500,500);
		pen = new DrawingTool(paper);
	}
	
	
	//True ("Regular") constructor 
	public Rectangle(double x, double y, double width, double height){
		myX = x;
		myY = y;
		myWidth = width;
		myHeight = height;
		paper = new SketchPad(500,500);
		pen = new DrawingTool(paper);
		
		
	}

//Print helper for calc methods
	public void calcPrint(String v, double z){
		System.out.println("The " + v + " of the rectangle is " + z);
		
		
	}
	
//Calculation methods
	// Returns Perimeter 
	public double getPerimeter(){ 
		double value = (myWidth * 2) + (myHeight * 2);
		calcPrint("Perimeter", value);
		return value;
	}
	
	// Returns Area
	public double getArea(){
		double value = (myHeight * myWidth);
		calcPrint("Area", value);
		return value;
	}
	
	//Draws Rectangle 
	public void draw(){
	pen.up();
	pen.move(myX, myY);
	pen.down();
	pen.drawRect(myWidth, myHeight);
	}

//Print method used as a helper
	
	public void printGet(String v, double z){
		System.out.println("The value of " + v + " = " + z);
		
	}

	
	
// "Getter" methods ----------------------------------------
	
	//Returns x
	public double getX(){
		double value = myX;
		printGet("x", value);
		return value;
	}
	
	//Returns y
	public double getY(){
		double value = myY;
		printGet("y", value);
		return value;
	}
	
	
	//Returns width
	public double getWidth(){
		double value = myWidth;
		printGet("width", value);
		return value;
	}
	
	//Returns height
	public double getHeight(){
		double value = myHeight;
		printGet("height", value);
		return value;
	}
	
	
//Print method used as a helper
	
	public void print(String v, double num){
		System.out.println("Success! my" + v + " is now set to " + num);
	}
	
	
// "Setter" methods ----------------------------------------

	//Sets the value of myX 
	public void setX(double x){
		myX = x;
		print("X", x);
		
	}
	
	//Sets the value of myY 
	public void setY(double y){
		myY = y;
		print("Y", y);
	}
	
	//Sets the value of myWidth 
	public void setWidth(double width){
		myWidth = width;	
		print("Width", width);
	}
	
	//Sets the value of myHeight 
	public void setHeight(double height){
		myHeight = height;
		print("Height", height);
		
	}
}

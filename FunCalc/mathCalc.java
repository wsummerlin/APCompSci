//This is the calc library. This is where the number crunching is done
//All code herein Copyright 2015 @ Will Summerlin and bound by the licence found in README.md


import java.lang.Math; //No external .jar's needed

public class mathCalc {
	
	
	public double fToC(double f){ //Fahrenheit to Celsius 
	
		double c = (5.0/9.0) * (f - 32.0);
		return c;
	}
	
	public double cToF(double c){ //Celsius to Fahrenheit
		
		double fR = (9.0*c) / (5.0) + 32.0;
		return fR;
	}
	
	public double volume(double r){ //Radius to Volume of a sphere
		
		double v = (4.0/3.0) * (Math.PI) * (Math.pow(r, 3.0)); 
		return v;
	}
	
	public double hypo(double a, double b){ //Returns hypotenuse of a right triangle 
		
		double cTwo = Math.pow(a, 2.0) + Math.pow(b, 2.0);
		double c = Math.pow(cTwo, 0.5);
		return c;
	}



}

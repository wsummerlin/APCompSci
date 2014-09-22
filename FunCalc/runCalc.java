//This is the main class

import java.util.Scanner; //No external jar's needed. 


public class runCalc {
	
	
	public static void print(String jk, double z) // Do not modify this line

	{

		System.out.println(jk + " = " + z); // Method to print object and value

	}
	
	public static void print1(String jk) // Do not modify this line

	{

		System.out.println("Please enter " + jk + ":"); // Method to print object and value

	}
	

	public static void main(String[] args) {
		mathCalc func = new mathCalc();
		Scanner scanner = new Scanner (System.in);
		
		print1("Degrees Fahrenheit");
		double f = scanner.nextDouble();
		
		double as = func.fToC(f);
		print("Celsius", as);
		
		
		print1("Degrees Celsius");
		double c = scanner.nextDouble();
		
		double ab = func.cToF(c);
		print("Fahrenheit", ab);
		
		
		print1("Raduis of the sphere");
		double r = scanner.nextDouble();
		
		double ac = func.volume(r);
		print("Volume", ac);
		
		
		print1("Side A of your triangle");
		double a = scanner.nextDouble();
		print1("Now side B");
		double b = scanner.nextDouble();
		
		double ad = func.hypo(a,b);
		print("Hypotenuse", ad);
		

	}

}

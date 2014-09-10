import java.util.Scanner;

public class changeCalc {

	
	public static void print(String jk, int z) // Do not modify this line

	{

		System.out.println(jk + " = " + z); // Method to print object and value

	}
	
	public static void calc() {
		System.out.print("Enter ammount ");
		Scanner scanner = new Scanner (System.in);
		int Amt = scanner.nextInt();
		System.out.println("Total to be distrubuted: " + Amt + " cents");
	
		
		int Q = 25;
		int D = 10;
		int N = 5;
		int P = 1;


		int quarters = (Amt/Q); 
		Amt %= Q;
		int dimes = (Amt / D);
		Amt %= D;
		int nickels = (Amt / N);
		Amt %= N;
		int pennies = (Amt / P);
		Amt %= P;
		
		print("Quarters", quarters);
		print("Dimes", dimes);
		print("Nickles", nickels);
		print("Pennies", pennies);
		

	}
	public static void main(String[] args) {
		calc();
	}

}

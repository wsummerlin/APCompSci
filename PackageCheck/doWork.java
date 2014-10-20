//Main located in test.java - Empty constructor expected

import java.util.Scanner; //The scanner could (and probably should) be used in test.java. It's here for easy logic.

public class doWork {

	Scanner sc = new Scanner(System.in); //Initializes Scanner

	double[] j = new double[3]; // Holds dimensions
	double dim2 = 0;
	double dim3 = 0;
	double dim1 = 0;
	double weight = 0;

	public void Capture() { // Collect size data from user

		int i = 1;
		while (i < 4) { // While loop to capture data
			printIt(i);
			int g = i - 1;
			j[g] = sc.nextDouble();
			i++;
		}
	}

	private static void printIt(int num) { // The usual print helper
		System.out.println("Enter dimension" + num + ": ");

	}

	public void getWeight() { // Collect weight from user
		System.out.println("Enter weight: ");
		weight = sc.nextDouble();

	}

	public void calcDim() { // Sorts array from smallest to largest - This part is complicated
		for (int s = 0; s <= j.length - 1; s++) {
			for (int k = 0; k <= j.length - 2; k++) {
				if (j[k] > j[k + 1]) { // comparing array values

					double temp = 0;
					temp = j[k]; // storing value of array in temp variable

					j[k] = j[k + 1]; // swaping values
					j[k + 1] = temp; // now storing temp value in array

				}
			}
		}

		for (int s = 0; s <= j.length - 1; s++) {
			// System.out.println(j[s]); //retrieving values of array in
			// ascending order
			dim3 = j[0]; // = array[0] -- Smallest
			dim2 = j[1]; // = array[1] -- Medium 
			dim1 = j[2]; // = array[2] -- Largest, Will be discarded
		}
	}
	 
 public void check(){  
	
		 double girth = 2*dim2 + 2*dim3; //Girth Calculation 
		 double maxG = 100.0; // Max accepted girth
		 double maxW = 70.0; // Max accepted weight
		 
		 if((girth<maxG)&&(weight<maxW)){ //If weight and size == true&&true 
			 System.out.println("Package is acceptable | weight = " + weight +  " | dim1 = " + dim1 + " | dim2 = " + dim2 + " | dim3 = " + dim3 + " | girth = " + girth);
			 
		 }else if(girth>maxG){ // If size == false
			 
			 if(weight>maxW){ // If weight == false 
				 System.out.println("Package is too large and too heavy | weight = " + weight +  " | dim1 = " + dim1 + " | dim2 = " + dim2 + " | dim3 = " + dim3 + " | girth = " + girth);
				 
			 } else //If weight == true but size == false
				 System.out.println("Package is too large | weight = " + weight +  " | dim1 = " + dim1 + " | dim2 = " + dim2 + " | dim3 = " + dim3 + " | girth = " + girth );
		
		 } else if(weight>maxW) //If size == true but weight == false
			 System.out.println("Package is too heavy | weight = " + weight +  " | dim1 = " + dim1 + " | dim2 = " + dim2 + " | dim3 = " + dim3 + " | girth = " + girth);
	 }
	
}

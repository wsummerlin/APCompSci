//EasterLab - DayOf.java
//Copyright 2014 Will Summerlin 
//No external libs needed
//Set y to year - code will print the day and month on which Easter occurs for the given year (Gregorian calendar)

public class DayOf {

	public static void print(String jk, int z) // Do not modify this line

	{

		System.out.println(jk + " = " + z); // Method to print object and value

	}

	public static void main(String[] args) // Do not modify this line

	{

		int y = 2015; // PUT YEAR HERE AS A NUMBER | DO NOT USE "" AS THIS IS
						// NOT A STRING
		print("y", y);

		int a = y % 19;
		print("a", a); // Print("", ) calls the method print() and supplies args

		int b = y / 100;
		print("b", b);

		int c = y % 100;
		print("c", c);

		int d = b / 4;
		print("d", d);

		int e = b % 4;
		print("e", e);

		int f = (b + 8) / 25;
		print("f", f);

		int g = (b - f + 1) / 3;
		print("g", g);

		int h = (19 * a + b - d - g + 15) % 30;
		print("h", h);

		int i = c / 4;
		print("i", i);

		int k = c % 4;
		print("k", k);

		int r = (32 + 2 * e + 2 * i - h - k) % 7;
		print("r", r);

		int m = (a + 11 * h + 22 * r) / 451;
		print("m", m);

		int n = (h + r - 7 * m + 114) / 31; // Month
		print("n", n);

		int p = (h + r - 7 * m + 114) % 31; // Day - 1
		print("p", p);

		int easter = p + 1; // Day
		print("easter", easter);

		System.out.println("Easter in " + y + " falls on " + n + "/" + easter);

	}

}

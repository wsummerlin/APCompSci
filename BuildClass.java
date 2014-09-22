//150% House
//Additions to come (Maybe): Dynamic wind effect, Humidity, Dew, Animation, Interaction 
//YOU NEED TO IMPORT THE dme.forecastiolib.jar library. See README for a link
//All code herein Copyright 2015 @ Will Summerlin and bound by the licence found in README.md


package house;

import java.awt.Color; //Needed for Color.color

import apcslib.*;
import dme.forecastiolib.*; //Java API Library - "API KEY NEEDED"

public class BuildClass {
	
	static SketchPad poster = new SketchPad(600, 700);
	static DrawingTool marker = new DrawingTool(poster);

	//Draw basic frame of house
	public static void buildFrame() {
		marker.home();
		marker.setColor(Color.black);
		marker.up();
		marker.turnLeft(90);
		marker.forward(150);
		marker.down();
		marker.turnRight(90);
		marker.forward(150);
		marker.turnRight(90);
		marker.forward(300);
		marker.turnRight(90);
		marker.forward(150);
		marker.turnRight(90);
		marker.forward(300);
		marker.up();
		marker.home();
		marker.move(-150, 150);
		marker.down();
		marker.turnRight(45);
		marker.move(0, 225);
		marker.move(150, 150);

	}
	
	//Draw door
	public static void buildDoor() {

		marker.home();
		marker.up();
		marker.turnLeft(90);
		marker.forward(20);
		marker.down();
		marker.turnRight(90);
		marker.forward(70);
		marker.turnRight(90);
		marker.forward(40);
		marker.turnRight(90);
		marker.forward(70);

	}

	//Draw windows
	public static void buildWindows() {

		marker.home();
		marker.up();
		marker.move(70, 120);
		marker.down();
		marker.drawRect(50, 30);
		marker.up();
		marker.move(-70, 120);
		marker.down();
		marker.drawRect(50, 30);

	}

	//Place stick figure
	public static void placeBilly() {

		// Head
		marker.home();
		marker.up();
		marker.move(80, 127);
		marker.down();
		marker.drawCircle(7);

		// Body
		marker.up();
		marker.move(80, 120);
		marker.down();
		marker.move(80, 105);

		// Arms
		marker.backward(6);
		marker.turnRight(90);
		marker.forward(6);
		marker.backward(12);

	}

	//Compound method - Handles request/parsing | See below
	public static void request() {
		ForecastIO fio = new ForecastIO(/*API KEY HERE*/);
		fio.setUnits(ForecastIO.UNITS_SI);
		fio.getForecast("37.5437590", "-122.3065840"); //Replace

		//Make Call
		FIOCurrently currently = new FIOCurrently(fio);
		// Print current weather data
		
		System.out.println("\nCurrently\n");
		String[] f = currently.get().getFieldsArray();
		for (int i = 0; i < f.length; i++)
			System.out.println(f[i] + ": " + currently.get().getByKey(f[i]));
		
		//Parse and set temp
		String temp = currently.get().getByKey(f[13]);
		System.out.println(temp);
		
		//Parse and set icon
		String icon = currently.get().getByKey(f[4]);
		System.out.println(icon);
		
		//Convert temp string to double
		double tempNum = Double.parseDouble(temp);
		System.out.println(tempNum);

		//Parse and set time 
		String time = currently.get().getByKey(f[15]);

		//Parse and set summary
		String summary = currently.get().getByKey(f[0]);

		//Check string equality and set boolean for if/else
		boolean cloud = new String("cloudy").equals(currently.get().getByKey(
				f[4]));
		
		//Set background 
		if (cloud == true) {
			marker.setColor(Color.lightGray);
			marker.home();
			marker.up();
			marker.move(0, 250);
			marker.down();
			marker.fillRect(600, 200);

		} else {
			marker.setColor(Color.cyan);
			marker.home();
			marker.up();
			marker.move(0, 250);
			marker.down();
			marker.fillRect(600, 200);
			marker.setColor(Color.white);
			marker.home();
			marker.up();
			marker.move(-200, 210);
			marker.down();
			marker.fillOval(130, 90);
		}

		//Set sun color and size
		if (tempNum >= 25) {
			marker.setColor(Color.red);
			marker.home();
			marker.up();
			marker.move(90, 250);
			marker.down();
			marker.fillOval(130, 130);

		} else if (tempNum >= 20) {
			marker.setColor(Color.orange);
			marker.home();
			marker.up();
			marker.move(90, 250);
			marker.down();
			marker.fillOval(90, 90);

		} else if (tempNum >= 15) {
			marker.setColor(Color.yellow);
			marker.home();
			marker.up();
			marker.move(90, 250);
			marker.down();
			marker.fillOval(70, 70);

		} else if (tempNum >= 10) {
			marker.setColor(Color.blue);
			marker.home();
			marker.up();
			marker.move(0, 250);
			marker.down();
			marker.fillRect(600, 400);

		} else
			marker.setColor(Color.white);

		
		//Convert tempNum to fer. and then to string
		String tempPrnt = "Temperature: "
				+ String.valueOf(tempNum * 9 / 5 + 32) + " Degrees";
		
		//Reset color and center 
		marker.setColor(Color.black);
		marker.home();
		
		//Draw temp
		marker.up();
		marker.move(-50, -100);
		marker.down();
		marker.drawString(tempPrnt);
		
		//Draw Summary
		marker.up();
		marker.move(-60, -140);
		marker.down();
		marker.drawString("Current Conditions " + summary);
		
		//Draw date-time stamp
		marker.up();
		marker.move(-50, -180);
		marker.down();
		marker.drawString(time);

	}
	
	public static void main(String[] args) {

		BuildClass.request(); // Compound method - Handles request/parsing | See therein
		BuildClass.buildFrame(); // Draws basic house
		BuildClass.buildDoor(); // Draws door
		BuildClass.buildWindows(); // Draws windows
		BuildClass.placeBilly(); // Draws stick figure

	}

}

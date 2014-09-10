//Best Hex
//Copyright Will Summerlin 2014

import apcslib.*;
import static java.lang.Math.*; //Needed for sin and cos

public class DrawBenzene {

	public static void main(String[] args) {
		// Declare new objects
		SketchPad poster = new SketchPad(600, 600);
		DrawingTool marker = new DrawingTool(poster);

		// Adjust marker to side
		marker.up();
		marker.move(130, 0);
		marker.down();

		// Declare variables
		int i = 1;
		int r = 130;
		int x = 0;
		int y = 0;
		double pi = 3.14159;

		// While loop to draw hex
		while (i < 7) {
			double z = x + r * cos(i * 2 * pi / 6);
			double v = y + r * sin(i * 2 * pi / 6);
			marker.move(z, v);
			i++;
		}

		// Set marker to 0,0 and draw circle
		marker.up();
		marker.home();
		marker.down();
		marker.drawCircle(80);

	}

}

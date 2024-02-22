package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		StdDraw.setPenColor(Color.white);
		StdDraw.text(.5, 0.5, "MMDG");
		StdDraw.setPenColor(Color.green);
		StdDraw.setPenRadius(0.015);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(Color.white);
		double[] x = {0.25, 0.5, 0.75};
		double[] y = {0.25, 0.75, 0.25};
		StdDraw.polygon(x, y);
	}
}
package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(133,192,40);
		StdDraw.filledRectangle(.5, .5, .375, .25);
		
		
		
		StdDraw.setPenColor(220,192,40);
		StdDraw.filledSquare(.5,.5,.25);
		
		StdDraw.setPenColor(250,250,250);
		StdDraw.filledCircle(.5, .5, .125);
	}
}
package ClassifierExperiments;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import morphy.annotations.TestCase;
import morphy.annotations.TestDataFeature;

public class FigureClusterPanel extends JPanel {
	public List<TestCase<TwoD, Colour>> testSet; 
	public Color colour;
	public int resizeFactor = 200; 
	
	public FigureClusterPanel(List<TestCase<TwoD, Colour>> points, boolean mutantOnly) {
		if (mutantOnly) {
			testSet = new ArrayList<TestCase<TwoD, Colour>>();
			for (TestCase<TwoD, Colour> tc : points) {
				if (tc.feature == TestDataFeature.mutant) {
					testSet.add(tc);
				}
			}
		}else { 
			testSet = points;
		};
		setBackground(Color.WHITE);
		Border border= BorderFactory.createEmptyBorder(5,10,5,10);
		this.setBorder(border);
		setSize((int) (((double) resizeFactor ) * 6.28)+20, resizeFactor*2+20);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		int width = getWidth();
		int height = getHeight();
		char[] units = {'1', '2', '3', '4', '5', '6', '-','1', 'x', 'y'};
		g.drawLine(10, resizeFactor+10, width-10, resizeFactor+10); //x axis
		g.drawChars(units, 8, 1, width-8, resizeFactor+15);
		g.drawLine(10+resizeFactor, resizeFactor+5, 10+resizeFactor, resizeFactor+15); // mark unit 1 on X axis;
		g.drawChars(units, 0, 1, 10+resizeFactor, resizeFactor+30);
		g.drawLine(10+2*resizeFactor, resizeFactor+5, 10+2*resizeFactor, resizeFactor+15); // mark unit 2 on X axis;
		g.drawChars(units, 1, 1, 10+2*resizeFactor, resizeFactor+30);
		g.drawLine(10+3*resizeFactor, resizeFactor+5, 10+3*resizeFactor, resizeFactor+15); // mark unit 3 on X axis;
		g.drawChars(units, 2, 1, 10+3*resizeFactor, resizeFactor+30);
		g.drawLine(10+4*resizeFactor, resizeFactor+5, 10+4*resizeFactor, resizeFactor+15); // mark unit 4 on X axis;
		g.drawChars(units, 3, 1, 10+4*resizeFactor, resizeFactor+30);
		g.drawLine(10+5*resizeFactor, resizeFactor+5, 10+5*resizeFactor, resizeFactor+15); // mark unit 5 on X axis;
		g.drawChars(units, 4, 1, 10+5*resizeFactor, resizeFactor+30);
		g.drawLine(10+6*resizeFactor, resizeFactor+5, 10+6*resizeFactor, resizeFactor+15); // mark unit 6 on X axis;
		g.drawChars(units, 5, 1, 10+6*resizeFactor, resizeFactor+30);
		g.drawLine(10, 10, 10, height-10); //y axis
		g.drawChars(units, 9, 1, 15, 10);
		g.drawLine(5, 10, 15, 10); // mark unit 1 on Y axis;
		g.drawChars(units, 0, 1, 0, 10);
		g.drawLine(5, resizeFactor*2+10, 15, resizeFactor*2+10); // mark unit -1 on Y axis;
		g.drawChars(units, 6, 2, 0, 2*resizeFactor+10);
		for (TestCase<TwoD, Colour> tc: testSet) {
			int xValue=(int) ( (tc.input.x*(double)resizeFactor)) +10;
			int yValue=(int) ((1-(tc.input.y))*resizeFactor+10);
			if (tc.output == null) {
				g.setColor(Color.YELLOW);
			}else {
				switch (tc.output) {
				case black: 
					g.setColor(Color.BLACK);
					break;
				case blue:
					g.setColor(Color.BLUE);
					break;
				case red:
					g.setColor(Color.RED);
					break;
				}
			};
			g.fillOval(xValue, yValue, 3, 3);
		}
	}
}

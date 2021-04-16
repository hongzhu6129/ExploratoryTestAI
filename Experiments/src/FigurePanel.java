package ClassifierExperiments;


import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import morphy.annotations.TestCase;

public class FigurePanel extends JPanel {
	public List<TestCase<Double, Double>> testSet; 
	public Color colour;
	
	public FigurePanel(List<TestCase<Double, Double>> points, Color c) {
		testSet = points;
		this.colour = c;
		Border border= BorderFactory.createEmptyBorder(5,10,5,10);
		this.setBorder(border);
		setSize((int) (400*6.28)+20, 400+20);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(colour);
		int width = getWidth();
		int height = getHeight();
		g.drawLine(10, height/2, width-10, height/2); //x axis
		g.drawLine((int) (width/2), 10, (int) (width/2), height-10); //y axis
		for (TestCase x: testSet) {
			int xValue=(int) ((Double)(x.input)*(width-20)/6.28+10);
			int yValue=(int) ((1-(Double)(x.output))*(height-20)/2+10);
			g.fillOval(xValue, yValue, 2, 2);
		}
	}
}

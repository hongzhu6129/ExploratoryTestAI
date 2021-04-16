package ClassifierExperiments;


import java.awt.Graphics;
import java.util.List;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import morphy.annotations.TestCase;

public class VisualizeOutput extends JFrame {
	public List<TestCase<Double, Double>> testSet;
	private JPanel figurePanel = new JPanel();
	public VisualizeOutput(List<TestCase<Double, Double>> tests) {
		testSet = tests;
		setSize(800,400);
		setTitle("Visualization of Test Results");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(new FigurePanel(testSet, Color.black));
		setVisible(true);
	}
}

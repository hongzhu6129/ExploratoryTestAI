package ClassifierExperiments;

import java.util.List;
import javax.swing.JFrame;

import morphy.annotations.TestCase;

public class VisualizeClusters extends JFrame {
	public List<TestCase<TwoD, Colour>> testSet;
//	private JPanel figurePanel = new JPanel();
	public VisualizeClusters(List<TestCase<TwoD, Colour>> tests, boolean mutantOnly) {
		testSet = tests;
		setSize(1300,500);
		if (mutantOnly) {
			setTitle("Visualization of Test Results (mutants only)");
		}else {
			setTitle("Visualization of Test Results (all test cases)");
		};
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(new FigureClusterPanel(testSet, mutantOnly));
//		pack();
		setVisible(true);
	}
}

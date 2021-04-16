package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class LineTest1 extends TwoDRandomTesting {
	@TestExecuter
	public Colour lineTest1(TwoD point) {
		double y = 0.3*point.x-0.8;
		numTestRuns++; 
		if (y >= point.y) { 
			return Colour.blue;
		}else {
			return Colour.red;
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Line 1; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Line1Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

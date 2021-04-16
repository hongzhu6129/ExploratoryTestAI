package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class CircleTest1 extends TwoDRandomTesting {
	
	@TestExecuter
	public Colour circleTest1(TwoD point) {
		double d = Math.sqrt((point.x - 2)*(point.x - 2) + (point.y-0.2)*(point.y-0.2));
		numTestRuns++; 
		if (d >= 0.7) { 
			return Colour.blue;
		}else {
			return Colour.red;
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Circle 1; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Circle1Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

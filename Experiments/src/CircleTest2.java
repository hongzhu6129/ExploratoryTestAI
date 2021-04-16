package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class CircleTest2 extends TwoDRandomTesting {
	@TestExecuter
	public Colour circleTest2(TwoD point) {
		double d = Math.sqrt((point.x - 2)*(point.x - 2) + (point.y-0.2)*(point.y-0.2));
		double y = 0.3*point.x - 0.4; 
		numTestRuns++; 
		if (d >= 0.7) { 
			if (point.y >= y) {
				return Colour.blue;
			}else {
				return Colour.red;
			}
		}else {
			return Colour.black;
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Circle 2; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Circle2Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class SinTest1 extends TwoDRandomTesting {
	@TestExecuter
	public Colour sinTest3(TwoD point) {
		double sinP = Math.sin(point.x);
		numTestRuns++; 
		if ((sinP - point.y) >= 0) { 
			return Colour.blue;
		}else {
			return Colour.red;
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Sin 1; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Sin1Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

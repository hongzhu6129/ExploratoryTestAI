package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class SinTest2 extends TwoDRandomTesting {
	@TestExecuter
	public Colour sinTest1(TwoD point) {
		double acceptableError = 0.2;
		double sinP = Math.sin(point.x);
		numTestRuns++; 
		if (Math.abs(sinP - point.y) < acceptableError) { return Colour.black;};
		if (sinP > point.y) {return Colour.red;};
		if (point.y > sinP) {return Colour.blue;};
		return Colour.black;
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Sin 2; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Sin2Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

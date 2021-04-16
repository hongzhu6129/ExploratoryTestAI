package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class LineTest2 extends TwoDRandomTesting {
	@TestExecuter
	public Colour lineTest2(TwoD point) {
		double y1 = 0.3*point.x-0.8;
		double y2 = 0.3*point.x-1.0;
		numTestRuns++; 
		if ((y1 >= point.y) && (y2 < point.y)) { return Colour.black;};
		if (y2 >= point.y) {return Colour.red;};
		if (point.y > y1) {return Colour.blue;};
		return Colour.black;
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Line 2; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Line2Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

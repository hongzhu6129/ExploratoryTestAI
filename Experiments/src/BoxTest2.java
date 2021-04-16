package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

// Example of datamorphic test specification for testing a classifier.

public class BoxTest2 extends TwoDRandomTesting {
	@TestExecuter
	public Colour boxTest2(TwoD point) {
		double y = Math.log10(point.x);
		numTestRuns++; 
		if ((point.x>=1)&& (point.x <= 2) 
			&& (point.y>=-0.5) && (point.y<=0.4)){ 
			return Colour.black;
		}else {
			if (point.y >= y) {
				return Colour.blue;
			}else {
				return Colour.red;
			}
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Box 2; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Box2Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

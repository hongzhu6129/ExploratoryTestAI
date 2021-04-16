package ClassifierExperiments;


import morphy.annotations.Analyser;
import morphy.annotations.TestExecuter;

public class BoxTest1 extends TwoDRandomTesting{
	@TestExecuter
	public Colour boxTest1(TwoD point) {
		numTestRuns++; 
		if ((point.x>=1)&& (point.x <= 2) 
			&& (point.y>=-0.5) && (point.y<=0.4)){ 
			return Colour.red;
		}else {
			return Colour.blue;
		}
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Box 1; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Box1Sample");
		sampleSaver.saveTestData(testSuite);
	}
	
}

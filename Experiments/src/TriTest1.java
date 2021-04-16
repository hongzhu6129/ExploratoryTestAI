package ClassifierExperiments;

import morphy.annotations.Analyser;
import morphy.annotations.Metamorphism;
import morphy.annotations.TestCase;
import morphy.annotations.TestExecuter;

public class TriTest1 extends TwoDRandomTesting {
	@TestExecuter
	public Colour triTest1(TwoD point) {
		double y1 = point.x-1;
		double y2 = -point.x + 1;
		double y3 = 3 * point.x -5;
		numTestRuns++; 
		if ((point.y<=y1)&& (point.y >= y2) && (point.y >= y3)){ 
			return Colour.red;
		}else {
			return Colour.blue;
		}
	}
	
	@Metamorphism(
			applicableTestCase="mutant",
			applicableDatamorphism = "upward",
			message="Failed the upward preservation rule")
	public boolean upwardAsst(TestCase<TwoD, Colour> tc) {
			TestCase<TwoD, Colour> originalTc = testSuite.get(tc.getOrigins().get(0));
			if ((originalTc.output == Colour.blue)|| (originalTc.output == Colour.black)){
				return (tc.output == Colour.blue);
			};
			return true;
	}
	
	@Metamorphism(
			applicableTestCase="mutant",
			applicableDatamorphism="downward",
			message="Failed the downward preservation rule"
			)
	public boolean downwardAssT(TestCase<TwoD, Colour> tc) {
			TestCase<TwoD, Colour> originalTc = testSuite.get(tc.getOrigins().get(0));
			if ((originalTc.output == Colour.red)|| (originalTc.output == Colour.black)){
				return (tc.output == Colour.red);
			};
			return true;
	}
	
	@Analyser
	public void saveMessageHead() {
		saver.saveData("Triangle 1; 200");
	}
	
	@Analyser
	public void saveSample() {
		SampleSaver sampleSaver = new SampleSaver("Tri1Sample");
		sampleSaver.saveTestData(testSuite);
	}
}

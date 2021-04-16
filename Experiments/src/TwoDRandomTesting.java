package ClassifierExperiments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math; 
import javax.swing.JOptionPane;

import morphy.annotations.Analyser;
import morphy.annotations.MakeSeed;
import morphy.annotations.TestCase;
import morphy.annotations.TestCaseFilter;
import morphy.annotations.TestCaseMetric;
import morphy.annotations.TestDataFeature;
import morphy.annotations.TestPool;
import morphy.annotations.TestSetContainer;
import morphy.annotations.TestSetFilter;
import morphy.annotations.TestSetMetric;

public class TwoDRandomTesting extends TwoDDatamorphisms {
	
	Random randomGenerator = new Random();
	
	@TestSetContainer(
			inputTypeName = "TwoD",
			outputTypeName = "Colour"
			)
	public TestPool<TwoD, Colour> testSuite = new TestPool<TwoD, Colour>();
	
	@MakeSeed
	public void RandomValue10(){
		for (int i=0; i<10;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue100(){
		for (int i=0; i<100; i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2 -1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue200(){
		for (int i=0; i<200;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue400(){
		for (int i=0; i<400;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue600(){
		for (int i=0; i<600;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue800(){
		for (int i=0; i<800;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue1000(){
		for (int i=0; i<1000;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@MakeSeed
	public void RandomValue1200(){
		for (int i=0; i<1200;i++){
			double x = randomGenerator.nextDouble()*Math.PI*2;
			double y = randomGenerator.nextDouble()*2-1;
			TwoD input = new TwoD(x,y);
			testSuite.addInput(input);
		}
	};
	
	@TestSetMetric
	public double AvgDistance() {
		double total =0;
		double num = 0;
		for (TestCase<TwoD, Colour> tc: testSuite.testSet ) {
			total += Distance(tc); 
			num++; 
		};
		if (num==0) {return 0;}
		else {return total / num ;}
	}
	
	int numMeasures = 0; 
	@TestSetMetric
	public double StdDistance() {
		double avgDistance = 0;
		List<Double> distanceList = new ArrayList<Double>();
		double num = 0;
		double total = 0; 
		for (TestCase<TwoD, Colour> tc: testSuite.testSet ) {
			double distanceX = Distance(tc);
			distanceList.add(distanceX);
			total += distanceX; 
			num++; 
		};
		if (num==0) {
			return -1;
		}else {
			avgDistance = total / num ;
			double sumDiffSq = 0; 
			for (double x : distanceList) {
				sumDiffSq = sumDiffSq + (x - avgDistance)*(x - avgDistance);
			};
			numMeasures++;
			return Math.sqrt(sumDiffSq/num);
		}
	}
	
	@TestSetFilter
	public void sparse() {
		List<TestCase> toBeRemovedTCs = new ArrayList<TestCase>();
		int size = testSuite.testSet.size();
		for (TestCase<TwoD, Colour> TCx: testSuite.testSet) {
			Double distanceX = null;
			for (TestCase<TwoD, Colour> TCy: testSuite.testSet) {
				if (TCx.id.equals(TCy.id)) {
					continue;
				};
				boolean alreadyRemoved = false; 
				for (TestCase<TwoD, Colour> TCz: toBeRemovedTCs) {
					if (TCy.id.equals(TCz.id)) {
						alreadyRemoved = true; 
						break;
					}
				}
				if (alreadyRemoved) {
					continue;
				}
				double distanceXY =  Math.abs(TCy.input.x - TCx.input.x) + Math.abs(TCy.input.y - TCx.input.y);
				if (distanceX == null) {
					distanceX = distanceXY;
				}else {
					if (distanceXY < distanceX) { distanceX = distanceXY; }
				}
			};
			if (distanceX!=null && distanceX <0.05) {
				toBeRemovedTCs.add(TCx);
			};
		};
		testSuite.removeAllTestCases(toBeRemovedTCs);
	}
	
	@TestCaseMetric
	public double Distance(TestCase<TwoD, Colour> point) {
		Double distance = null;
		for (TestCase<TwoD, Colour> TCy : testSuite.testSet) {
			if (point.id.equals(TCy.id)){
				continue;
			};
			double distanceXY =  Math.abs(TCy.input.x - point.input.x) + Math.abs(TCy.input.y - point.input.y);
			if (distance == null) {distance = distanceXY;
			}else {
				if (distanceXY < distance) { distance = distanceXY; }
			}
		};
		return distance;
	}
	
	@TestCaseFilter
	public Boolean TooClose(TestCase<TwoD, Colour> x) {
		return (Distance(x) <0.02);
	}
	
	@Analyser
	public void visualiseAll() {
		new VisualizeClusters(testSuite.testSet, false);
	}
	
	@Analyser
	public void visualiseMutants() {
		new VisualizeClusters(testSuite.testSet, true);
	}
	
	public SaveExpResults saver = new SaveExpResults();
	@Analyser
	public void saveStatistics() {
		int numTC = testSuite.testSet.size();
		int numOriginalTC = 0;
		int numMutantTC = 0;
		double avgDistance = AvgDistance();
		double stdDistance =StdDistance();
		numMeasures--;
		for (TestCase<TwoD, Colour> x : testSuite.testSet) {
			if (x.feature == TestDataFeature.original) { 
				numOriginalTC++;
			}else {
				numMutantTC++;
			};
		};
		saver.saveData(","+numTestRuns+","+numTC+","+numOriginalTC+","+numMutantTC+","
				+avgDistance+","+stdDistance+","+ numMeasures);
	}
	
	@Analyser
	public void viewStatistics() {
		int numTC = testSuite.testSet.size();
		int numOriginalTC = 0;
		int numMutantTC = 0;
		int numMutantUpward =0;
		int numMutantDownward = 0;
		int numMutantLeftward = 0;
		int numMutantRightward = 0;
		int numMutantMid = 0; 
		for (TestCase<TwoD, Colour> x : testSuite.testSet) {
			if (x.feature == TestDataFeature.original) { 
				numOriginalTC++;
			}else {
				numMutantTC++;
				switch (x.getType()) {
				case "mid": numMutantMid++; break; 
				case "upward": numMutantUpward++; break; 
				case "downward": numMutantDownward++; break; 
				case "leftward": numMutantLeftward++; break;
				case "rightward": numMutantRightward++; break; 
				}
			};
		};
		String message = "Statistics:\n"; 
		message = message + "Number of test executions = " + numTestRuns + "\n";
		message = message + "Total number of test cases = " + numTC + "\n"; 
		message = message + "Number of original test cases = "+ numOriginalTC + "\n";
		message = message + "Number of mutant test cases = " + numMutantTC + "\n";
		message = message + " -- upward mutants = " + numMutantUpward +"\n";
		message = message + " -- downward mutants = " + numMutantDownward + "\n";
		message = message + " -- leftward mutants = " + numMutantLeftward + "\n";
		message = message + " -- rightward mutants = " + numMutantRightward + "\n";
		message = message + " -- mid mutants = " + numMutantMid + "\n";
		message = message + "Average distances between testcases = " + AvgDistance() + "\n";
		message = message + "Standard deviation of distances = " + StdDistance()+"\n";
		numMeasures--;
		message = message + "Number of Test Set Metrics measured = " + numMeasures;
		JOptionPane.showMessageDialog(null, message);
	}
	
	@Analyser
	public void saveMessage() {
		String message = JOptionPane.showInputDialog(null, "Please enter message");
		saver.saveData(message);
	}
	
	@Analyser
	public void saveMessageNL() {
		saver.saveData("Average");
	}
}

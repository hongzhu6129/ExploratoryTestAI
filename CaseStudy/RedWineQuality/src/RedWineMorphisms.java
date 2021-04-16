package RedWineQuality;

//Datamorphic Test Specification 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFileChooser;

import morphy.annotations.*;  
public class RedWineMorphisms extends MLTest<RedWineFeatures, Integer>{ 
	
	@TestSetContainer(
		inputTypeName = "RedWineFeatures",
		outputTypeName = "Integer")
	public TestPool<RedWineFeatures, Integer> tSuite = testSuite;
 
	@MakeSeed
	public void ResetTestSuite(){
		numTestRuns = 0; 
		List<TestCase> toBeRemoved = new ArrayList<TestCase>();
		for (TestCase<RedWineFeatures, Integer> x: testSuite.testSet) {
			toBeRemoved.add(x);
		}
		for (TestCase<RedWineFeatures, Integer> x:toBeRemoved) {
			testSuite.removeAllTestCases(toBeRemoved);
		}
		tSuite.testSet = testSuite.testSet; 
	}
	
	@MakeSeed
	public void GenerateRandomTestCases(){	
		Random randomGenerator = new Random();
		TestCase<RedWineFeatures, Integer> tc;
		for (int i=0; i<100;i++){
			tc = new TestCase<RedWineFeatures, Integer>();
			RedWineFeatures rw = new RedWineFeatures();
			rw.fixedAcidity = randomGenerator.nextDouble()*12 +4.0;
			rw.volatileAcidity = randomGenerator.nextDouble()*2;
			rw.citricAcid = randomGenerator.nextDouble()*2;
			rw.residualSugar = randomGenerator.nextDouble()*16;
			rw.chlorides = randomGenerator.nextDouble();
			rw.freeSulfurDioxide = randomGenerator.nextDouble()*100;
			rw.totalSulfurDioxide = randomGenerator.nextDouble()*300;
			rw.density = randomGenerator.nextDouble()*2;
			rw.pH = randomGenerator.nextDouble()*3+2;
			rw.sulphates = randomGenerator.nextDouble()*3;
			rw.alcohol = randomGenerator.nextDouble()*10+8;
			tc.input = rw;
			tc.setFeature(TestDataFeature.original);
			tc.setType("Random");
			testSuite.addTestCase(tc);
		}
	}
	
	@MakeSeed
	public void Select100RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 100;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select200RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 200;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select300RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 300;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}

	@MakeSeed
	public void Select400RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 400;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select500RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 500;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select600RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 600;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select700RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 700;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select800RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 800;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select900RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 900;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void Select1000RandomTestCases(){
		Random randomGenerator = new Random();
		int targetSize = 1000;
		while (tSuite.testSet.size() > targetSize) {
			int RandomIndex = randomGenerator.nextInt(tSuite.testSet.size()-1);
			testSuite.testSet.remove(RandomIndex);
		}
	}
	
	@MakeSeed
	public void readTestCaseInputsFromCSVFile(){
		RedWineFeatures rw;
		TestCase<RedWineFeatures, Integer> tc;
		String directory = System.getProperty("user.dir");
		JFileChooser fileChooser = new JFileChooser(directory);
		String fileName;
		File file; 
		if (fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			fileName = file.getName();
		}else {
			return; 
		};
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			return;
		};
		BufferedReader reader = new BufferedReader(fileReader);
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				tc = new TestCase<RedWineFeatures, Integer>();;
				rw = new RedWineFeatures();
				String[] numStrs = line.split(",");
				rw.fixedAcidity = Double.valueOf(numStrs[0]); 
				rw.volatileAcidity = Double.valueOf(numStrs[1]); 
				rw.citricAcid = Double.valueOf(numStrs[2]);
				rw.residualSugar = Double.valueOf(numStrs[3]);
				rw.chlorides = Double.valueOf(numStrs[4]);
				rw.freeSulfurDioxide = Double.valueOf(numStrs[5]);
				rw.totalSulfurDioxide = Double.valueOf(numStrs[6]);
				rw.density = Double.valueOf(numStrs[7]);
				rw.pH = Double.valueOf(numStrs[8]);
				rw.sulphates = Double.valueOf(numStrs[9]);
				rw.alcohol = Double.valueOf(numStrs[10]);
				tc.input = rw;
				tc.setFeature(TestDataFeature.original);
				tc.setType("fromFile");
				testSuite.addTestCase(tc);
			}
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println("Error in reading file.");
			return;
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	@MakeSeed
	public void readTestCasesFromCSVFile(){
		RedWineFeatures rw;
		TestCase<RedWineFeatures, Integer> tc;
		String directory = System.getProperty("user.dir");
		JFileChooser fileChooser = new JFileChooser(directory);
		String fileName;
		File file; 
		if (fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			fileName = file.getName();
		}else {
			return; 
		};
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			return;
		};
		BufferedReader reader = new BufferedReader(fileReader);
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				tc = new TestCase<RedWineFeatures, Integer>();;
				rw = new RedWineFeatures();
				String[] numStrs = line.split(",");
				rw.fixedAcidity = Double.valueOf(numStrs[0]); 
				rw.volatileAcidity = Double.valueOf(numStrs[1]); 
				rw.citricAcid = Double.valueOf(numStrs[2]);
				rw.residualSugar = Double.valueOf(numStrs[3]);
				rw.chlorides = Double.valueOf(numStrs[4]);
				rw.freeSulfurDioxide = Double.valueOf(numStrs[5]);
				rw.totalSulfurDioxide = Double.valueOf(numStrs[6]);
				rw.density = Double.valueOf(numStrs[7]);
				rw.pH = Double.valueOf(numStrs[8]);
				rw.sulphates = Double.valueOf(numStrs[9]);
				rw.alcohol = Double.valueOf(numStrs[10]);
				tc.input = rw;
				tc.output = Integer.valueOf(numStrs[11]);
				tc.setFeature(TestDataFeature.original);
				tc.setType("fromFile");
				testSuite.addTestCase(tc);
			}
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println("Error in reading file.");
			return;
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	@Datamorphism
	public TestCase<RedWineFeatures, Integer> fixedAcidityUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity + 0.6; 
		if (rw.fixedAcidity>16) {rw.fixedAcidity = 16;};
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> fixedAcidityDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity - 0.6; 
		if (rw.fixedAcidity<4) {rw.fixedAcidity = 4;};
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input=rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> volatileAcidityUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity + 0.1; 
		if (rw.volatileAcidity>2) {rw.volatileAcidity = 2;};
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw; 
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> volatileAcidityDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity - 0.1; 
		if (rw.volatileAcidity<0) {rw.volatileAcidity = 0;};
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> citricAcidUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid + 0.1;
		if (rw.citricAcid>2) {rw.citricAcid = 2;};
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> citricAcidDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid - 0.1;
		if (rw.citricAcid<0) {rw.citricAcid = 0;}
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> residualSugarUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar + 0.8;
		if (rw.residualSugar>16) {rw.residualSugar = 16;};
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> residualSugarDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar - 0.8;
		if (rw.residualSugar<0) {rw.residualSugar=0;};
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> chloridesUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides + 0.05;
		if (rw.chlorides>1) {rw.chlorides=1;};
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> chloridesDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides - 0.05;
		if(rw.chlorides<0) {rw.chlorides=0;};
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> freeSulfurDioxideUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide + 5;
		if (rw.freeSulfurDioxide>100) {rw.freeSulfurDioxide=100;};
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> freeSulfurDioxideDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide - 5;
		if(rw.freeSulfurDioxide<0) {rw.freeSulfurDioxide = 0;};
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> totalSulfurDioxideUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide + 15;
		if (rw.totalSulfurDioxide>300) {rw.totalSulfurDioxide = 300;};
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}

	@Datamorphism
	public TestCase<RedWineFeatures, Integer> totalSulfurDioxideDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide - 15;
		if (rw.totalSulfurDioxide<0) {rw.totalSulfurDioxide=0;};
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> densityUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density + 0.1;
		if (rw.density>2) {rw.density = 2;};
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> densityDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density - 0.1;
		if (rw.density<0) {rw.density=0;};
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> pHUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH + 0.15;
		if (rw.pH>5) {rw.pH=5;};
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> pHDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH - 0.15;
		if (rw.pH<2) {rw.pH=2;};
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> sulphateslUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates + 0.15;
		if (rw.sulphates>3) {rw.sulphates=3;};
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> sulphateslDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates - 0.15;
		if (rw.sulphates<0) {rw.sulphates=0;};
		rw.alcohol = seed.input.alcohol;
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> alcoholUp (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol+0.5;
		if (rw.alcohol>18) {rw.alcohol=18;};
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> alcoholDown (TestCase<RedWineFeatures,Integer> seed){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = seed.input.fixedAcidity; 
		rw.volatileAcidity = seed.input.volatileAcidity; 
		rw.citricAcid = seed.input.citricAcid;
		rw.residualSugar = seed.input.residualSugar;
		rw.chlorides = seed.input.chlorides;
		rw.freeSulfurDioxide = seed.input.freeSulfurDioxide;
		rw.totalSulfurDioxide = seed.input.totalSulfurDioxide;
		rw.density = seed.input.density;
		rw.pH = seed.input.pH;
		rw.sulphates = seed.input.sulphates;
		rw.alcohol = seed.input.alcohol-0.5;
		if (rw.alcohol<8) {rw.alcohol=8;};
		mutant.input = rw;
		return mutant ;
	}
	
	@Datamorphism
	public TestCase<RedWineFeatures, Integer> mid (
				TestCase<RedWineFeatures,Integer> seed1, 
				TestCase<RedWineFeatures,Integer> seed2){
		TestCase<RedWineFeatures, Integer> mutant = new TestCase<RedWineFeatures, Integer>();
		RedWineFeatures rw = new RedWineFeatures();
		rw.fixedAcidity = (seed1.input.fixedAcidity + seed2.input.fixedAcidity)/2; 
		rw.volatileAcidity = (seed1.input.volatileAcidity + seed2.input.volatileAcidity)/2; 
		rw.citricAcid = (seed1.input.citricAcid + seed2.input.citricAcid)/2;
		rw.residualSugar = (seed1.input.residualSugar + seed2.input.residualSugar)/2;
		rw.chlorides = (seed1.input.chlorides + seed2.input.chlorides)/2;
		rw.freeSulfurDioxide = (seed1.input.freeSulfurDioxide + seed2.input.freeSulfurDioxide)/2;
		rw.totalSulfurDioxide = (seed1.input.totalSulfurDioxide + seed2.input.freeSulfurDioxide)/2;
		rw.density = (seed1.input.density + seed2.input.density)/2;
		rw.pH = (seed1.input.pH + seed2.input.pH)/2;
		rw.sulphates = (seed1.input.sulphates + seed2.input.sulphates)/2;
		rw.alcohol = (seed1.input.alcohol+seed2.input.alcohol)/2;
		mutant.input = rw;
		return mutant ;
	}

//	@Override
	public double distance(TestCase<RedWineFeatures, Integer> x, TestCase<RedWineFeatures, Integer> y) {
			double dist = 0; 
			dist += Math.abs(x.input.fixedAcidity - y.input.fixedAcidity); 
			dist += Math.abs(x.input.volatileAcidity - y.input.volatileAcidity); 
			dist += Math.abs(x.input.citricAcid - y.input.citricAcid); 
			dist += Math.abs(x.input.residualSugar - y.input.residualSugar); 
			dist += Math.abs(x.input.chlorides - y.input.chlorides); 
			dist += Math.abs(x.input.freeSulfurDioxide - y.input.freeSulfurDioxide); 
			dist += Math.abs(x.input.totalSulfurDioxide - y.input.totalSulfurDioxide); 
			dist += Math.abs(x.input.density - y.input.density); 
			dist += Math.abs(x.input.pH - y.input.pH); 
			dist += Math.abs(x.input.sulphates - y.input.sulphates); 
			dist += Math.abs(x.input.alcohol - y.input.alcohol); 
			return dist;
	}
}

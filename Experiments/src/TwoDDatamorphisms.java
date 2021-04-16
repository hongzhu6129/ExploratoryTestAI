package ClassifierExperiments;

import morphy.annotations.Datamorphism;
import morphy.annotations.TestCase;

public class TwoDDatamorphisms {
	
	@Datamorphism
	public TestCase<TwoD, Colour> upward(TestCase<TwoD, Colour> seed){
		TestCase<TwoD, Colour> mutant = new TestCase<TwoD,Colour>();
		TwoD point = new TwoD(seed.input.x, seed.input.y + 0.2);
		mutant.input = point; 
		return mutant;
	}
	
	@Datamorphism
	public TestCase<TwoD, Colour> downward(TestCase<TwoD, Colour> seed){
		TestCase<TwoD, Colour> mutant = new TestCase<TwoD,Colour>();
		TwoD point = new TwoD(seed.input.x, seed.input.y - 0.2);
		mutant.input = point;  
		return mutant;
	}
	
	@Datamorphism
	public TestCase<TwoD, Colour> leftward(TestCase<TwoD, Colour> seed){
		TestCase<TwoD, Colour> mutant = new TestCase<TwoD,Colour>();
		TwoD point = new TwoD(seed.input.x-0.2, seed.input.y);
		mutant.input = point; 
		return mutant;
	}
	
	@Datamorphism
	public TestCase<TwoD, Colour> rightward(TestCase<TwoD, Colour> seed){
		TestCase<TwoD, Colour> mutant = new TestCase<TwoD,Colour>();
		TwoD point = new TwoD(seed.input.x+0.2, seed.input.y);
		mutant.input = point; 
		return mutant;
	}
	
	@Datamorphism(filter = "TooClose")
	public TestCase<TwoD, Colour> mid(TestCase<TwoD, Colour> x1, TestCase<TwoD, Colour> x2){
		TestCase<TwoD, Colour> mutant = new TestCase<TwoD, Colour>();
		TwoD point = new TwoD((x1.input.x + x2.input.x)/2, (x1.input.y + x2.input.y)/2);
		mutant.input = point; 
		return mutant;
	}
}

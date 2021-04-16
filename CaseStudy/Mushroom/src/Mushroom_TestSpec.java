package Mushroom;

import morphy.annotations.*;  

public class Mushroom_TestSpec extends MushroomMorphisms {
	 
	@TestExecuter
	public Integer execute(MushroomValue x) {
		String arguements = "";
		for (int i=0; i<22; i++) {
			arguements = arguements + "," + x.value[i];
		}
		arguements = arguements.substring(1); 
		String result;
		try { 
			result = invoker.invokeModel(arguements);
		} catch (Exception e) {
			System.out.println("Failed to invoke Python script on parameters: " + arguements);
//			e.printStackTrace();
			return -1;
		}
		System.out.print("."); 
		int mushroomClass = Integer.valueOf(result);
		numTestRuns++; 
		return mushroomClass;
	}
	
	@Analyser
	public void saveMessageHead() {
		SaveExpResults saver = new SaveExpResults();
		saver.saveData("Mushroom Edibility,#Runs, #Test Cases, #Original TC, #Mutants, RunsMutant");
	}
	
}

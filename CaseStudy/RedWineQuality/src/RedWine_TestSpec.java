package RedWineQuality;

import morphy.annotations.*;  

public class RedWine_TestSpec extends RedWineMorphisms {
	@TestExecuter
	public Integer execute(RedWineFeatures x) {
		String arguements = x.fixedAcidity +"," 
				+ x.volatileAcidity +"," 
				+ x.citricAcid + ","
				+ x.residualSugar + ","
				+ x.chlorides +","
				+ x.freeSulfurDioxide +","
				+ x.totalSulfurDioxide + ","
				+ x.density + ","
				+ x.pH +","
				+ x.sulphates + ","
				+ x.alcohol;
		String result;
		try { 
			result = invoker.invokeModel(arguements); 
		} catch (Exception e) {
			System.out.println("Failed to invoke Python script on parameters: " + arguements);
//			e.printStackTrace();
			return -1;
		}
		System.out.print(".");
		int quality = Integer.valueOf(result);
		numTestRuns++; 
		return quality;
	}
	
	@Analyser
	public void saveMessageHead() {
		SaveExpResults saver = new SaveExpResults();
		saver.saveData("Red Wine Quality,#Runs, #Test Cases, #Original TC, #Mutants, RunsMutant");
	}

}

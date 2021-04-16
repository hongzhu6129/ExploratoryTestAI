package ClassifierExperiments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import morphy.annotations.TestCase;
import morphy.annotations.TestPool;

public class SampleSaver {

	public static String userDirectory = System.getProperty("user.dir");
	public String fileName;
	public File sampleDataFile;
	
	public SampleSaver(String fname) {
		fileName = fname;
		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("-E-yyyy-MM-dd-hh-mm");
	      String fileID = ft.format(dNow);
	      sampleDataFile = new File(userDirectory + File.separator + fileName + fileID +".csv");
	}

	public void saveTestData(TestPool<TwoD, Colour> testSuite) {
		FileWriter fileWriter;
		PrintWriter printWriter;  
		try {
			fileWriter = new FileWriter(sampleDataFile, false);
			printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
			System.out.println("-- Failed to create file to save the test suite.");
			System.out.println("\tReason: "+ e.getCause());
			return;
		};
		printWriter.println("x,y,colour");
		for(TestCase<TwoD, Colour> tc: testSuite.testSet) {
			String line = tc.input.x +"," + tc.input.y + "," + tc.output.toString();
			printWriter.println(line);
		}
		printWriter.close();
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}

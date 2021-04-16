package Mushroom;
 
import java.io.IOException;
import javax.swing.JFileChooser;
import morphy.annotations.Analyser;
import morphy.annotations.TestCase;
import morphy.annotations.TestDataFeature;
import morphy.annotations.TestPool;

public abstract class MushroomMLTest<inType, outType> {

	public TestPool<inType, outType> testSuite = new TestPool<inType, outType>();
		
	public ModelInvoker invoker;
	public PyFileFilter filter;
	public String pyScriptFileName = "";
	
	@Analyser
	public void start_Invoker() {
		JFileChooser fileChooser = new JFileChooser("C:\\Morphy\\Mushroom\\PyScripts");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filter = new PyFileFilter();
		fileChooser.addChoosableFileFilter(filter);
		fileChooser.showOpenDialog(null);
		pyScriptFileName = fileChooser.getSelectedFile().getName();
		String pyScriptFileNameFull = fileChooser.getSelectedFile().getAbsolutePath();
		try {
			System.out.println("Selected file="+ pyScriptFileNameFull);
			invoker = new ModelInvoker(pyScriptFileNameFull);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_DT_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeDTModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_DT2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeDT2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_HV_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeHVModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_HV2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeHV2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_KNN_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeKNNModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_KNN2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeKNN2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_LR_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeLRModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_LR2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeLR2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_NB_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeNBModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_NB2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeNB2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_RF_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeRFModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_RF2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeRF2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_Stack_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeStackModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_Stack2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeStack2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_Stack3_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeStack3Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_SV_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeSVModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_SV2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeSV2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_SVM_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeSVMModel.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void start_SVM2_Invoker() {
		pyScriptFileName = "C:\\Morphy\\Mushroom\\PyScripts\\InvokeSVM2Model.py";
		try {
			System.out.println("Selected file="+ pyScriptFileName);
			invoker = new ModelInvoker(pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to start Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	@Analyser
	public void stop_Invoker() {
		try {
			String result = invoker.invokeModel("");
			System.out.println(result + pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to stop Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
	public int numTestRuns = 0; 
	
	@Analyser
	public void saveStatistics() {
		SaveExpResults saver = new SaveExpResults();
		int numTC = testSuite.testSet.size();
		int numOriginalTC = 0;
		int numMutantTC = 0;
		for (TestCase x : testSuite.testSet) {
			if (x.feature == TestDataFeature.original) { 
				numOriginalTC++;
			}else {
				numMutantTC++;
			};
		};
		saver.saveData(","+numTestRuns+","+numTC+","+numOriginalTC+","+numMutantTC);
	}
}

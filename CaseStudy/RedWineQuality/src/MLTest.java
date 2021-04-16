package RedWineQuality;

import java.io.IOException;
import morphy.annotations.Analyser;
import morphy.annotations.TestCase;
import morphy.annotations.TestDataFeature;
import morphy.annotations.TestPool;

public abstract class MLTest<inType, outType> {
	public int numTestRuns = 0; 
	public TestPool<inType, outType> testSuite = new TestPool<inType, outType>();
	public ModelInvoker invoker;
	public PyFileFilter filter;
	public String pyScriptFileName = "";
	
	@Analyser
	public void start_DT_Invoker() {
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeDTModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeDT2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeHVModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeHV2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeKNNModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeKNN2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeLRModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeLR2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeNBModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeNB2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeRFModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeRF2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeStackModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeStack2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeStack3Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeSVModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeSV2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeSVMModel.py";
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
		pyScriptFileName = "C:\\Morphy\\RedWineQuality\\PyScripts\\InvokeSVM2Model.py";
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
			if (result ==null) {result = "Python script stopped: ";}
			System.out.println(result + pyScriptFileName);
		} catch (IOException e) {
			System.out.println("Failed to stop Python script "+ pyScriptFileName);
//			e.printStackTrace();
		}
	}
	
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

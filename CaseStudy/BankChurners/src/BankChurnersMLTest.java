package BankChurners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import morphy.annotations.Analyser;
import morphy.annotations.Metamorphism;
import morphy.annotations.TestCase;
import morphy.annotations.TestDataFeature;
import morphy.annotations.TestExecuter;
import morphy.annotations.TestPool;
import morphy.annotations.TestSetContainer;

public abstract class BankChurnersMLTest<inType, outType> {

	public TestPool<inType, outType> testSuite = new TestPool<inType, outType>();
		
	public ModelInvoker invoker;
	public PyFileFilter filter;
	public String pyScriptFileName = "";
	
	@Analyser
	public void start_Invoker() {
		JFileChooser fileChooser = new JFileChooser("C:\\Morphy\\BankChurners\\PyScripts");
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeDTModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeDT2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeHVModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeHV2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeKNNModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeKNN2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeLRModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeLR2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeNBModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeNB2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeRFModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeRF2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeStackModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeStack2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeStack3Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeSVModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeSV2Model.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeSVMModel.py";
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
		pyScriptFileName = "C:\\Morphy\\BankChurners\\PyScripts\\InvokeSVM2Model.py";
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

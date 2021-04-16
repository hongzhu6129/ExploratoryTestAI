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
import javax.swing.filechooser.FileFilter;

import morphy.annotations.*;  

public class BankChurners_TestSpec extends BankChurnersMorphisms {
	
	@TestExecuter
	public Integer execute(BankChurnersValue x) {
		String arguements = "";
		for (int i=0; i<=4; i++) {
			arguements += "," + x.discValue[i];
		}
		for (int i=0; i<=10; i++) {
			arguements += "," + x.intValue[i];
		}
		for (int i=0; i<=2; i++) {
			arguements += "," + x.realValue[i];
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
		int customerAttrite = Integer.valueOf(result);
		numTestRuns++; 
		return customerAttrite;
	}
	
	@Analyser
	public void saveMessageHead() {
		SaveExpResults saver = new SaveExpResults();
		saver.saveData("Bank Churners,#Runs, #Test Cases, #Original TC, #Mutants, RunsMutant");
	}
}

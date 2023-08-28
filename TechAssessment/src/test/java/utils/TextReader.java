package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
	
	public StringBuffer readTextFile(String textfilepath)  {
		
		StringBuffer readFile = new StringBuffer();
	
		
		BufferedReader objReader = null;
		  try {
		   String strCurrentLine;

		   objReader = new BufferedReader(new FileReader(textfilepath));

		   while ((strCurrentLine = objReader.readLine()) != null) {
			   
			   readFile.append(strCurrentLine);

		   }

		  } catch (IOException e) {

		   e.printStackTrace();

		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  }
		  return readFile;
		
	}
	
public static void main(String[] args) {
	TextReader tr= new TextReader();
	StringBuffer readFile = new StringBuffer();
	readFile =tr.readTextFile("/Users/seshadrivishwanatham/eclipse-workspace/TechAssessment/src/test/resources/reqTemplate/createUser");
	System.out.println(readFile);
}
}

package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import utils.CSVHandling;
import utils.CSVbindInstrumentDetails;
import utils.CSVbindPositionDetails;
import utils.CSVbindPositionReport;

public class DataLoad {
	
	public static String projectPath= System.getProperty("user.dir");
	public static String inputfilepath1="/src/test/resources/app/in/InstrumentDetails.csv";
	public static String inputfilepath2="/src/test/resources/app/in/PositionDetails.csv";
	public static String output= "/src/test/resources/app/out/PositionReport.csv";
	
	
	public static void main(String[] args) throws IllegalStateException, IOException {
		
	
	
	CSVHandling csv= new CSVHandling();
	
	CSVbindInstrumentDetails inputFileData1=csv.csvReaderInputfile1(projectPath+inputfilepath1);
	CSVbindPositionDetails inputFileData2=csv.csvReaderInputfile2(projectPath+inputfilepath2);
	

	
	// Sceanrios
	System.out.println(inputFileData2.getID());
	
	int quantity= Integer.parseInt(inputFileData2.getQuantity());
	int unitprice= Integer.parseInt(inputFileData1.getUnitPrice()) ;
	int TotalPriceValue= quantity*unitprice;

	
	csv.writeCSVData(projectPath+output,"301",inputFileData2.getID(),inputFileData1.getISIN(),inputFileData2.getQuantity(),Integer.toString(TotalPriceValue));
	
	System.out.println("DataValidationDone");
	

}
}
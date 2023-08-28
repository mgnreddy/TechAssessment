package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class CSVHandling {

//	public static String projectPath = System.getProperty("user.dir");
//	public static String inputfilepath1 = "/src/test/resources/app/in/InstrumentDetails.csv";
//	public static String inputfilepath2 = "/src/test/resources/app/in/PositionDetails.csv";
//	public static String output = "/src/test/resources/app/out/PositionReport.csv";
//
//	public void readCSVData() throws CsvValidationException, IOException {
//
//		CSVReader reader = new CSVReader(new FileReader(projectPath + inputfilepath1));
//
//		// reading the data from the CSV file
//
//		StringBuffer buffer = new StringBuffer();
//		String[] data;
//
//		while ((data = reader.readNext()) != null) {
//
//			for (int i = 0; i < data.length; i++) {
//
//				System.out.print(data[i] + " ");
//
//			}
//			System.out.println();
//
//		}
//
//	}
//
	public void writeCSVData(String filepath,String ID,String PositionID,String ISIN, String Quantity,String totalPrice) throws IOException {

		CSVWriter write = new CSVWriter(new FileWriter(filepath));

		// Write data in to CSV

		String set1[] = { "ID", "PositionID", "ISIN", "Quantity", "Total Price" };
		String set2[] = { ID, PositionID, ISIN, Quantity, totalPrice };

		write.writeNext(set1);
		write.writeNext(set2);

		write.flush();

		System.out.println("Data Entered");

	}

	public CSVbindInstrumentDetails csvReaderInputfile1(String Filepath)
			throws IllegalStateException, FileNotFoundException {

		List<CSVbindInstrumentDetails> CSVbeanReader = new CsvToBeanBuilder(new FileReader(Filepath))
				.withType(CSVbindInstrumentDetails.class).build().parse();

	
		CSVbindInstrumentDetails instrumental = null;

		for (CSVbindInstrumentDetails instrumental1 : CSVbeanReader) {

			instrumental = instrumental1;

		}
		return instrumental;

	}

	public CSVbindPositionDetails csvReaderInputfile2(String Filepath)
			throws IllegalStateException, FileNotFoundException {

		List<CSVbindPositionDetails> CSVbeanReader = new CsvToBeanBuilder(new FileReader(Filepath))
				.withType(CSVbindPositionDetails.class).build().parse();

	
		CSVbindPositionDetails instrumental = null;

		for (CSVbindPositionDetails instrumental1 : CSVbeanReader) {

			instrumental = instrumental1;

		}
		return instrumental;

	}

	public CSVbindPositionReport csvReaderOutputFile(String Filepath)
			throws IllegalStateException, FileNotFoundException {

		List<CSVbindPositionReport> CSVbeanReader = new CsvToBeanBuilder(new FileReader(Filepath))
				.withType(CSVbindPositionReport.class).build().parse();

		CSVbindPositionReport instrumental = null;

		for (CSVbindPositionReport instrumental1 : CSVbeanReader) {

			instrumental = instrumental1;

		}
		return instrumental;

	}

	

}

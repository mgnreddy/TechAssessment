package utils;

import com.opencsv.bean.CsvBindByName;

public class CSVbindPositionDetails {
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getInstrumentID() {
		return InstrumentID;
	}

	public void setInstrumentID(String instrumentID) {
		InstrumentID = instrumentID;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	@CsvBindByName(column = "ID")
	private String ID;

	@CsvBindByName(column = "Instrument ID")
	private String InstrumentID;
	
	@CsvBindByName(column = "Quantity")
	private String Quantity;
	
	
 
}

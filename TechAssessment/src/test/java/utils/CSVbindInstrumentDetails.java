package utils;

import com.opencsv.bean.CsvBindByName;

public class CSVbindInstrumentDetails {
	
@CsvBindByName(column = "ID")
private String ID;

@CsvBindByName(column = "Name")
private String Name;

@CsvBindByName(column = "ISIN")
private String ISIN;

@CsvBindByName(column = "Unit Price")
private String UnitPrice;

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String getName() {
	return Name;
}

public String setName(String name) {
	return Name = name;
}

public String getISIN() {
	return ISIN;
}

public void setISIN(String iSIN) {
	ISIN = iSIN;
}

public String getUnitPrice() {
	return UnitPrice;
}

public void setUnitPrice(String unitPrice) {
	UnitPrice = unitPrice;
}

	
	

}

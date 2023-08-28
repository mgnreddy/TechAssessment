package utils;

import com.opencsv.bean.CsvBindByName;

public class CSVbindPositionReport {
	
	

@CsvBindByName(column = "ID")
private String ID;

public String getID() {
	return ID;
}

public String setID(String iD) {
	return ID = iD;
}

public String getPositionID() {
	return PositionID;
}

public String setPositionID(String positionID) {
	return PositionID = positionID;
}

public String getISIN() {
	return ISIN;
}

public String setISIN(String iSIN) {
	return ISIN = iSIN;
}

public String getQuantity() {
	return Quantity;
}

public String setQuantity(String quantity) {
	return Quantity = quantity;
}

public String getTotalPrice() {
	return TotalPrice;
}

public String setTotalPrice(String totalPrice) {
	return TotalPrice = totalPrice;
}

@CsvBindByName(column = "Position ID")	
private String PositionID;

@CsvBindByName(column = "ISIN")	
private String ISIN;

@CsvBindByName(column = "Quantity")	
private String Quantity;

@CsvBindByName(column = "TotalPrice")	
private String TotalPrice;

}

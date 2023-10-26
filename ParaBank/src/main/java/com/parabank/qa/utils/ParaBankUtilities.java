package com.parabank.qa.utils;

import java.util.Date;

public class ParaBankUtilities {
	static Date date;

public static String generateEmailWithTimeStamp() {
		
		date = new Date();
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "dheeruvish"+timestamp+"0161";
	}

public static String generateStringWithTimeStamp() {
	date = new Date();
	String timestamp = date.toString().replace(" ","_").replace(":","_");
	return timestamp;
}


}

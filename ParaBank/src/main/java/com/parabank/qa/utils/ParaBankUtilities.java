package com.parabank.qa.utils;

import java.util.Date;
import java.util.Random;

public class ParaBankUtilities {
	static Date date;

	public static String generateUniqueEmail() {

		String constantPart = "dheerendra";
		String constantPart1 = "@gmail.com";
		int randomPart = new Random().nextInt(1000); // Change the range as needed
		return constantPart + randomPart + constantPart1;
	}

	public static String generateUniqueUsername() {
		String constantPart = "dheerendra";
		int randomPart = new Random().nextInt(1000); // Change the range as needed
		return constantPart + randomPart;
	}
	
	public static String generateUniqueMobile() {
		String constantPart = "8750170";
		int randomPart = new Random().nextInt(1000); // Change the range as needed
		return constantPart + randomPart;
	}
	

}

package com.genericUtilities;

import java.util.Date;

public class Java_Utility {

	public static String getCurrentTime() {
		
		return new Date().toString().replace(' ', '_').replace(':', '_');
	}
}
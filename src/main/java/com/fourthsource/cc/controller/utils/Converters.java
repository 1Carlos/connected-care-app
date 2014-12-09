package com.fourthsource.cc.controller.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converters {

	public static Date String2Date (String cDate){

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		Date dDate = null;
		try {
			dDate = formatoDelTexto.parse(cDate);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		
		return dDate;
	}
	
}

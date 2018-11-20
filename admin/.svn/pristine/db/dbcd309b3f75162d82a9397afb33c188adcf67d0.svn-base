package com.lottery.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatUtil {

	public static String formatDateTime(Date dateValue) {
		if(dateValue!=null) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String result = sdf1.format(dateValue) + "T" + sdf2.format(dateValue);
		return result;
		}else {
			return "";
		}
	}
	
	public static String formatDateTime(Date dateValue,String formate) {
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		
		 return dateValue==null?"":sdf.format(dateValue);

	}
	
	public static Date formatDateTime(String dateValue,String formate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		if (dateValue==null||dateValue=="") {
			return null;
		}else {
		return sdf.parse(dateValue);
		}
	}
	
	public static void main(String[] args) throws Exception {
	Date time = DateFomatUtil.formatDateTime("2018-08-16 02:02:00", "yyyy-MM-dd HH:mm:ss");
	System.out.println(time);
	}

}

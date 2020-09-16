package com.java.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


public class StringToDateConverter implements Converter<String, Date>{

	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			if(arg0!=null){
				Date mydate=sdf.parse(arg0);
				return mydate;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

}

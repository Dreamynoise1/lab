package com.zfang.typeconvert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class CustomDateConvert extends StrutsTypeConverter {
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		SimpleDateFormat[] sdfs = { new SimpleDateFormat("yyyyMMdd"), new SimpleDateFormat("yyyy/MM/dd"),
				new SimpleDateFormat("yyyy,MM,dd"), new SimpleDateFormat("yyyy-MM-dd") };
		String strDate = values[0];
		Date birthday = null;
		for (int i = 0; i < sdfs.length; i++) {
			try {
				birthday = sdfs[i].parse(strDate);
				return birthday;
			} catch (ParseException e) {
				continue;
			}
		}
		throw new TypeConversionException();
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
}
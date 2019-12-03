package com.zfang.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class AgeValidator extends FieldValidatorSupport{

	@Override
	public void validate(Object obj) throws ValidationException {
		String name = getFieldName();
		Object value = getFieldValue(name, obj);
		if(value instanceof Integer){
			int ageValue = (int)value;
			if( ageValue <= 0){
				addFieldError(name, obj);
			}
		}else{
			addFieldError(name, obj);
		}
	}

}

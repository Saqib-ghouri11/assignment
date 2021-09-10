package com.example.assignment.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator  implements ConstraintValidator<PhoneNumber, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	
		if(!value.isEmpty() && value.matches(RegexPatterns.PHONE_NUMBER_REGEX))
		{
			return true;
		}
		return false;
	}

}

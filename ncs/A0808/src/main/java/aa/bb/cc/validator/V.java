package aa.bb.cc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import aa.bb.cc.beans.member;

public class V implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return member.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"phone","error1");
		member m = (member) target;
		
		String str=m.getPhone();
		if(str.contains("-")==false) {
			errors.rejectValue("phone", "error2");
		}
	}

}

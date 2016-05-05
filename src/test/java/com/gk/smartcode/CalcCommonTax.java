package com.gk.smartcode;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.data.Person;

public class CalcCommonTax extends AbstractActivity {
	
	@Override
	public void run(Context context) {
		Person person = (Person)context.getData(ComponentTest.KEY_PERSON);
		person.setTax(100.00);
	}

}

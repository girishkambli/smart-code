package com.gk.smartcode;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.data.Person;

public class PopulateAge implements Component {

	@Override
	public void execute(Context context) {
		Person person = (Person)context.getData(ComponentTest.KEY_PERSON);
		person.setAge(34);
	}

}

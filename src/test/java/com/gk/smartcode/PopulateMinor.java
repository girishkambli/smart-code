package com.gk.smartcode;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.data.Person;

public class PopulateMinor extends AbstractActivity {

	@Override
	public void run(Context context) {
		Person person = (Person)context.getData(ComponentTest.KEY_PERSON);
		person.setMinor(true);
	}
}

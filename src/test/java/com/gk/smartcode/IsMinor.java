package com.gk.smartcode;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.data.Person;

public class IsMinor extends AbstractDecision {
	
	public IsMinor(Component yesC, Component noC) {
		super(yesC, noC);
	}

	@Override
	public boolean decide(Context context) {
		Person person = (Person)context.getData(ComponentTest.KEY_PERSON);
		return person.getAge() > 18;
	}


}

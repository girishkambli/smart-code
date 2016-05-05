package com.gk.smartcode;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.data.Person;
import com.gk.smartcode.data.State;

public class GetTaxCalc extends MultiChoice {

	public GetTaxCalc() {
		choices.put(State.MH, new CalcTaxForMH());
		choices.put(State.BH, new CalcCommonTax());
	}
	
	@Override
	public State select(Context context) {
		 Person person = (Person)context.getData(ComponentTest.KEY_PERSON);
		 return person.getState();
	}

}

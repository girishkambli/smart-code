package com.gk.smartcode;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.context.SimpleContext;
import com.gk.smartcode.data.Person;
import com.gk.smartcode.data.State;

public class ComponentTest {
	
	public static final String KEY_SERIALNO = "serialNo";
	public static final String KEY_PERSON = "person";

	@Test
	public void testSimpleActivity() {
		Context context = new SimpleContext();
		String key = KEY_SERIALNO;
		Integer value = new Integer(20);
		context.setData(key, value);
		Component component = new IncrementActivity();
		component.execute(context);
		Integer value1 = (Integer)context.getData(key);
		Integer expected = value+1;
		assertThat("Increment activity failed. Value must be " + expected, value1 == expected);
	}
	
	@Test
	public void testMultipleActivities() {
		Context context = new SimpleContext();
		Person person = new Person();
		context.setData(KEY_PERSON, person);
		Component populateName = new PopulateName();
		populateName.execute(context);
		Component populateAge = new PopulateAge();
		populateAge.execute(context);
		assertThat(person.getName(), is("Girish"));
		assertThat(person.getAge(), is(34));
	}
	
	@Test
	public void testMultiChoiceSimple() {
		Context context = new SimpleContext();
		Person person = new Person();
		person.setState(State.MH);
		context.setData(KEY_PERSON, person);
		Component taxCalc = new GetTaxCalc();
		taxCalc.execute(context);
		assertThat(person.getTax(), is(245.00));
	}

	public void testSimpleDecision() {
		Context context = new SimpleContext();
		Person person = new Person();
		person.setAge(30);
		context.setData(KEY_PERSON, person);
		Component populateMinor = new PopulateMinor();
		Component isMinor = new IsMinor(populateMinor, null);
		isMinor.execute(context);
		assertThat(person.isMinor(), is(true));
	}

}

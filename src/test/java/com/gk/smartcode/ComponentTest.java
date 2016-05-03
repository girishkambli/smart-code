package com.gk.smartcode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.gk.smartcode.context.Context;
import com.gk.smartcode.context.SimpleContext;

public class ComponentTest {
	
	public static final String KEY_SERIALNO = "serialNo";

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

}

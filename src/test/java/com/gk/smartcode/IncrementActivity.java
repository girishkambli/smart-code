package com.gk.smartcode;

import com.gk.smartcode.context.Context;

public class IncrementActivity extends AbstractActivity {

	@Override
	public void run(Context context) {
		Integer serialNo = (Integer)context.getData(ComponentTest.KEY_SERIALNO);
		serialNo++;
		context.setData(ComponentTest.KEY_SERIALNO, serialNo);
	}

}

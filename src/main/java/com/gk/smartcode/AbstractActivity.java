package com.gk.smartcode;

import com.gk.smartcode.context.Context;

public abstract class AbstractActivity extends AbstractComponent {

	public void execute(Context context) {
		run(context);
	}
	
	public abstract void run(Context context);
	
}	

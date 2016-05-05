package com.gk.smartcode;

import java.util.HashMap;
import java.util.Map;

import com.gk.smartcode.context.Context;

public abstract class MultiChoice extends AbstractComponent {

	protected Map<Enum, Component> choices = new HashMap<>();
	
	
	@Override
	public void execute(Context context) {
		Enum selected = select(context);
		Component choice = (Component)choices.get(selected);
		if(choice != null)
			choice.execute(context);
	}

	public abstract Enum select(Context context);
}

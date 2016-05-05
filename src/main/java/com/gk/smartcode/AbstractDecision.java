package com.gk.smartcode;

import com.gk.smartcode.context.Context;

public abstract class AbstractDecision extends AbstractComponent {
	
	private Component yesComponent;
	private Component noComponent;
	
	public AbstractDecision(Component yesC, Component noC) {
		yesComponent = yesC;
		noComponent = noC;
	}
	
	@Override
	public void execute(Context context) {
		boolean result = decide(context);
		
		if(result && yesComponent != null) {
			yesComponent.execute(context);
		}
		else if(!result && noComponent != null) {
			noComponent.execute(context);
		}
	}
	
	public abstract boolean decide(Context context);
}

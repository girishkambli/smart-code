package com.gk.smartcode.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractContext implements Context {

	private Map<String, Object> container = new ConcurrentHashMap<String, Object>();
	
	public Object setData(String key, Object value) {
		return container.put(key, value);
	}

	public Object getData(String key) {
		return container.get(key);
	}

}

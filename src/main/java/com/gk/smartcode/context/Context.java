package com.gk.smartcode.context;

public interface Context {

	Object setData(String key, Object value);

	Object getData(String key);

}

package com.gk.smartcode.data;

public class Person {

	private String name;
	private Integer age;
	private boolean minor;

	public boolean isMinor() {
		return minor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setMinor(boolean b) {
		minor = b;
	}

}

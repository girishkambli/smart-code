package com.gk.smartcode.data;

public class Person {

	public double getTax() {
		return tax;
	}
	private String name;
	private Integer age;
	private double tax;
	private State state;
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

	public void setTax(double d) {
		tax = d;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}	
	public void setMinor(boolean b) {
		minor = b;
	}

}

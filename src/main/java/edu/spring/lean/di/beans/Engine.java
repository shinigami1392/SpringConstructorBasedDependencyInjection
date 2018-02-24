package edu.spring.lean.di.beans;

public class Engine {
	private String cylinderType;
	private int cylinders;
	public Engine(String cylinderType, int cylinders) {
		super();
		this.cylinderType = cylinderType;
		this.cylinders = cylinders;
	}
}

package edu.spring.demo.di.beans;

public class Professor {
	private String name;
	private String designation;
	private String officeLocation;

	public Professor(String name, String designation, String officeLocation) {
		super();
		this.name = name;
		this.designation = designation;
		this.officeLocation = officeLocation;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", designation=" + designation + ", officeLocation=" + officeLocation + "]";
	}
	
	
}

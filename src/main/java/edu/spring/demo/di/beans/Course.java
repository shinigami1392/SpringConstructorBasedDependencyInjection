package edu.spring.demo.di.beans;

import org.springframework.stereotype.Component;

@Component
public class Course {

	private Professor professor;
	private Topic topic;
	private String courseNumber;
	public Course(Professor professor, Topic topic, String courseNumber) {
		super();
		this.professor = professor;
		this.topic = topic;
		this.courseNumber = courseNumber;
	}
	@Override
	public String toString() {
		return "Course [professor=" + professor.toString() + ", topic=" + topic.toString() + ", courseNumber=" + courseNumber + "]";
	}
	
	
}

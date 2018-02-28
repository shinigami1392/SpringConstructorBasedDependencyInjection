package edu.spring.demo.di.beans;

public class Topic {
	private String topicName;
	private String major;

	public Topic(String topicName, String major) {
		super();
		this.topicName = topicName;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Topic [topic=" + topicName + ", major=" + major + "]";
	}
	
}

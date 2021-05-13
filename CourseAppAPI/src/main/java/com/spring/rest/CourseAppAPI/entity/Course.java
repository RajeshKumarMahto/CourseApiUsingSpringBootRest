package com.spring.rest.CourseAppAPI.entity;

public class Course {

	private int id;
	private String title;
	private String description;
	private String notFound = null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Course(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public Course(String notFound) {
		super();
		this.notFound = notFound;
	
	}
	
	
}

package com.spring.rest.CourseAppAPI.services;

import java.util.List;

import com.spring.rest.CourseAppAPI.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);

}

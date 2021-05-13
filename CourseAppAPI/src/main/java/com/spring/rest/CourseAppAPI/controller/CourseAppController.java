package com.spring.rest.CourseAppAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.CourseAppAPI.entity.Course;
import com.spring.rest.CourseAppAPI.services.CourseService;

@RestController
public class CourseAppController {


	@Autowired
	private CourseService courseService;
	
	//get courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//get course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
}

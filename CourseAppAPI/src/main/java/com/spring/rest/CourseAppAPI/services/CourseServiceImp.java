package com.spring.rest.CourseAppAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.CourseAppAPI.entity.Course;

@Service
public class CourseServiceImp implements CourseService {

	List<Course> list;

	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(1, "Java", "This is about Java Course"));
		list.add(new Course(2, "Sql", "This is about Sql Course"));
		list.add(new Course(3, "Python", "This is about Python Course"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c = null;

		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}

		}

		if (c == null) {
			c = new Course("Not Found");
			return c;
		} else
			return c;

	}

}

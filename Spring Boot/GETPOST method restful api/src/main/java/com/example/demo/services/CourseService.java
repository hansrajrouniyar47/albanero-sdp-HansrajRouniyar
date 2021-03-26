package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.course;

public interface CourseService {

	public List<course> getCourses();
	public course getCourseid(long courseId);
	public course addCourse(course course);
	public course editCourse(course course,Long courseId);
}

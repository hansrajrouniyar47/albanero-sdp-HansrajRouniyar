package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.course;
import com.example.demo.services.CourseService;

@RestController
public class Mycontroller {

	@Autowired
	private CourseService courseService;
//	@GetMapping("/home")
//	public String home() {
//		return "this is my home";
//	}
	
	
//	get the list of courses
	@GetMapping("/courses")
	public List<course> getCourses(){
		return this.courseService.getCourses();
	}
	public course getCourseid(@PathVariable String courseId) {
		return this.courseService.getCourseid(Long.parseLong(courseId));
	}
}

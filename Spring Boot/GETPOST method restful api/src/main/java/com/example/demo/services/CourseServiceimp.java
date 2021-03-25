package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.course;

@Service
public class CourseServiceimp implements CourseService {

	List<course> list;
	
	public CourseServiceimp() {
		list=new ArrayList<>();
		list.add(new course(145,"SQL","Richard Henson") );
		list.add(new course(200,"Java","Lord Rightson"));
		list.add(new course(678,"Spring","Atals"));
	}
	
	@Override
	public List<course> getCourses() {
		
		return list;
	}

	

	@Override
	public course getCourseid(long courseId) {
		course c=null;
		for(course cor:list) {
			if(cor.getId()==courseId) {
				c=cor;
				break;
			}
		}
		
		return c;
	}
	
	

}

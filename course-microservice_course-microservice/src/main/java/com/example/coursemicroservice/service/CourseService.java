package com.example.coursemicroservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.coursemicroservice.entity.Course;



public interface CourseService {

	Course  saveCourse(Course course);

	Course  getCourseById(Long courseId);
	
	Course  getCourseByCourseCode(String courseCode);
	
	Course updateCourse(Course course);
	
	String delete(Long courseId);
	
	List<Course> getAllCourse();
}

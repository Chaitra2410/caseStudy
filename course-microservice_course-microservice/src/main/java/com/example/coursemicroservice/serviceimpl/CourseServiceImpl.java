package com.example.coursemicroservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.coursemicroservice.entity.Course;
import com.example.coursemicroservice.repository.CourseRepository;
import com.example.coursemicroservice.service.CourseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
	
	private CourseRepository courseRepository;

	@Override
	public Course saveCourse(Course course) {	
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public Course updateCourse(Course course) {
		Course updateCourse = new Course();
			updateCourse.setCorseId(course.getCorseId());
			updateCourse.setCorseName(course.getCorseName());
			updateCourse.setStartDate(course.getStartDate());
			updateCourse.setEndDate(course.getEndDate());
			updateCourse.setCourseCode(course.getCourseCode());
		return updateCourse;
	}
	
	@Override
	public  String delete(Long courseId) {
		Course course = courseRepository.findById(courseId).get();
		courseRepository.deleteById(courseId);
		return "Course Deleted Successfully!!";
	}

	@Override
	public List<Course> getAllCourse() {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findAll().forEach(course -> courses.add(course));
		return courses;
	}

	@Override
	public Course getCourseByCourseCode(String courseCode) {	
		return courseRepository.findByCourseCode(courseCode);
	}
}

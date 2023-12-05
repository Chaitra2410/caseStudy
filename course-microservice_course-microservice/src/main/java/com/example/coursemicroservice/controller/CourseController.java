package com.example.coursemicroservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursemicroservice.entity.Course;
import com.example.coursemicroservice.service.CourseService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("api/courses")
@AllArgsConstructor
@Tag(
		name ="Course Service - CourseController",
		description="Course Controller Exposes REST API's for Course-Service")
@CrossOrigin
public class CourseController {
	
	private CourseService courseService;
	
	@Operation(summary = "Save the Rest API", description = "Post description")
	@ApiResponse(responseCode = "201", description = "201 - Created")
	@PostMapping("create")
	public  ResponseEntity<Course> saveCourse(@RequestBody Course course){
		Course savedCourse= courseService.saveCourse(course);
		return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
	}
	
	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable("id")Long courseId){
		Course course = courseService.getCourseById(courseId);
		return new ResponseEntity<>(course,HttpStatus.OK);	
	}

	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@GetMapping("course/{courseCode}")
	public ResponseEntity<Course> getCourseByCourseCode(@PathVariable("courseCode")String courseCode){
		Course courseByCode = courseService.getCourseByCourseCode(courseCode);
		return new ResponseEntity<>(courseByCode,HttpStatus.OK);	
	}
	
	@Operation(summary = "PUT  Rest API", description = "Put description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@PutMapping("update/{id}")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course){
		Course updatedCourse = courseService.updateCourse(course);
		return new ResponseEntity<>(updatedCourse,HttpStatus.OK);
	}
	
	@Operation(summary = "DELETE  Rest API", description = "Delete description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable("id")Long courseId){
		courseService.delete(courseId);	
		return new ResponseEntity<String>("Course deleted successfuly!", HttpStatus.OK);
	}
	
	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@GetMapping("/allCourses")
	private List<Course> getAllCourses() {
		return courseService.getAllCourse();
	}
	
}

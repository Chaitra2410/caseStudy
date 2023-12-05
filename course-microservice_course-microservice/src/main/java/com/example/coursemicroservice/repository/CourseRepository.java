package com.example.coursemicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursemicroservice.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	void deleteById(Long courseId);

	Course findByCourseCode(String courseCode);

}

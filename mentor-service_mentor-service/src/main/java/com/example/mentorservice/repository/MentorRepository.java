package com.example.mentorservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorservice.entity.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long>{

	

}

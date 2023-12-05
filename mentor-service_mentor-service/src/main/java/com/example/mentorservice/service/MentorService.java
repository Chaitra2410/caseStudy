package com.example.mentorservice.service;

import java.util.List;

import com.example.mentorservice.entity.Mentor;

public interface MentorService {
	
	Mentor  saveMentor(Mentor mentor);
	
	Mentor  getMentorById(Long mentorid);
	
	Mentor updateMentor(Mentor mentor);

	List<Mentor> getAllMentors();
}

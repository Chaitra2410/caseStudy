package com.example.mentorservice.srviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mentorservice.entity.Mentor;
import com.example.mentorservice.repository.MentorRepository;
import com.example.mentorservice.service.MentorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {
	
	private MentorRepository mentorRepository;

	@Override
	public Mentor saveMentor(Mentor mentor) {	
		if(mentor.getCourseCode().isEmpty()) {
			mentor.setStatus("Free");
			mentor.setCourseCode("Not Assigned");
		}
		else {
			mentor.setStatus("Occupied");	
			}
		return mentorRepository.save(mentor);
	}

	@Override
	public Mentor getMentorById(Long mentorid) {
		return mentorRepository.findById(mentorid).get();		
	}

	@Override
	public Mentor updateMentor(Mentor mentor) {
		Mentor updateMantor = new Mentor();
		updateMantor.setId(mentor.getId());
		updateMantor.setMentorName(mentor.getMentorName());
		updateMantor.setTechnology(mentor.getTechnology());
		updateMantor.setWorkingHours(mentor.getWorkingHours());
		updateMantor.setCourseCode(mentor.getCourseCode());
		updateMantor.setStatus(mentor.getStatus());
		if(mentor.getCourseCode().isEmpty()) {
			mentor.setStatus("Free");
			mentor.setCourseCode("Not Assigned");
		}else {
			mentor.setStatus("Occupied");
		}
		return updateMantor;
	}

	@Override
	public List<Mentor> getAllMentors() {
		List<Mentor> mentors = new ArrayList<Mentor>();
		mentorRepository.findAll().forEach(mentor -> mentors.add(mentor));
		return mentors;
	}
	
	

}

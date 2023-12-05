package com.example.mentorservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentorservice.entity.Mentor;
import com.example.mentorservice.service.MentorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Tag(
		name ="Mentor Service - MentorController",
		description="Mentor Controller Exposes REST API's for Mentor-Service")
@CrossOrigin
public class MentorController {

	private MentorService mentorService;
	
	@Operation(summary = "Save the Rest API", description = "Post description")
	@ApiResponse(responseCode = "201", description = "201 - Created")
	@PostMapping("create")
	public ResponseEntity<Mentor> saveMentor(@RequestBody Mentor mentor){
		Mentor savedMentor = mentorService.saveMentor(mentor);
		return new ResponseEntity<>(savedMentor,HttpStatus.CREATED);	
	}
	
	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@GetMapping("/{id}")
	public ResponseEntity<Mentor> getMentor(@PathVariable("id")Long mentorid){
		Mentor mentor = mentorService.getMentorById(mentorid);
		return new ResponseEntity<>(mentor,HttpStatus.OK);	
	}
	
	@Operation(summary = "PUT  Rest API", description = "Put description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@PutMapping("update/{id}")
	public ResponseEntity<Mentor> updateMentor(@RequestBody Mentor mentor){
		Mentor updatedMentor = mentorService.updateMentor(mentor);
		return new ResponseEntity<>(updatedMentor,HttpStatus.OK);
	}
	
	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
	@GetMapping("/allMentors")
	private List<Mentor> getAllMentors() {
		return mentorService.getAllMentors();
	}
}

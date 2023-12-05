package com.example.mentorservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	private Long corseId;

	private String corseName;

	private String startDate;

	private String endDate;

	private String courseCode;
}

package com.ashokit.ies.binding;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitizenData {
	
	private Integer caseNumber;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String planName;
	private boolean isEmployed;
	private Double income;
	private Integer kidsCount;
	private boolean isGraduate;
}

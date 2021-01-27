package com.ashokit.ies.binding;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanData {
	
	private Integer caseNumber;
	private String planName;
	private String planStatus;
	private String planStartDate;
	private String planEndDate;
	private Double benefitAmount;
	private String denialReason;
}

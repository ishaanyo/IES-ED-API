package com.ashokit.ies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.ies.binding.CitizenData;
import com.ashokit.ies.binding.PlanData;
import com.ashokit.ies.service.EligibilityService;

@RestController
public class EligibilityRestController {

	@Autowired
	EligibilityService service;

	@PostMapping("/eligibility")
	public ResponseEntity<PlanData> checkEligibility(@RequestBody CitizenData citizenData) {
		PlanData plan = service.determineEligibility(citizenData);
		return new ResponseEntity<PlanData>(plan, HttpStatus.OK);
	}
}

package com.ashokit.ies.service;

import org.springframework.stereotype.Service;

import com.ashokit.ies.binding.CitizenData;
import com.ashokit.ies.binding.PlanData;

@Service
public class EligibilityService {

	public PlanData determineEligibility(CitizenData citizenData) {

		String planName = citizenData.getPlanName();

		PlanData plan = new PlanData();
		plan.setPlanName(planName);
		plan.setCaseNumber(citizenData.getCaseNumber());

		// Business rules
		if (planName.equals("SNAP") && citizenData.isEmployed()) {
			plan.setPlanStatus("DN");
			plan.setDenialReason("Salaried Employee");
		}

		if (planName.equals("SNAP") && !citizenData.isEmployed()) {
			plan.setPlanStatus("AP");
			plan.setPlanStartDate("27-Jan-2021");
			plan.setPlanEndDate("27-Apr-2021");
			plan.setBenefitAmount(300.50);
		}

		if (planName.equals("CCAP") && citizenData.getKidsCount() <= 0) {
			plan.setPlanStatus("DN");
			plan.setDenialReason("No Childs Available");
		}

		if (planName.equals("CCAP") && citizenData.getKidsCount() >= 1) {
			plan.setPlanStatus("AP");
			plan.setPlanStartDate("27-Jan-2021");
			plan.setPlanEndDate("27-Apr-2021");
			plan.setBenefitAmount(250.50);
		}

		if (planName.equals("RIW") && !citizenData.isGraduate()) {
			plan.setPlanStatus("DN");
			plan.setDenialReason("Under Graduate");
		}

		if (planName.equals("RIW") && citizenData.isGraduate()) {
			plan.setPlanStatus("AP");
			plan.setPlanStartDate("27-Jan-2021");
			plan.setPlanEndDate("27-Apr-2021");
			plan.setBenefitAmount(200.50);
		}

		return plan;
	}
}

package com.techlabs.composition.aggregation;

public class InsuranceInformation {
	private String policyName;
	private int policyDuration;

	public InsuranceInformation(String policyName, int policyDuration) {
		this.policyDuration = policyDuration;
		this.policyName = policyName;
	}

	public String getPolicyName() {
		return policyName;
	}

	public int getPolicyDuration() {
		return policyDuration;
	}

}

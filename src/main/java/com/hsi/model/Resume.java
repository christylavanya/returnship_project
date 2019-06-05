package com.hsi.model;

public class Resume {

	private String name;
	private String email;
	private String mobile;
	private String education;
	private String primaryskill;
	private String secondaryskill;
	private String experience;
	
	public Resume() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPrimaryskill() {
		return primaryskill;
	}

	public void setPrimaryskill(String primaryskill) {
		this.primaryskill = primaryskill;
	}

	public String getSecondaryskill() {
		return secondaryskill;
	}

	public void setSecondaryskill(String secondaryskill) {
		this.secondaryskill = secondaryskill;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}

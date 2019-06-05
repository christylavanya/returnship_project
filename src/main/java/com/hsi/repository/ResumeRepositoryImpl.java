package com.hsi.repository;

import java.util.ArrayList;
import java.util.List;

import com.hsi.model.Resume;

public class ResumeRepositoryImpl implements ResumeRepository {
	
	@Override
	public List<Resume> findAll()
	{
		List<Resume> resumes=new ArrayList<>();
		Resume resume=new Resume();
		resume.setName("Christy");
		resume.setEmail("christy@gmail.com");
		resume.setMobile("123456789");
		resume.setEducation("B.E");
		resume.setPrimaryskill("Java");
		resume.setSecondaryskill("Python");
		resume.setExperience("4 yrs");
		
		resumes.add(resume);
		
		return resumes;
		
	}

}

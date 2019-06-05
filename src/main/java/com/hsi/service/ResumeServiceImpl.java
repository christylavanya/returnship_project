package com.hsi.service;
import java.util.List;

import com.hsi.model.Resume;
import com.hsi.repository.ResumeRepository;
import com.hsi.repository.ResumeRepositoryImpl;

public class ResumeServiceImpl implements ResumeService {
	
	private ResumeRepository resumeRepository=new ResumeRepositoryImpl();
	
	@Override
	public List<Resume> findAll()
	{
		return resumeRepository.findAll();
	}
	

}

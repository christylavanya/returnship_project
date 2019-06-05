package com.hsi.repository;

import java.util.List;

import com.hsi.model.Resume;

public interface ResumeRepository {

	List<Resume> findAll();

}
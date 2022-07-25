package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTO.EmpDTO;
import com.Reposirtoy.EmpRepository;

@Service
public class EmpService implements EmpServiceInterface{

	@Autowired
	private EmpRepository repository;
	
	@Override
	public EmpDTO insert(EmpDTO emp) {
		 	EmpDTO dto=repository.save(emp);
		return dto;
	}

}

package com.Reposirtoy;

import org.springframework.data.repository.CrudRepository;

import com.DTO.EmpDTO;

public interface EmpRepository extends CrudRepository<EmpDTO, Integer> {

}

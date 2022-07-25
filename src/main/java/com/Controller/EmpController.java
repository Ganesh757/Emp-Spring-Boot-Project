package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.EmpDTO;
import com.Response.EmpResponse;
import com.Service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService service;

	@PostMapping("/insert")
	public ResponseEntity<EmpResponse> insert(@RequestBody EmpDTO emp){
		EmpDTO dto=service.insert(emp);
		if(dto!=null) {
			return new ResponseEntity<EmpResponse>(new EmpResponse(false, "Emp inserted",dto),HttpStatus.ACCEPTED); 
		}
		return new ResponseEntity<EmpResponse>(new EmpResponse(true, "Emp not inserted",dto),HttpStatus.BAD_REQUEST); 
	}
}

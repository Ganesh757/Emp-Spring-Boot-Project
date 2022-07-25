package com.Response;

import com.DTO.EmpDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpResponse {

	private boolean error;
	private String msg;
	private EmpDTO data;
	private Iterable<EmpDTO> list;

	public EmpResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public EmpResponse(boolean error, String msg, EmpDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public EmpResponse(boolean error, String msg, Iterable<EmpDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}

}

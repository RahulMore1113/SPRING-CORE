package com.rahul.controller;

import com.rahul.dto.CustomerDTO;
import com.rahul.service.ICustomerManagementService;
import com.rahul.vo.CustomerVO;

public class MainController {

	private ICustomerManagementService service;

	public MainController(ICustomerManagementService service) {
		this.service = service;
		System.out.println("MainController :: 1 param constructor " + service.getClass().getName());
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setPamt(Float.parseFloat(vo.getRate()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calculateSimpleInterest(customerDTO);

		return result;
	}

}

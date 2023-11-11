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
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setCustomerName(vo.getCustomerName());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calculateSimpleInterest(dto);

		return result;
	}

}

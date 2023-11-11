package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rahul.dto.CustomerDTO;
import com.rahul.service.ICustomerManagementService;
import com.rahul.vo.CustomerVO;

@Component(value = "component")
public class MainController {

	@Autowired
	private ICustomerManagementService service;

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

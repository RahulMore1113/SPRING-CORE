package com.rahul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.bo.CustomerBO;
import com.rahul.dao.ICustomerDAO;
import com.rahul.dto.CustomerDTO;

@Service(value = "service")
public class CustomerManagementServiceImpl implements ICustomerManagementService {

	@Autowired
	private ICustomerDAO dao;
	
	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		float intrAmount = (dto.getPamt() * dto.getTime() * dto.getRate()) / 100.0f;

		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setIntrAmount(intrAmount);
		customerBO.setPamt(dto.getPamt());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());

		int count = dao.save(customerBO);

		return count == 0 ? "customer registration failed"
				: "customer registration successfull--->SimpleInterestAmount::" + intrAmount;
	}

}

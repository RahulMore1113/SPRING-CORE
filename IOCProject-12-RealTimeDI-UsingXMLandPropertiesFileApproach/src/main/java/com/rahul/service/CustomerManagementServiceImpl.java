package com.rahul.service;

import com.rahul.bo.CustomerBO;
import com.rahul.dao.ICustomerDAO;
import com.rahul.dto.CustomerDTO;

public class CustomerManagementServiceImpl implements ICustomerManagementService {

	private ICustomerDAO dao;

	public CustomerManagementServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
		System.out.println("CustomerManagementServiceImpl :: 1 param constructor " + dao.getClass().getName());
	}

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

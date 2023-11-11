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

		float intrAmount = (dto.getPamt() + dto.getRate() + dto.getTime()) / 100.0f;

		CustomerBO bo = new CustomerBO();
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setCustomerName(dto.getCustomerName());
		bo.setIntrAmount(intrAmount);
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());

		int count = dao.save(bo);

		return count == 0 ? "Customer registration failed"
				: "Customer registration successfull--->SimpleInterestAmount :: " + intrAmount;

	}

}

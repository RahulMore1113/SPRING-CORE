package com.rahul.service;

import com.rahul.dto.CustomerDTO;

public interface ICustomerManagementService {
	String calculateSimpleInterest(CustomerDTO dto) throws Exception;
}

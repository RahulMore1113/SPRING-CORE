package com.rahul.dao;

import com.rahul.bo.CustomerBO;

public interface ICustomerDAO {

	int save(CustomerBO bo) throws Exception;

}

package com.rahul.dao;

import com.rahul.bo.EmployeeBO;
import com.rahul.dto.EmployeeDTO;

public interface IEmployeeDAO {
	public EmployeeBO save (EmployeeBO bo);
}

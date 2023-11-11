package com.rahul.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.bo.EmployeeBO;
import com.rahul.dao.IEmployeeDAO;
import com.rahul.dto.EmployeeDTO;

@Service(value = "service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;

	static {
		System.out.println("EmployeeServiceImpl.enclosing_method()");
	}

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
	}

	@Override
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setHikeAmount(bo.getEsalary() + 30000.0f);

		EmployeeBO empBO = dao.save(bo);
		EmployeeDTO empDTO = new EmployeeDTO();
		BeanUtils.copyProperties(empBO, empDTO);
		return empDTO;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}

}

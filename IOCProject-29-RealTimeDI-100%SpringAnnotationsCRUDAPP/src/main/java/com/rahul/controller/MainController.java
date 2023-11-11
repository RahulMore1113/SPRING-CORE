package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rahul.dto.EmployeeDTO;
import com.rahul.service.IEmployeeService;
import com.rahul.vo.EmployeeVO;

@Component(value = "controller")
public class MainController {

	@Autowired
	private IEmployeeService service;

	static {
		System.out.println("MainController.enclosing_method()");
	}

	public MainController() {
		System.out.println("MainController.MainController()");
	}

	public EmployeeVO getHike(EmployeeVO vo) {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEaddress(vo.getEadress());
		dto.setEname(vo.getEname());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEsalary(Float.parseFloat(vo.getEsalary()));

		EmployeeDTO empDTO = service.calculateHike(dto);

		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEid(empDTO.getEid().toString());
		employeeVO.setEadress(empDTO.getEaddress());
		employeeVO.setEage(empDTO.getEage().toString());
		employeeVO.setEname(empDTO.getEname());
		employeeVO.setEsalary(empDTO.getEsalary().toString());
		employeeVO.setHikeAmt(empDTO.getHikeAmount().toString());
		
		return employeeVO;
	}
	
	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}

}

package com.rahul.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rahul.cfg.AppConfig;
import com.rahul.controller.MainController;
import com.rahul.vo.EmployeeVO;

public class TestApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the ename :: ");
		String ename = scanner.next();
		
		System.out.print("Enter the eage :: ");
		String eage = scanner.next();
		
		System.out.print("Enter the eaddress :: ");
		String eaddress = scanner.next();
		
		System.out.print("Enter the esalary :: ");
		String esalary = scanner.next();
		

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MainController controller = context.getBean(MainController.class);
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(ename);
		vo.setEage(eage);
		vo.setEadress(eaddress);
		vo.setEsalary(esalary);
		EmployeeVO result = controller.getHike(vo);
		System.out.println(result);

		((AbstractApplicationContext) context).close();
		
		scanner.close();

	}

}

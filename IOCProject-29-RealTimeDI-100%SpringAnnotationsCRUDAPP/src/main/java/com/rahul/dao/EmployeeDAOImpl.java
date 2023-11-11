package com.rahul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String SQL_INSERT_QUERY = "";

	@Autowired
	private DataSource dataSource;

	static {
		System.out.println("EmployeeDAOImpl.enclosing_method()");
	}

	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
	}

	@Override
	public EmployeeBO save(EmployeeBO bo) {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(SQL_INSERT_QUERY)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImpl [dataSource=" + dataSource + "]";
	}

}

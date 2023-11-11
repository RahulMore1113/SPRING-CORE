package com.rahul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.rahul.bo.CustomerBO;

public class CustomerMySQLDAOImpl implements ICustomerDAO {

	private static final String REAL_TIME_INSERT_QUERY = "insert into customer (cname, caddress, pamt, intrAmount, rate, time) values (?,?,?,?,?,?)";

	private DataSource dataSource;

	public CustomerMySQLDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("CustomerMySQLDAOImpl :: 1 param constructor " + dataSource.getClass().getName());
	}

	@Override
	public int save(CustomerBO bo) throws Exception {

		int count = 0;

		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(REAL_TIME_INSERT_QUERY)) {
			pstmt.setString(1, bo.getCustomerName());
			pstmt.setString(2, bo.getCustomerAddress());
			pstmt.setFloat(3, bo.getPamt());
			pstmt.setFloat(4, bo.getIntrAmount());
			pstmt.setFloat(5, bo.getRate());
			pstmt.setFloat(6, bo.getTime());

			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;

	}

}

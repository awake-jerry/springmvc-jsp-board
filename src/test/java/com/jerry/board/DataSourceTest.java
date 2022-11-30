package com.jerry.board;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import lombok.Setter;

public class DataSourceTest {
	
//	@Setter(onMethod_ = {@Autowired})
	private DataSource dataSource;
	
//	@Setter(onMethod_ = {@Autowired})
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testMyBatis() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Connection con = dataSource.getConnection();
			
			System.out.println("session" + session);
			System.out.println("con" + con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}

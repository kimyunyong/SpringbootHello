package com.sample.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sample.test.domain.User;
import com.sample.test.mapper.UserMapper;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	private DataSource ds;

	/* @Autowired private UserMapper mapper; */ 

	@Test 
	public void testUserMapper() throws Exception{
		/*mapper.getLonginInfo("user1");*/
		/* assertEquals("", user.getUname()); */
	}	

	@Test
	void contextLoads() throws SQLException {
		try (Connection conn = ds.getConnection()) {
			assertThat(conn).isInstanceOf(Connection.class);

			assertEquals(100, getLong(conn, "select 100"));
		}
	}

	private long getLong(Connection conn, String sql) throws SQLException {
		long result = 0;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				result = rs.getLong(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}

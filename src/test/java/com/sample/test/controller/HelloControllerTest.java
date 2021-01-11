package com.sample.test.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.sample.test.domain.User;

@WebMvcTest(HelloControllerTest.class)
class HelloControllerTest {
	User user = new User();
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Autowired
	MockMvc mock;
	
	@Test
	public void testHello() throws Exception {
		mock.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hello 스프링부트"));
		
		MvcResult result = mock.perform(get("/hello"))
				.andExpect(status().isOk())
				.andReturn();
		
		assertEquals("Hello 스프링부트", result.getResponse().getContentAsString());
		assertThat(result.getResponse().getContentAsString()).isEqualTo("Hello 스프링부트");
		
		System.out.println("RRR>>" + result.getResponse().getContentAsString());			
	}
}

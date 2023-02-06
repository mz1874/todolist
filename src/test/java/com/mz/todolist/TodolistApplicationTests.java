package com.mz.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@SpringBootTest
class TodolistApplicationTests {

	@Resource
	BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {
		System.out.println(encoder.encode("1"));
	}

}

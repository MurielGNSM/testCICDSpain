package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testHello() {
		Api api = new Api();
		String result = api.hello();
		assert(result.equals("Hello Test-1"));
	}

	@Test
	void testHelloName() {
		Api api = new Api();
		String result = api.helloName("John");
		assert(result.equals("Hello John!"));
	}

}

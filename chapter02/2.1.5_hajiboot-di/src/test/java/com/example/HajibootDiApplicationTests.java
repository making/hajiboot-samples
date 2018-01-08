package com.example;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.app.Argument;
import com.example.app.ArgumentResolver;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HajibootDiApplicationTests {
	@Rule
	public OutputCapture capture = new OutputCapture();

	@Test
	public void contextLoads() {
		SpringApplication.run(HajibootDiApplication.class);
		Assertions.assertThat(capture.toString()).contains("result = 300");
	}

	@Configuration
	static class Config {
		@Primary
		@Bean
		ArgumentResolver argumentResolver() {
			return stream -> new Argument(100, 200);
		}
	}
}

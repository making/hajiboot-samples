package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.JsonNode;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "logging.level.org.springframework.web.client.RestTemplate=DEBUG")
public class HajibootRestApplicationTests {
	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetCustomers() {
		ResponseEntity<JsonNode> entity = restTemplate.getForEntity("/api/customers",
				JsonNode.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		JsonNode body = entity.getBody();
		assertThat(body).isNotNull();
		assertThat(body).hasSize(4);
		assertThat(body.get(0).get("id").asInt()).isEqualTo(1);
		assertThat(body.get(0).get("firstName").asText()).isEqualTo("Nobita");
		assertThat(body.get(0).get("lastName").asText()).isEqualTo("Nobi");
		assertThat(body.get(1).get("id").asInt()).isEqualTo(4);
		assertThat(body.get(1).get("firstName").asText()).isEqualTo("Shizuka");
		assertThat(body.get(1).get("lastName").asText()).isEqualTo("Minamoto");
		assertThat(body.get(2).get("id").asInt()).isEqualTo(3);
		assertThat(body.get(2).get("firstName").asText()).isEqualTo("Suneo");
		assertThat(body.get(2).get("lastName").asText()).isEqualTo("Honekawa");
		assertThat(body.get(3).get("id").asInt()).isEqualTo(2);
		assertThat(body.get(3).get("firstName").asText()).isEqualTo("Takeshi");
		assertThat(body.get(3).get("lastName").asText()).isEqualTo("Goda");
	}

	@Test
	public void testGetCustomer200() {
		ResponseEntity<JsonNode> entity = restTemplate.getForEntity("/api/customers/1",
				JsonNode.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		JsonNode body = entity.getBody();
		assertThat(body).isNotNull();
		assertThat(body.get("id").asInt()).isEqualTo(1);
		assertThat(body.get("firstName").asText()).isEqualTo("Nobita");
		assertThat(body.get("lastName").asText()).isEqualTo("Nobi");
	}

	@Test
	public void testGetCustomer404() {
		ResponseEntity<JsonNode> entity = restTemplate.getForEntity("/api/customers/100",
				JsonNode.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
		JsonNode body = entity.getBody();
		assertThat(body).isNotNull();
		System.out.println(body);
		assertThat(body.get("message").asText())
				.isEqualTo("The given customer id is not found : 100");
	}
}

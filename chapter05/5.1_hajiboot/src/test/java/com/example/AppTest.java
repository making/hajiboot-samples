package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class) // (1)
@WebAppConfiguration // (2)
@SpringApplicationConfiguration(classes = App.class) // (3)
@IntegrationTest("server.port:0") // (4)
public class AppTest {
    @Value("${local.server.port}") // (5)
            int port;
    RestTemplate restTemplate = new TestRestTemplate(); // (6)

    @Test
    public void testHome() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "http://localhost:" + port, String.class); // (7)
        assertThat(response.getStatusCode(), is(HttpStatus.OK)); // (8)
        assertThat(response.getBody(), is("Hello World!"));
    }
}
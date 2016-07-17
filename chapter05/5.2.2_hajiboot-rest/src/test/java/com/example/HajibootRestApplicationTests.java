package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE"})
public class HajibootRestApplicationTests {
    @Autowired
    CustomerRepository customerRepository;
    @LocalServerPort
    int port;
    Customer customer1;
    Customer customer2;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Page<T> {
        private List<T> content;
        private int numberOfElements;
    }

    @Before
    public void setUp() {
        customerRepository.deleteAll();
        customer1 = new Customer();
        customer1.setFirstName("Taro");
        customer1.setLastName("Yamada");
        customer2 = new Customer();
        customer2.setFirstName("Ichiro");
        customer2.setLastName("Suzuki");

        customerRepository.save(Arrays.asList(customer1, customer2));
        RestAssured.port = port;
    }

    @Test
    public void testGetCustomers() throws Exception {
        when().get("/api/customers")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("numberOfElements", is(2))
                .body("content[0].id", is(customer2.getId()))
                .body("content[0].firstName", is(customer2.getFirstName()))
                .body("content[0].lastName", is(customer2.getLastName()))
                .body("content[1].id", is(customer1.getId()))
                .body("content[1].firstName", is(customer1.getFirstName()))
                .body("content[1].lastName", is(customer1.getLastName()));
    }

    @Test
    public void testPostCustomers() throws Exception {
        Customer customer3 = new Customer();
        customer3.setFirstName("Nobita");
        customer3.setLastName("Nobi");

        given().body(customer3)
                .contentType(ContentType.JSON)
                .and()
                .when().post("/api/customers")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("id", is(notNullValue()))
                .body("firstName", is(customer3.getFirstName()))
                .body("lastName", is(customer3.getLastName()));

        when().get("/api/customers")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("numberOfElements", is(3));
    }

    @Test
    public void testDeleteCustomers() throws Exception {
        when().delete("/api/customers/{id}", customer1.getId())
                .then()
                .statusCode(HttpStatus.NO_CONTENT.value());

        when().get("/api/customers")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("numberOfElements", is(1));
    }

}

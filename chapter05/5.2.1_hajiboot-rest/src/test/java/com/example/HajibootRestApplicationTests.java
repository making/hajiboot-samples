package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"spring.datasource.url:jdbc:h2:mem:customers;DB_CLOSE_ON_EXIT=FALSE"})
public class HajibootRestApplicationTests {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    TestRestTemplate restTemplate;
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
    }

    @Test
    public void testGetCustomers() throws Exception {
        ResponseEntity<Page<Customer>> response = restTemplate.exchange(
                "/api/customers", HttpMethod.GET, null /* body,header */,
                new ParameterizedTypeReference<Page<Customer>>() {
                });
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getNumberOfElements()).isEqualTo(2);

        Customer c1 = response.getBody().getContent().get(0);
        assertThat(c1.getId()).isEqualTo(customer2.getId());
        assertThat(c1.getFirstName()).isEqualTo(customer2.getFirstName());
        assertThat(c1.getLastName()).isEqualTo(customer2.getLastName());

        Customer c2 = response.getBody().getContent().get(1);
        assertThat(c2.getId()).isEqualTo(customer1.getId());
        assertThat(c2.getFirstName()).isEqualTo(customer1.getFirstName());
        assertThat(c2.getLastName()).isEqualTo(customer1.getLastName());
    }

    @Test
    public void testPostCustomers() throws Exception {
        Customer customer3 = new Customer();
        customer3.setFirstName("Nobita");
        customer3.setLastName("Nobi");

        ResponseEntity<Customer> response = restTemplate.exchange("/api/customers",
                HttpMethod.POST, new HttpEntity<Object>(customer3) /* (8) */, Customer.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        Customer customer = response.getBody();
        assertThat(customer.getId()).isNotNull();
        assertThat(customer.getFirstName()).isEqualTo(customer3.getFirstName());
        assertThat(customer.getLastName()).isEqualTo(customer3.getLastName());

        assertThat(restTemplate.exchange("/api/customers", HttpMethod.GET, null,
                new ParameterizedTypeReference<Page<Customer>>() {
                })
                .getBody().getNumberOfElements()).isEqualTo(3);
    }

    @Test
    public void testDeleteCustomers() throws Exception {
        ResponseEntity<Void> response = restTemplate.exchange("/api/customers/{id}", HttpMethod.DELETE, null /* body,header */,
                Void.class, Collections.singletonMap("id", customer1.getId()));
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);

        assertThat(restTemplate.exchange("/api/customers", HttpMethod.GET, null,
                new ParameterizedTypeReference<Page<Customer>>() {
                })
                .getBody().getNumberOfElements()).isEqualTo(1);
    }

}

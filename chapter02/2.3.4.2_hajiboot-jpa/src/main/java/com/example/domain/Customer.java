package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // (1)
@Table(name = "customers") // (2)
@Data
@NoArgsConstructor // (3)
@AllArgsConstructor // (4)
public class Customer {
    @Id // (5)
    @GeneratedValue // (6)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
}
package com.example.sportstrackingapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Athlete {
    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

    private String sex;

    private Double weight;

    private Double height;
}
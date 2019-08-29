package com.chibana.register.person.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Person {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    private int age;

}

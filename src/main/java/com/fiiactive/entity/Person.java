package com.fiiactive.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "persons")
@Data
public class Person {
    @Id
    private String cnp;
    @Column
    private String serie;
    @Column
    private Integer number;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String address;
    @Column(name = "place_birth")
    private String placeBirth;
    @Column(name = "date_birth")
    private LocalDate dateBirth;
}

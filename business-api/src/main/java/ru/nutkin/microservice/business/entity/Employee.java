package ru.nutkin.microservice.business.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "company", name = "employee")
@SequenceGenerator(schema = "company", name = "employee_id_seq")
@Data
public class Employee {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}

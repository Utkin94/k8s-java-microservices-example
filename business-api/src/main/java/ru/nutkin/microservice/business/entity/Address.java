package ru.nutkin.microservice.business.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "company", name = "address")
@SequenceGenerator(schema = "company", name = "address_id_seq")
@Data
public class Address {

    @Id
    @Column(name = "address_id")
    private Long id;

    @Column(name = "address_name")
    private String name;

    @Column(name = "address_guid")
    private String addressGuid;
}

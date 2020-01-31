--liquibase formatted sql

--changeset nutkin:1
create schema company;

create sequence company.employee_id_seq;
create sequence company.address_id_seq;

create table company.employee(
  id bigint primary key default nextval('company.employee_id_seq'),
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  age int not null,
  address_id bigint
);

create table company.address(
  address_id bigint primary key default nextval('company.address_id_seq'),
  address_guid varchar(50),
  address_name varchar(255)
);

insert into company.address(address_guid, address_name)
values ('GUIDNAX', 'Street');

insert into company.employee(first_name, last_name, age, address_id)
values ('Jone', 'Jones', 25, 1), ('Kyle', 'Calvin', 23, 1);
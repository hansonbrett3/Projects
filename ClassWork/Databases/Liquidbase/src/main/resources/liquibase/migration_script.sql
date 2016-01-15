-- liquibase formatted sql
-- changeset apprentice:1
 CREATE TABLE person(
 person_id int(11) NOT NULL AUTO_INCREMENT,
 first_name varchar(256) NOT NULL,
 last_name varchar(256) NOT NULL,
 age int(11) NOT NULL,
 gender varchar(2) NOT NULL,
 height decimal(15,2) NULL,
 weight decimal(15,2) NULL,
 PRIMARY KEY(person_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT = 54001;
-- changeset apprentice:2
CREATE TABLE address(
 address_id int(11) NOT NULL AUTO_INCREMENT,
 person_id int(11) NOT NULL,
 street varchar(255) NOT NULL,
 city varchar(255) NOT NULL,
 `state` varchar(2) NOT NULL,
 zip varchar(10) NOT NULL,
 country varchar(100) NULL,
 PRIMARY KEY(address_id),
 KEY person_id(person_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23001;

ALTER TABLE address
ADD CONSTRAINT fk_address_person FOREIGN KEY(person_id) REFERENCES
person(person_id);
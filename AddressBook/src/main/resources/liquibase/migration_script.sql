-- liquibase formatted sql
-- changeset bretthanson:1
CREATE TABLE IF NOT EXISTS addresses(
    address_id int(11) NOT NULL AUTO_INCREMENT,
    `first` varchar(50) NOT NULL,
    `last` varchar(50) NOT NULL,
    `street` varchar(50) NOT NULL,
    `city` varchar(50) NOT NULL,
    `state` varchar(50) NOT NULL,
    `zip` varchar(50) NOT NULL,
    PRIMARY KEY(address_id)
) ENGINE=InnoDb DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23;

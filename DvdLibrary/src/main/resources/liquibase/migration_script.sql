-- liquibase formatted sql
-- changeset bretthanson:1
CREATE TABLE IF NOT EXISTS dvds(
    dvd_id int(11) NOT NULL AUTO_INCREMENT,
    title varchar(50) NOT NULL,
    released varchar(50) NOT NULL,
    mpaa varchar(50) NOT NULL,
    director varchar(50) NOT NULL,
    studio varchar(50) NOT NULL,
    rating varchar(50) NOT NULL,
    note varchar(50) NOT NULL,
    PRIMARY KEY(dvd_id)
) ENGINE=InnoDb DEFAULT CHARSET=latin1 AUTO_INCREMENT = 23;


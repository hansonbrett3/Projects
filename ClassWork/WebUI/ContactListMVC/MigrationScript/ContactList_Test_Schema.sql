
CREATE TABLE IF NOT EXISTS contacts
(
	contact_id INT(11) NOT NULL auto_increment,
	first_name varchar(50) NOT NULL,
	last_name varchar (50) NOT NULL,
	company varchar (50) NOT NULL,
	phone varchar (10) default NULL,
	email varchar (50) NOT NULL,
	PRIMARY KEY(contact_id)
)ENGINE=InnoDB DEFAULT charset=latin1 auto_increment=23;
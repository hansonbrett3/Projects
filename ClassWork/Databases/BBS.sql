CREATE TABLE Customers(
	customer_id INT NOT NULL auto_increment,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	phone varchar(20) NOT NULL,
	email varchar(50) NULL, 
	primary_account_id INT NULL,
	PRIMARY KEY(customer_id),
	KEY primary_account_id (primary_account_id)
) ENGINE = InnoDB DEFAULT charset=latin1 auto_increment 12345;

CREATE TABLE Accounts(
	account_id INT NOT NULL auto_increment,
	account_type varchar(20) NOT NULL,
	account_name varchar(50) NOT NULL,
	account_balance decimal(15, 2) NOT NULL DEFAULT 0,
	PRIMARY KEY(account_id)
) ENGINE = InnoDB DEFAULT charset=latin1 auto_increment 87654321;

CREATE TABLE Accounts_Customers(
account_id INT NOT NULL,
customer_id INT NOT NULL,
KEY account_id(account_id),
KEY customer_id(customer_id)
)ENGINE = InnoDB DEFAULT charset=latin1;

ALTER TABLE Accounts_Customers
ADD CONSTRAINT fk_accounts_customers_customer_id FOREIGN KEY (customer_id)
	REFERENCES Customers(customer_id),
ADD CONSTRAINT fk_accounts_customers_account_id FOREIGN KEY (account_id)
	REFERENCES Accounts(account_id);

ALTER TABLE Customers
ADD CONSTRAINT fk_primary_account_id FOREIGN KEY (primary_account_id)
	REFERENCES Accounts(account_id);
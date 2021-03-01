DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id INT NOT NULL,
  name VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  address VARCHAR(45) NULL,
  PRIMARY KEY (id));

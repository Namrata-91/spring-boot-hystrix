DROP TABLE IF EXISTS shopping;

CREATE TABLE shopping (
  customerId INT NOT NULL AUTO_INCREMENT  PRIMARY KEY, ,
  product VARCHAR(45) NULL,
  paymentMethod VARCHAR(45) NULL,
  product_review VARCHAR(45) NULL,
 );

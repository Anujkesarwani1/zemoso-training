-- Create the database
CREATE DATABASE ecommerce;

-- Switch to the hotelbooking database
USE ecommerce;

-- Creating the Supplier table
CREATE TABLE Supplier (
  supplier_id INT PRIMARY KEY,
  supplier_name VARCHAR(255),
  supplier_address VARCHAR(255),
  supplier_contact VARCHAR(255)
);

-- Creating the Customer table
CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(255),
  customer_address VARCHAR(255),
  customer_contact VARCHAR(255)
);

-- Creating the Item table
CREATE TABLE Item (
  item_id INT PRIMARY KEY,
  item_name VARCHAR(255),
  item_price DECIMAL(10, 2),
  supplier_id INT,
  FOREIGN KEY (supplier_id) REFERENCES Supplier(supplier_id)
);

-- Creating the Order table
CREATE TABLE `Order` (
  order_id INT PRIMARY KEY,
  customer_id INT,
  order_date DATE,
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

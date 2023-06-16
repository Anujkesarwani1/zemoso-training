-- Create the database
CREATE DATABASE paytm;

-- Switch to the hotelbooking database
USE paytm;

CREATE TABLE `Accounts` (
  account_number INT PRIMARY KEY,
  balance DECIMAL(10, 2)
);

CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(255),
  customer_address VARCHAR(255)
);

CREATE TABLE Branches (
  branch_id INT PRIMARY KEY,
  branch_name VARCHAR(255),
  branch_location VARCHAR(255)
);

CREATE TABLE `Own` (
  customer_id INT,
  account_number INT,
  account_type VARCHAR(50),
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
  FOREIGN KEY (account_number) REFERENCES Accounts(account_number)
);

CREATE TABLE Belongs (
  account_number INT,
  branch_id INT,
  FOREIGN KEY (account_number) REFERENCES Accounts(account_number),
  FOREIGN KEY (branch_id) REFERENCES Branches(branch_id)
);

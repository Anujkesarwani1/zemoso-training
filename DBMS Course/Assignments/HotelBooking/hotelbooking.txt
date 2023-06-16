-- Create the database
CREATE DATABASE hotelbooking;

-- Switch to the hotelbooking database
USE hotelbooking;

-- Create the Hotel table
CREATE TABLE Hotel (
  hotel_id INT PRIMARY KEY,
  hotel_name VARCHAR(255),
  hotel_location VARCHAR(255),
  hotel_rating DECIMAL(2,1)
);

-- Create the Customer table
CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(255),
  customer_email VARCHAR(255),
  customer_phone VARCHAR(20),
  customer_type ENUM('First Time', 'Loyal')
);

-- Create the Bookings table
CREATE TABLE Bookings (
  booking_id INT PRIMARY KEY,
  customer_id INT,
  hotel_id INT,
  check_in_date DATE,
  check_out_date DATE,
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
  FOREIGN KEY (hotel_id) REFERENCES Hotel(hotel_id)
);

-- Create the database
CREATE DATABASE IMBD;

-- Switch to the imbd database
USE IMBD;

-- Creating the Movie table
CREATE TABLE Movie (
  movie_id INT PRIMARY KEY,
  movie_title VARCHAR(255),
  release_year INT,
  director VARCHAR(255),
  genre VARCHAR(255)
);

-- Creating the Actor table
CREATE TABLE Actor (
  actor_id INT PRIMARY KEY,
  actor_name VARCHAR(255),
  date_of_birth DATE,
  nationality VARCHAR(255)
);

-- Creating the TV Series table
CREATE TABLE TVSeries (
  series_id INT PRIMARY KEY,
  series_title VARCHAR(255),
  start_year INT,
  end_year INT,
  creator VARCHAR(255),
  genre VARCHAR(255)
);

-- Creating the Movie_Actor table to represent the N-M relationship
CREATE TABLE Movie_Actor (
  movie_id INT,
  actor_id INT,
  PRIMARY KEY (movie_id, actor_id),
  FOREIGN KEY (movie_id) REFERENCES Movie(movie_id),
  FOREIGN KEY (actor_id) REFERENCES Actor(actor_id)
);

-- Creating the TVSeries_Actor table to represent the N-M relationship
CREATE TABLE TVSeries_Actor (
  series_id INT,
  actor_id INT,
  PRIMARY KEY (series_id, actor_id),
  FOREIGN KEY (series_id) REFERENCES TVSeries(series_id),
  FOREIGN KEY (actor_id) REFERENCES Actor(actor_id)
);

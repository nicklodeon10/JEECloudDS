CREATE DATABASE IF NOT EXISTS testdb;

USE testdb;

create table if not exists Author
(author_Id BigInt(10) AUTO_INCREMENT, first_Name varchar(10) NOT NULL,
middle_Name varchar(10), last_Name varchar(10) NOT NULL,
phone_number BigInt(10),
CONSTRAINT pk_author PRIMARY KEY(author_Id));


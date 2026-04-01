-- CREATE DATABASE collage;
-- USE collage;
-- CREATE TABLE student(
--    id INT PRIMARY KEY,
--    name VARCHAR(50),
--    age INT NOT NULL
-- );
-- INSERT INTO student VALUES(1,"aditya",19);
-- INSERT INTO student VALUES(2,"AMAN",21);
-- INSERT INTO student VALUES(3,"ABHISHIK",23);
-- INSERT INTO student VALUES(4,"ANKIT SINGH",34);
-- UPDATE student SET name = 'ADITYA KUSHWAHA' 
--    WHERE id = 1 ; 

-- SELECT * FROM student;
CREATE DATABASE xyz_company;
USE xyz_company;
CREATE TABLE empolye(
emp_id INT PRIMARY KEY NOT NULL,
name VARCHAR(50),
salary INT
);
INSERT INTO empolye
(emp_id,name,salary)
VALUES
(1,"RAM",7917239),
(22,"SGYAGUA",7878),
(73,"THERE ARE MASHINE A VABLE ",738);
SELECT * FROM empolye;


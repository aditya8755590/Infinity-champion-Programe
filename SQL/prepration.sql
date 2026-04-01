CREATE DATABASE dbms_lab_assignment;
USE dbms_lab_assignment;
-- Create the 'employees' table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    salary INT
);

-- Insert sample data into 'employees'
INSERT INTO employees (employee_id, employee_name, department_id, salary) VALUES
(1, 'Alice', 101, 55000),
(2, 'Bob', 102, 62000),
(3, 'Charlie', 101, 48000),
(4, 'David', 103, 75000);

-- Create the 'departments' table
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

-- Insert sample data into 'departments'
INSERT INTO departments (department_id, department_name) VALUES
(101, 'HR'),
(102, 'Engineering'),
(103, 'Finance'),
(104, 'Marketing');
-- Create the 'students' table
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

-- Insert sample data into 'students'
INSERT INTO students (student_id, name, marks) VALUES
(1, 'John', 92),
(2, 'Emma', 86),
(3, 'Liam', 78),
(4, 'Sophia', 64);
SELECT employee_name FROM empoloyes;
-- Create the 'accounts' table
CREATE TABLE Accounts (
    account_id INT PRIMARY KEY,
    income INT
);

-- Insert sample data into 'accounts'
INSERT INTO Accounts (account_id, income) VALUES
(3, 108939),
(2, 12747),
(8, 87709),
(6, 91796);


SELECT *
FROM employees AS S
INNER JOIN departments AS d
ON S.  department_id = d.department_id ;


SELECT salary
FROM employees AS S
LEFT JOIN departments AS d
ON S.department_id=d.department_id;





SELECT CITY.NAME FROM CITY 
INNER JOIN COUNTRY 
ON CITY.CountryCode = COUNTRY.Code

WHERE COUNTRY.CONTINENT = 'Africa';

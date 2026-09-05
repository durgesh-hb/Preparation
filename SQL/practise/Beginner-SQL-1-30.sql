show databases;
use practise;
show tables;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

INSERT INTO departments (department_id, department_name) VALUES
(1, 'Engineering'),
(2, 'Sales'),
(3, 'Marketing'),
(4, 'Human Resources'),
(5, 'Finance'),
(6, 'Operations'),
(7, 'Customer Support'),
(8, 'IT'),
(9, 'Research'),
(10, 'Legal');

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    department_id INT,
    manager_id INT,
    salary DECIMAL(12,2),
    hire_date DATE,
    city VARCHAR(100),

    FOREIGN KEY (department_id)
        REFERENCES departments(department_id),

    FOREIGN KEY (manager_id)
        REFERENCES employees(employee_id)
);

INSERT INTO employees
(employee_id, first_name, last_name, email, department_id, manager_id, salary, hire_date, city)
VALUES
(1, 'Raj', 'Sharma', 'raj.sharma@company.com', 1, NULL, 95000.00, '2018-03-15', 'Bengaluru'),
(2, 'Priya', 'Nair', 'priya.nair@company.com', 2, NULL, 82000.00, '2019-06-10', 'Mumbai'),
(3, 'Arjun', 'Kumar', 'arjun.kumar@company.com', 1, 1, 72000.00, '2021-01-20', 'Bengaluru'),
(4, 'Sneha', 'Patel', 'sneha.patel@company.com', 3, NULL, 68000.00, '2020-08-12', 'Ahmedabad'),
(5, 'Vikram', 'Rao', 'vikram.rao@company.com', 5, NULL, 88000.00, '2017-11-05', 'Hyderabad'),
(6, 'Ananya', 'Iyer', 'ananya.iyer@company.com', 4, NULL, 65000.00, '2022-02-14', 'Chennai'),
(7, 'Rohan', 'Mehta', 'rohan.mehta@company.com', 2, 2, 58000.00, '2022-07-18', 'Mumbai'),
(8, 'Kavya', 'Menon', 'kavya.menon@company.com', 8, NULL, 78000.00, '2020-04-22', 'Bengaluru'),
(9, 'Aditya', 'Singh', 'aditya.singh@company.com', 6, NULL, 70000.00, '2019-09-30', 'Delhi'),
(10, 'Meera', 'Joshi', 'meera.joshi@company.com', 9, NULL, 91000.00, '2018-12-03', 'Pune');

show tables;

select * from departments;

select * from employees;

DESC employees;

## Beginner SQL

-- P1 Select All Employees Retrieve all columns from the `employees` table.
select * from employees;

-- P2 Display each employee's first name, last name, and salary.
select first_name as FN, last_name as LN, salary as SLY
from employees;

-- P3 Find all employees whose city is Bengaluru.
select * 
from employees 
where city = 'Bengaluru';

-- P4 Find employees earning more than 60,000.
select * 
from employees
where salary > 60000;

-- P5 Find employees hired after January 1, 2023.
select * 
from employees
where hire_date > '2019-01-01';

-- P6 Display employees from highest salary to lowest.
select * 
from employees
order by salary desc;

-- P7 Return the five employees with the highest salaries.
select * 
from employees 
order by salary desc
limit 5;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    city VARCHAR(100),
    country VARCHAR(100),
    signup_date DATE
);

INSERT INTO customers
(customer_id, customer_name, email, city, country, signup_date)
VALUES
(1, 'Amit Verma', 'amit.verma@gmail.com', 'Bengaluru', 'India', '2023-01-15'),
(2, 'Neha Kapoor', 'neha.kapoor@gmail.com', 'Mumbai', 'India', '2023-02-20'),
(3, 'Rahul Das', 'rahul.das@gmail.com', 'Kolkata', 'India', '2023-03-10'),
(4, 'Pooja Shah', 'pooja.shah@gmail.com', 'Ahmedabad', 'India', '2023-04-05'),
(5, 'Kiran Reddy', 'kiran.reddy@gmail.com', 'Hyderabad', 'India', '2023-05-18'),
(6, 'David Miller', 'david.miller@gmail.com', 'New York', 'USA', '2023-06-12'),
(7, 'Sarah Wilson', 'sarah.wilson@gmail.com', 'London', 'UK', '2023-07-22'),
(8, 'John Smith', 'john.smith@gmail.com', 'Toronto', 'Canada', '2023-08-14'),
(9, 'Lisa Brown', 'lisa.brown@gmail.com', 'Sydney', 'Australia', '2023-09-09'),
(10, 'Daniel Lee', 'daniel.lee@gmail.com', 'Singapore', 'Singapore', '2023-10-25');

CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(150) NOT NULL,
    category VARCHAR(100),
    price DECIMAL(12,2),
    stock_quantity INT
);

INSERT INTO products
(product_id, product_name, category, price, stock_quantity)
VALUES
(1, 'Laptop Pro 15', 'Electronics', 85000.00, 25),
(2, 'Wireless Mouse', 'Accessories', 1200.00, 150),
(3, 'Mechanical Keyboard', 'Accessories', 4500.00, 80),
(4, 'Smartphone X', 'Electronics', 55000.00, 40),
(5, 'USB-C Hub', 'Accessories', 2500.00, 100),
(6, 'Monitor 27 Inch', 'Electronics', 22000.00, 35),
(7, 'Office Chair', 'Furniture', 15000.00, 20),
(8, 'Desk Lamp', 'Furniture', 3000.00, 60),
(9, 'External SSD 1TB', 'Storage', 8500.00, 50),
(10, 'Webcam HD', 'Accessories', 5000.00, 70);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    employee_id INT,
    order_date DATE,
    status VARCHAR(20),
    total_amount DECIMAL(12,2),

    FOREIGN KEY (customer_id)
        REFERENCES customers(customer_id),

    FOREIGN KEY (employee_id)
        REFERENCES employees(employee_id)
);
INSERT INTO orders
(order_id, customer_id, employee_id, order_date, status, total_amount)
VALUES
(1, 1, 2, '2024-01-10', 'Delivered', 86200.00),
(2, 2, 7, '2024-01-15', 'Shipped', 57000.00),
(3, 3, 2, '2024-02-05', 'Delivered', 7000.00),
(4, 4, 7, '2024-02-18', 'Pending', 22000.00),
(5, 5, 2, '2024-03-02', 'Delivered', 25500.00),
(6, 6, 7, '2024-03-15', 'Cancelled', 15000.00),
(7, 7, 2, '2024-04-01', 'Delivered', 11000.00),
(8, 8, 7, '2024-04-12', 'Shipped', 30000.00),
(9, 9, 2, '2024-05-05', 'Delivered', 13500.00),
(10, 10, 7, '2024-05-20', 'Pending', 5000.00);

select * from products;
select * from customers;
select * from orders;

-- P8 Find all customers whose country is India.
select * 
from customers
where country = 'india';

-- P9 Find products whose price is greater than 1000.
select * 
from products
where price > 1000;

-- P10 Find all orders that have been delivered.
select * 
from orders
where status = 'delivered';




create database prac;
use prac;
CREATE TABLE Employees (
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50),
    Department VARCHAR(30),
    Salary DECIMAL(10,2),
    HireDate DATE
);

INSERT INTO Employees VALUES
(101, 'Nithin', 'IT', 50000, '2023-01-15'),
(102, 'Rahul', 'HR', 45000, '2022-03-10'),
(103, 'Sneha', 'Finance', 55000, '2021-07-20'),
(104, 'Amit', 'IT', 60000, '2020-11-05'),
(105, 'Priya', 'Marketing', 48000, '2023-04-12'),
(106, 'Kiran', 'Finance', 62000, '2019-09-18'),
(107, 'Anjali', 'HR', 47000, '2022-06-25'),
(108, 'Vikas', 'IT', 70000, '2018-12-30'),
(109, 'Pooja', 'Marketing', 52000, '2021-08-14'),
(110, 'Rohit', 'IT', 65000, '2020-02-22');

CREATE TABLE Projects (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(50),
    EmpID INT,
    Budget DECIMAL(10,2),
    FOREIGN KEY (EmpID) REFERENCES Employees(EmpID)
);


INSERT INTO Projects VALUES
(201, 'Website Development', 101, 100000),
(202, 'HR Management System', 102, 80000),
(203, 'Accounting Software', 103, 120000),
(204, 'Mobile App', 104, 150000),
(205, 'Digital Marketing', 105, 90000),
(206, 'Financial Dashboard', 106, 130000),
(207, 'Employee Portal', 107, 70000),
(208, 'Cloud Migration', 108, 200000),
(209, 'Brand Promotion', 109, 85000),
(210, 'AI Chatbot', 110, 175000);

select  * from Employees;

select * from Employees
where Department = "IT";

select * from Employees
where salary > 50000;

select * from Employees
where HireDate > 2022-01-01;

select EmpName, salary
from Employees
where salary = (select max(salary) from Employees);

select 	count(*)
from Employees;

select sum(salary) as total_sum
from Employees;

select count(*) as count, Department as Dept
from Employees
group by Department;

select Department,avg(salary) as avg_sal
from Employees
group by Department;

select Department, EmpName
from Employees e
where salary = (
				select max(salary)
                from Employees
                where Department = e.Department);
                
select * from Employees;


select e.EmpName , p.ProjectName
from employees e
join projects p
on e.EmpID = p.EmpId;

select e.EmpName, e.Department, p.Budget
from Employees e
join projects p
on e.EmpId = p.EmpID;

select e.EmpName
from Employees e
join projects p
on e.EmpID = p.EmpId
where p.Budget > 100000;

select p.ProjectName, e.Department
from Employees e
join projects p
on e.EmpID = p.EmpID
where e.Department = "IT";

select e.EmpName, e.Department, p.Budget
from Employees e
join projects p
on e.EmpID = p.EmpID
where p.Budget = (
				select max(Budget)
                from projects);
                
select Department, count(*) as tot
from Employees
group by Department
having tot > 2;

select Department
from Employees
group by Department
having avg(salary) > 55000;

select max(salary)
from Employees
where salary < (select max(salary) from Employees);

select salary, Empname
from Employees
order by salary desc
limit 1
offset 1;

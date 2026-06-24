create database practice7;
use practice7;

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

show tables ;

#1 Find employees working in the IT department.

select * from employees 
where Department="IT";

#2. Display employees with salary greater than 50,000.

select * from employees
where salary>50000;

#3.Show employees hired after 2022-01-01.
select * from employees
where HireDate >2022-01-01;

# 4. Find the maximum with name  salary.
select EmpName,salary from employees
where salary=(select max(salary)from employees);


#5. Count total employees.

select count(*)from employees;


#6 Find total salary paid by the company.
select sum(salary) as total_salary from employees;

#7 Find total employees in each department.

select count(*) ,Department
from employees
group by Department;


# 8 Find average salary department-wise.
select avg(salary ) as avg_salary , department 
from employees
group by Department;

# 9  Find maximum salary in each department with employee name
SELECT Department, EmpName, Salary
FROM Employees e
WHERE Salary = (
    SELECT MAX(Salary)
    FROM Employees
    WHERE Department = e.Department
);


#9 Display employees ordered by salary ascending.

select * from employees 
order by salary asc;

#  Having 
 #  Write a query to display departments having more than 2 employees.

select department ,count(*) as toemp
from employees
group by department 
having toemp>2;





## joins 
 # 10 Display employee name and project name.alter
SELECT e.EmpName, p.ProjectName
FROM Employees e
JOIN Projects p
ON e.EmpID = p.EmpID;

select * from employees ;
select * from Projects ;


# 11  Display employee name, department, and project budget.

select e.EmpName,e.department,p.budget
 from Employees e
 join projects p

 on e.EmpID=p.EmpId;
 

 #12  Find employees working on projects with budget greater than 1,00,000.
 
 select e.EmpName,e.department,p.budget
 from Employees e
 join projects p
 on e.EmpID=p.EmpId
   where budget>100000 ;
   
   #13 Display project names assigned to IT employees.
   select e.EmPName,e.department,p.ProjectName
   from Employees e
   join projects p
  on e.EmpID=p.EmpID
  where e.department="IT";
  
  #14 Find the employee working on the highest budget project.
select e.EmpName,p.budget
 from Employees e
 join Projects p
 on e.EmpID=p.EmpID
 where p.budget=(select max(Budget) from projects);
 
 
# 15  Find the second highest salary.



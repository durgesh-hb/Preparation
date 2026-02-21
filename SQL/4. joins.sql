create database JIO;

use jio;

CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    branch_id INT
);

INSERT INTO Students (student_id, name, branch_id) VALUES
(1, 'Nithin', 101),
(2, 'Ravi', 102),
(3, 'Sneha', 101),
(4, 'Arjun', 105);

CREATE TABLE Branch (
    branch_id INT PRIMARY KEY,
    branch_name VARCHAR(50)
);

INSERT INTO Branch (branch_id, branch_name) VALUES
(101, 'CSE'),
(102, 'ECE'),
(103, 'MECH'),
(104, 'CIVIL');

#INNER JOIN 

select students.student_id,students.name,branch. branch_name
from students
INNER JOIN branch 
ON students.branch_id=branch.branch_id;

#LEFT JOIN

SELECT students.student_id,students.name, branch.branch_name
FROM students
LEFT JOIN branch
ON students.branch_id = branch.branch_id; 

#Right join 

SELECT students.name, branch.branch_name
FROM students
right JOIN branch
ON students.branch_id = branch.branch_id; 

#FULL JOIN 

# Full join is not supported in mysql it only works in prostgre sql or sql server
# so use the union for full join instead of full join

select students.name, branch.branch_id
from students
left join branch
on students.branch_id = branch.branch_id
union               #instead of FULL JOIN
select students.name, branch.branch_id
from students
right join branch
on students.branch_id = branch.branch_id;

select *from branch;
select *from students;
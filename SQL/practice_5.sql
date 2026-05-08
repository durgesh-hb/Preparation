create database practice5;
use practice5;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(20),
    age INT,
    city VARCHAR(30)
);


CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    credits INT
);

CREATE TABLE enrollments (
    enroll_id INT PRIMARY KEY,
    student_id INT,
    course_id INT,
    marks DECIMAL(5,2),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

INSERT INTO students VALUES
(1, 'Nithin', 'CSE', 20, 'Bangalore'),
(2, 'Ravi', 'ECE', 21, 'Mysore'),
(3, 'Sneha', 'CSE', 19, 'Chennai'),
(4, 'Arjun', 'ME', 22, 'Hyderabad'),
(5, 'Divya', 'IS', 20, 'Bangalore'),
(6, 'Kiran', 'CSE', 21, 'Mysore'),
(7, 'Pooja', 'ECE', 19, 'Chennai'),
(8, 'Rahul', 'ME', 23, 'Hyderabad'),
(9, 'Anjali', 'IS', 20, 'Bangalore'),
(10, 'Vikram', 'CSE', 22, 'Mysore');

INSERT INTO courses VALUES
(101, 'DBMS', 4),
(102, 'OS', 3),
(103, 'DSA', 4),
(104, 'Maths', 3),
(105, 'AI', 4),
(106, 'ML', 4),
(107, 'CN', 3),
(108, 'Java', 4),
(109, 'Python', 4),
(110, 'SE', 3);

INSERT INTO enrollments VALUES
(1, 1, 101, 85),
(2, 1, 102, 78),
(3, 2, 101, 70),
(4, 3, 103, 92),
(5, 4, 104, 65),
(6, 5, 101, 88),
(7, 2, 103, 75),
(8, 3, 102, 80),
(9, 6, 105, 83),
(10, 7, 106, 77),
(11, 8, 107, 69),
(12, 9, 108, 91),
(13, 10, 109, 74),
(14, 1, 110, 86),
(15, 5, 103, 89),
(16, 6, 101, 72),
(17, 7, 102, 68),
(18, 8, 105, 71),
(19, 9, 106, 95),
(20, 10, 107, 66);


 
# Display all students.
select *from students  ;
select *from courses  ;
# Display only student names and cities.
select name ,city from students ;


#  Display students from Bangalore.

select name ,city from students 
where city="Bangalore";


# Display students whose age > 20.

select name from students 
where age >20;


# Display courses with credits = 4.
select course_name from courses
where credits =4;


# Display students ordered by age (ascending).
select* from students 
order by age ;



select* from students 
order by name desc ;


# Display enrollments ordered by marks (highest first).

select *from enrollments 
order by marks desc ;


# Find total number of students.
select count(*) from students ;

# Find average age of students.
 select avg(age) from students ;
 # Find total marks scored by all students.
  select sum(marks) from enrollments  ;
  
 
 
 
 # Count students in each branch.
 
 select branch , count(name) from students 
 group by branch ;
 
 
select course_name ,student_id as st 
 from courses
 group by course_name 
 having st >2;

 
 


# JOINS 
select s.name, c.course_names
from students s
join courses c
on 






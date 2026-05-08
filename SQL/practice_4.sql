create database  Practice4;

use Practice4;
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    branch VARCHAR(20),
    age INT,
    marks DECIMAL(5,2),
    city VARCHAR(30)
);

INSERT INTO students (student_id, name, branch, age, marks, city) VALUES
(1, 'Nithin', 'CSE', 20, 85.50, 'Bangalore'),
(2, 'Ravi', 'ECE', 21, 78.00, 'Mysore'),
(3, 'Sneha', 'CSE', 19, 92.30, 'Chennai'),
(4, 'Arjun', 'ME', 22, 67.50, 'Hyderabad'),
(5, 'Divya', 'IS', 20, 88.00, 'Bangalore'),
(6, 'Kiran', 'CSE', 21, 73.20, 'Mysore'),
(7, 'Pooja', 'ECE', 19, 81.40, 'Chennai'),
(8, 'Rahul', 'ME', 23, 59.00, 'Hyderabad'),
(9, 'Anjali', 'IS', 20, 90.75, 'Bangalore'),
(10, 'Vikram', 'CSE', 22, 45.60, 'Mysore'),
(11, 'Meena', 'ECE', 21, 76.80, 'Chennai'),
(12, 'Suresh', 'ME', 24, 64.25, 'Hyderabad'),
(13, 'Lakshmi', 'CSE', 19, 95.10, 'Bangalore'),
(14, 'Manoj', 'IS', 20, 72.00, 'Mysore'),
(15, 'Kavya', 'ECE', 22, 83.90, 'Chennai'),
(16, 'Rakesh', 'ME', 23, 38.50, 'Hyderabad'),
(17, 'Priya', 'CSE', 21, 89.60, 'Bangalore'),
(18, 'Deepak', 'IS', 22, 55.75, 'Mysore'),
(19, 'Harsha', 'ECE', 20, 91.20, 'Chennai'),
(20, 'Neha', 'CSE', 19, 79.45, 'Hyderabad'),
(21, 'Rohit', 'CSE', 21, 82.60, 'Bangalore'),
(22, 'Asha', 'ECE', 20, 68.90, 'Mysore'),
(23, 'Karthik', 'ME', 23, 74.10, 'Chennai'),
(24, 'Shreya', 'IS', 21, 87.30, 'Hyderabad'),
(25, 'Varun', 'CSE', 22, 61.80, 'Bangalore'),
(26, 'Naveen', 'ECE', 20, 93.40, 'Mysore'),
(27, 'Swathi', 'IS', 19, 70.25, 'Chennai'),
(28, 'Ajay', 'ME', 24, 52.00, 'Hyderabad'),
(29, 'Keerthi', 'CSE', 21, 84.90, 'Bangalore'),
(30, 'Manasa', 'ECE', 22, 77.55, 'Mysore');

select city ,count(city ) as total
from students 
where city='Bangalore';



select *from students 
where branch="CSE" and marks>85;

select *from students 
where age between 20 and 22;

select *from students 
order by age  asc

limit 3;


select * from students
order by branch , marks;

select count(*) as total 
from students ;

select sum(marks) 
from students ;

select branch ,count(branch)as  brc from students 
group by branch;

select branch ,avg(marks)
from students
group by branch ;

select city ,count(name) as totalstuincity
from students
group by city;



select branch ,count(name) as cn
from students 
group by branch 
having cn>8;


select *from students 
order by marks desc
limit 1;
##or
##using sub queries
select *from students 
where marks =(select max(marks) from students);



select *from students 
where marks =(select max(marks) from students
 where marks<(select max(marks) from students)
 );

select avg(marks) from students ;

select *from students 
where marks>(select avg(marks) from students );

select *from students 
where marks<(select avg(marks) from students );


select name,branch  from students 
where marks>(select avg(marks) from students );


select branch ,avg(marks  )as ab 
from students 
group by branch 
order by ab desc
limit 1;

select city ,count(name)
from students 
group by city 
order by city
limit 1;


select *from students 
where marks between
 (select avg(marks) from students )
 and(select  max(marks)from students);
 
 select city ,avg(marks) as ag
 from students 
 group by city
 having city ="Bangalore";
 
 
 select branch ,sum(marks)
 from students 
 group by branch ;
 
 select *from students ;
 select name as faildnames ,marks 
 from students 
 where marks <60;
 
select branch ,avg(marks)as ag 
from students 
group by branch 
order by ag limit 3;










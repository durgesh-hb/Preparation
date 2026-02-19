-- Select the student database
use student;

-- Show all tables in the current database
show tables;

-- Display all records from students table
select * from students;

-- Insert a new record with all column values
insert into students values(13,"jack jill","ME");

-- Insert record into specific columns only
insert into students (name,branch)
values("jackkk m ","CSE");

-- Add a new column 'marks'
alter table students add marks decimal(5,2);

-- Modify the datatype of 'marks' column
ALTER TABLE students
MODIFY COLUMN marks DECIMAL(5,2);

-- Add a new column 'age'
alter table students add age int;

-- Drop the 'marks' column
ALTER TABLE students
DROP COLUMN marks;

-- Update marks for selected IDs
UPDATE students
SET marks = 88.77
WHERE id IN (1, 3, 8, 12, 14);

-- Update marks for another set of IDs
UPDATE students
SET marks = 77.77
WHERE id IN(2, 4, 6, 7, 10);

-- Update marks again for selected IDs
UPDATE students
SET marks = 77.77
WHERE id IN(5, 11, 13, 10);

-- Update marks for ID = 9
UPDATE students
SET marks = 60
WHERE id = 9;

-- Display students from CSE branch
select * from students where branch="CSE";

-- Order students by marks in descending order
select * from students order by marks desc;

-- Order students by marks in ascending order
select * from students order by marks asc;

-- Count students in each branch
select branch ,count(*) as branchcount
from students 
group by branch;

-- Count students for each marks value
select marks ,count(*) as markscount 
from students 
group by marks; 

-- Update age to 21 for selected IDs
update students 
set age =21
where id in (2,4,6,8,10);

-- Update age again to 21 for same IDs
update students 
set age =21
where id in (2,4,6,8,10);

-- Update age to 22 for selected IDs
update students 
set age =22
where id in (3,5,7,9,11);

-- Update age to 20 for selected IDs
update students 
set age =20
where id in (12,13,14);

-- Show marks where average age is greater than 21
select marks ,avg(age) as avgage
from students 
group by marks 
having avg(age) > 21;

-- Count total number of students
select count(*) as totalstudents 
from students ;

-- Calculate total age of students
select sum(age) as totalage
from students;

-- Calculate total marks
select sum(marks ) as totalmarks 
from students;

-- Calculate average age
select avg(age) as avgage
from students;

-- Find minimum and maximum age
select min(age) as minage ,max(age) as maxage 
from students ;

-- Display table structure 
DESC students;
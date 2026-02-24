 create database subb;
 
 use subb;
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    branch VARCHAR(20),
    marks INT,
    age INT,
    city VARCHAR(30)
);

INSERT INTO students VALUES
(1, 'Nithin', 'CSE', 85, 20, 'Bangalore'),
(2, 'Ravi', 'ECE', 72, 21, 'Mysore'),
(3, 'Sneha', 'CSE', 91, 19, 'Bangalore'),
(4, 'Arjun', 'ME', 65, 22, 'Chennai'),
(5, 'Meena', 'EEE', 78, 20, 'Hyderabad'),
(6, 'Kiran', 'CSE', 88, 21, 'Mumbai'),
(7, 'Anjali', 'ECE', 59, 20, 'Bangalore'),
(8, 'Vikram', 'ME', 73, 23, 'Chennai'),
(9, 'Divya', 'EEE', 81, 22, 'Hyderabad'),
(10, 'Rahul', 'CSE', 95, 21, 'Mysore'),
(11, 'Pooja', 'ECE', 67, 19, 'Bangalore'),
(12, 'Manoj', 'ME', 74, 22, 'Mumbai'),
(13, 'Neha', 'CSE', 69, 20, 'Chennai'),
(14, 'Sanjay', 'EEE', 84, 23, 'Hyderabad'),
(15, 'Kavya', 'CSE', 90, 21, 'Bangalore'),
(16, 'Deepak', 'ECE', 76, 20, 'Mysore'),
(17, 'Priya', 'ME', 82, 22, 'Mumbai'),
(18, 'Harsha', 'EEE', 71, 19, 'Chennai'),
(19, 'Tejas', 'CSE', 87, 21, 'Hyderabad'),
(20, 'Asha', 'ECE', 93, 20, 'Bangalore');

select avg(marks ) from students ;

#sub query

select *from students 
where marks > (select avg(marks )  from students );

#single -row sub query 

select *from   students 
where marks =(select max(marks)from students );



#multi-row query




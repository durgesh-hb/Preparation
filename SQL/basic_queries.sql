use student;
show tables;
select * from stu_info;
insert into stu_info values(7,"raju","CS");

alter table stu_info add marks decimal(5,2);

update stu_info set marks = 60.22 where stu_ID = 1;
alter table stu_info drop column email;
desc stu_info;

alter table stu_info 
drop column marks;

update stu_info
set marks = 36.22
where stu_ID in (2,6);

select * from stu_info
order by marks asc;

select branch , count(*) as branchcount
from stu_info 
group by branch;

select marks , count(*) as avgmarks
from stu_info
group by marks;

select stu_name, count(*) as samenames
from stu_info
group by stu_name;

update stu_info 
set stu_name = "Ramu"
where stu_ID = 6;

select * from stu_info;

select stu_name, count(*) as samenames
from stu_info
group by stu_name;

alter table stu_info add age int;

update stu_info 
set age = 20
where stu_ID = 1;

desc stu_info;


select stu_name, avg(age) as avgage
from stu_info
group by stu_name
having avg(age)<25;

select count(*) as sunofage
from stu_info;

select avg(age) as sunofage
from stu_info;

select min(age) as mimage, 
max(age) as maxage
from stu_info;

select * from stu_info;

select * from stu_info 
where age=20;

alter table stu_info add email varchar(25);

select * from stu_info;
order by age asc;

select branch, count(*) as totalage
from stu_info
group by branch;

select min(age) as minimumage, max(age) maxage
from stu_info;

select stu_name
from stu_info
where marks ;

select count(*) as total
from stu_info;

select * from stu_info;

select count(*) as total_student
from stu_info;

select stu_name, age, age + 1 as new_age
from stu_info
order by age desc
limit 1 offset 5;

select count(*) as total_number_stu
from stu_info;

delete from stu_info
where stu_id= 02;

insert into stu_info values(22,"Gowda","AI",70,21);

select * 
from stu_info 
where age >=30;
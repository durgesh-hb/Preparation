show databases;
use student;
select * from sample;
insert into sample values(01,"durgesh","mysore");
select * from sample;

# 1. create

# 2. alter

#add
alter table sample
add address varchar(30);

#rename
alter table sample
rename column address to aaddrreess;

#drop
alter table sample
drop column aaddrreess;

#modify
alter table sample 
modify name varchar(30);

#truncate
truncate table sample;

# 3. drop
# just an droping the table type
# drop table table_name

desc sample;
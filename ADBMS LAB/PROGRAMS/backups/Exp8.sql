create database teacher;
use teacher;
create table teacher(id int,name char(20),place int,dept int,salary int);
desc teacher;
alter table teacher add dept int;
create table dept(id int, dept char(50));
desc dept;
create table place(id int, place char(20));
desc place;
create table salary(id int, salary char(20));

insert into teacher(id,name,place,dept,salary)
values(1,'sunil',2,3,50000),
(2,'popo',5,2,60000),
(3,'appu',8,1,20000),
(4,'nandu',6,4,50000),
(5,'ammu',3,5,10000)
;

select * from teacher;
drop table teacher;

desc dept;
insert into dept(id,dept) value(1,'CSE'),
(2,'MEC'),
(3,'ECE'),
(4,'IT'),
(5,'FOOD TECH')
;

select * from dept;

insert into place(id,place) value(1,'kollam'),
(2,'thrissur'),
(3,'palakkad'),
(4,'wayanad'),
(5,'kottayam')
;


desc salary;
insert into salary(id,salary) value(1,50000),
(2,60000)

;

select * from salary;

-- ---------------ANSWERS-----------------
select teacher.name,place.place,salary.salary from teacher,place,salary where teacher.name='sunil' and teacher.place=place.id and teacher.id=salary.id;

select 



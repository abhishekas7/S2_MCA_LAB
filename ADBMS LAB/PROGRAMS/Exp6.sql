use lab5;
create table student2(roll_no int primary key,name char(20) not null,gender char(1),check (gender='m' or gender='f'),dob date not null,course varchar(10),);
desc student2;
drop table student2;

create table student2(
rollno int auto_increment primary key,
name varchar(20) not null,
gender varchar(1),
dob date not null,
course varchar(10),
sem varchar(5),
check (gender='m'or gender='f'),
check (course='mca'or course='intmca'),
check (sem='s2' or sem='s3'));

desc student2;

CREATE TABLE marks(
sid int auto_increment primary key,
rollno int  references student(rollno),
subcode varchar(4) not null,
mark int not null check (mark>0 and mark<=100));

desc marks;

insert into student2 (name,gender,dob,course,sem) values
('ebin','m','2000-02-05','mca','s2'),
('binu','m','1998-02-18','mca','s3'),
('febin','m','1999-06-26','intmca','s2'),
('john','m','2000-05-21','mca','s2'),
('amal','m','1999-07-11','intmca','s3');
select * from student2;

insert into marks(rollno,subcode,mark)values
(1,'abc',78),
(2,'abc',74),
(3,'xyz',56),
(4,'abc',66),
(5,'xyz',44);
select * from marks;

select name,course,sem from student2 where course='mca';
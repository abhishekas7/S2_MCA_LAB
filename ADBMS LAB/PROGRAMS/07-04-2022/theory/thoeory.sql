create database abhishek;
use abhishek;

create table TAB1(rollno INT,m1 INT ,m2 INT,primary key(rollno));
desc TAB1;

insert into TAB1 values(1,1,1);
insert into TAB1 values(2,2,2);
insert into TAB1 values(3,4,5);
select * from TAB1;

create table TAB2(rollno INT auto_increment,m1 INT Not null,m2 INT not null,primary key(rollno));
select * from TAB2;

alter table TAB2 drop total;


insert into TAB2(m1,m2) values(2,1);

insert into TAB2(m1,m2) values(6,3);
insert into TAB2(m1,m2) values(22,30);
insert into TAB2(m1,m2) values(24,10);

select rollno,m1,m2,m1+m2 as total from TAB2 where m1+m2 > 10;

select * from TAB2 order by m1 desc;

select rollno,m1,m2,m1+m2 as total,(m1+m2)/2 as average from TAB2;

select rollno,m1,m2,m1+m2 as total,(m1+m2)/2 as average from TAB2 order by total desc;

select * from TAB2;
select * from TAB2 where m1 in(2,1);

select * from TAB2 where m1 not in(2,1);

create table s1(sname varchar(20));
insert into s1 values("thingku");
select * from s1;
select sum(m1) from tab1;
select count(*) from s1;
select distinct * from s1;

select * from s1 where sname like 's%';
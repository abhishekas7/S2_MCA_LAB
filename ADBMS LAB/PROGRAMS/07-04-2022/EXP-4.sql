create table student(rollno int auto_increment ,sname varchar(20) not null,m1 int not null,m2 int not null,m3 int not null,m4 int not null,primary key(rollno),check (m1<=100 and m2<=100 and m3<=100 and m4<=100));

insert into student(sname,m1,m2,m3,m4)
values("rahul",20,80,50,90),
("ram",15,80,75,35),
("abhijith",45,75,90,74),
("rohith",34,79,90,100),
("amritha",50,78,40,100)
;
insert into student(sname,m1,m2,m3,m4) values("rohini",82,74,96,79);

select * from student;

update student set m1=10,m2=5,m3=15,m4=20 where rollno="2";
update student set m1=10,m2=10,m3=2,m4=32 where rollno="4";
update student set m1=80,m2=100,m3=80,m4=100 where rollno="1";

select *,m1+m2+m3+m4 as totalmark from student where (m1+m2+m3+m4) >= 200;

select *,m1+m2+m3+m4 as total from student;

select *,m1+m2+m3+m4 as total from student order by total desc;

select * from student where m1 not in (20,30);

select *,m1+m2+m3+m4 as total,(m1+m2+m3+m4)/4 as average from student;

select *,m1+m2+m3+m4 as total,(m1+m2+m3+m4)/4 as average from student where (m1+m2+m3+m4)/4>=80;

select * from student;

select distinct sname from student;

select *  from student where sname like "a%";

select count(*)  from student;

select sum(m1+m2+m3+m4) as total_mark  from student;

select avg(m1+m2+m3+m4) as average_mark  from student;

select max(m1+m2+m3+m4) as max_mark  from student;


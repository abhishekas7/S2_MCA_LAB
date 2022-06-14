use teacher;
create or replace view v1 as select * from teacher;
create or replace view v1 as select * from dept;
create or replace view v3 as select teacher.name,place.place from teacher,place;
create view v4(a,b) as select teacher.name,place.place from teacher,place;  
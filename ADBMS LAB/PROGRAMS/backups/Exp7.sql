create database SETOPR_DB;
use SETOPR_DB;

use setdb;
select * from emp where id=(select id from emp where name='popo'); -- nested sql
select name from emp where id='500';

select max(id) from emp;
select max(id) from emp where id=(select max(id)from emp);


select id from emp where name='popo';



select emp.name,dept.dept from emp,dept where dept.dept = 'MCA' and emp.dept=dept.did;

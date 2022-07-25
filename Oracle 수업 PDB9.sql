create or replace procedure test99
is
    v_empno emp1.empno%type;
    v_ename emp1.ename%type;
    v_dname dept1.dname%type;

    cursor t_c is 
    select empno,ename,dname
    from emp1 natural join dept1
    where sal>=3000
    order by dname;
begin 
    open t_c;
    loop
        fetch t_c into v_empno,v_ename,v_dname;
        exit when t_c%notfound;
        
        dbms_output.put_line(v_empno ||' '
                            ||v_ename||' '||v_dname);
    end loop;
end;
/
set serveroutput on
exec test99;

create or replace procedure pro101
(v_empno in emp1.empno%type,
v_deptno in emp1.deptno%type)
is
begin
    update emp1 set deptno=v_deptno
    where empno=v_empno;
end;
/

exec pro101(7839,30);

select * from emp1;

exec pro101(7839,10);


create or replace function hsal
return CHAR
is
    v_ename emp1.ename%type;
begin
    select ename into v_ename from emp1 where sal=(select max(sal) from emp1);
    return (v_ename);
end;
/
begin    
    dbms_output.put_line(hsal);
end;
/
select*from enrol;
select stddev(enr_grade) from enrol;
select *from student;
desc student;
select sub_no,stddev(enr_grade) from enrol group by sub_no;

--학과 입력 받아 과 점수의 표준편차를 출력하는 함수
create or replace function pro02
(v_dn student.stu_dept%type)
return number
is
    v_n number;
begin
    select stddev(enr_grade) into v_n
    from student natural join enrol
    where stu_dept = v_dn;
    return (v_n);
end;
/
select stddev(enr_grade)
    from student natural join enrol
    where stu_dept = '기계';
select distinct pro02('기계') from student;


create table ee
(sub_no char(3),
sub_cnt number);

drop table ee;
insert into ee values(108,8); 
select *from ee;

rollback;

insert into enrol values(201,20131001,77);
update enrol set sub_no='301' where sub_no=201;
delete enrol where sub_no='301'and stu_no=20131001;
delete from enrol where sub_no = 201 and enr_grade=77;
select*from enrol;

drop trigger q100;

create or replace trigger q100
after
insert or update or delete on enrol
for each row
begin
    if inserting then
        insert into ee values(:new.sub_no,30);
    elsif updating then
        update ee set sub_cnt=10;
    elsif deleting then
       update ee set sub_cnt=30;
    end if;
end;
/

drop table emp300;
select * from emp300;
create table emp300
(empno number(4),
ename varchar2(20),
workdate date);

create or replace trigger tri5000
after
insert on emp1
for each row
begin
    if :new.sal>=5000 then
        insert into emp300 values(:new.empno,:new.ename,sysdate);
    end if;
end;
/
select * from emp1;
insert into emp1 values(3333,'hon','student',null,'1999-12-31',6000,null,50); 
delete from emp1 where empno=3333;

select * from emp1 where hiredate < '1981-01-01';

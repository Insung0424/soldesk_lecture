create table t_tbl(
t_empno number(4) NOT NULL,
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2),
constraint t_tbl_pk primary key(t_empno));
desc t_tbl;

--t_tbl 에 직접자료 삽입
insert into t_tbl 
values('7369','SMITH','CLERK',7902,
to_date('1980-12-17','yyyy-mm-dd'),800,null,20);
delete from t_tbl where t_empno=7369;

--t_tbl 에 부서번호20인 자료 삽입
insert into t_tbl (select * from emp1 where deptno = 20);
select * from t_tbl;

create table t_tbl10(
t_empno number(4) NOT NULL,
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2),
constraint t_tbl10_pk primary key(t_empno));

--t_tbl10 에 부서번호10 인 데이터 삽입
insert into t_tbl10 (select * from emp1 where deptno=10);
select * from t_tbl10;

-- t_tbl 에 gender 열 char(1) 로 삽입
alter table t_tbl add gender char(1);

-- t_tbl 에 gender 자료형 varchar2(10)로 변경
alter table t_tbl modify gender varchar2(10);

-- gender 열 삭제
alter table t_tbl drop (gender);

-- t_tbl 모든 데이터 삭제
delete from t_tbl;

--emp1 구조와 같은 t_emp2
create table t_emp2 as select * from emp1;
drop table t_emp2;

create table t_emp2(
t_empno number(4),
t_ename varchar2(40),
t_job varchar2(9),
t_mgr number(4),
t_hiredate date,
t_sal number(7,2),
t_comm number(7,2),
t_deptno number(2) constraint t_emp2_fk references dept1(deptno),
constraint t_emp2_pk primary key (t_empno));

--t_emp2 에 외래키제약조건 비활성화,활성화
alter table t_emp2 disable constraint t_emp2_fk;
alter table t_emp2 enable constraint t_emp2_fk;

--외래키 제약 조건 삭제
alter table t_emp2 drop constraint t_emp2_fk;

--테이블 삭제
drop table t_emp2;

--20번 부서 사원으로 이루어진 v_emp20 
create or replace view v_emp20 
as select * from emp1 where deptno in 20;
select * from v_emp20;

--empno,ename,dname 가지는 v_emp_dept
create or replace view v_emp_dept
as (select empno,ename,dname from emp1,dept1
where emp1.deptno=dept1.deptno);
select * from v_emp_dept;

--가장 최근의 입사한 5명의 empno,ename,hiredate
select empno,ename,hiredate 
from (select * from emp1 order by hiredate desc)
-- 정렬방식이 바뀐 테이블을 지정 
where rownum<=5;
-- 내부데이터로만 존재하는 rownum 그중에서 5개 이하만 검색


--급여와 커미션을 합한 금액으로 상위 7명 empno,enmae
select empno,ename,sal+nvl(comm,0)
from (select * from emp1 order by nvl(sal+comm,sal) desc)
where rownum<=7;

--부서별 평균 급여가 가장 높은 부서 2개 이름
select dname 
from (select dname,avg(sal) from emp1 natural join dept1 
group by dname order by avg(sal) desc ) where rownum <= 2;


--신입사원을 채용하였다.
--사원번호, 사원이름, 사원직무, 상급자사원번호, 급여, 부서번호를 입력받아
--사원 테이블에 삽입하는 프로시저를 작성해라.
create or replace procedure input_emp1
(i_empno emp1.empno%type,
i_ename emp1.ename%type,
i_job emp1.job%type,
i_mgr emp1.mgr%type,
i_sal emp1.sal%type,
i_deptno emp1.deptno%type)
is
begin
    insert into emp1(empno,ename,job,mgr,sal,deptno)
    values(i_empno,i_ename,i_job,
    i_mgr,i_sal,i_deptno);
--    commit;
end;
/
desc emp1;
execute input_emp1(8000,'김두한','밈',7839,4444,30);
select * from emp1;
delete from emp1 where empno in 8000;


--부서번호를 변경하는 프로시저를 작성해라.
--(emp 테이블에서) - update~set~where
--(입력된 사원번호가 같을때 부서번호 
--변경해라)
create or replace procedure up_emp1
(i_empno emp1.empno%type,
i_deptno emp1.deptno%type)
is
begin
    update emp1 set deptno=i_deptno
    where empno=i_empno;
end;
/
execute up_emp1(8000,60);

/*
create or replace procedure out_emp1
(i_empno out emp1.empno%type,
i_deptno out emp1.deptno%type)
is
begin
    select empno,deptno into i_empno,i_deptno
    from emp1;
end;
/
drop procedure out_emp1;

declare 
    d_empno emp1.empno%type;
    d_deptno emp1.deptno%type;
begin
    for i in 0..20 loop
        out_emp1(d_empno,d_deptno);
        dbms_output.put_line(d_empno || ' ' || d_deptno);
    end loop; 
end;
/*/

create or replace procedure in_en1
(i_sub_no enrol.sub_no%type,
i_stu_no enrol.stu_no%type,
i_enr_grade enrol.enr_grade%type)
is
begin
    insert into enrol values(i_sub_no,i_stu_no,i_enr_grade);
end;
/

execute in_en1(106,20151062,90);
execute in_en1(101,20131001,90);
select * from enrol;
execute in_en1(201,20193075,50);
delete from enrol where sub_no in 201;

create or replace procedure up_sub1
(old_sub_no subject.sub_no%type,
new_sub_no subject.sub_no%type)
is
begin
    update subject set sub_no=new_sub_no
    where sub_no=old_sub_no;
end;
/


create or replace procedure f_prof
(f_sub_no subject.sub_no%type,
f_sub_prof out subject.sub_prof%type)
is
begin
    select sub_prof
    into f_sub_prof
    from subject
    where sub_no=f_sub_no;
end;
/

declare
    fsubprof subject.sub_prof%type;
begin
    f_prof(101,fsubprof);
    dbms_output.put_line(fsubprof);
end;
/


create or replace function func_aftertext
(sal in number)
return number
is
    tax number := 0.05;
begin
    return (round(sal-(sal*tax)));
end;
/
declare
    aftertax number;
begin
    aftertax := func_aftertext(3000);
    dbms_output.put_line(aftertax);
end;
/

select ename,sal,func_aftertext(sal) from emp1;



select * from user_constraints
where table_name = 'copy_enrol';
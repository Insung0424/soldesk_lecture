select * from emp;
select * from dept;
select * from salgrade;

select * from student;
select * from subject;
select * from enrol;

select upper(stu_gender),stu_gender from student;

select stu_dept || stu_name from student;
select concat(stu_dept,stu_name) from student;

select stu_dept || '과 ' || stu_grade || '학년 '
|| stu_name || '입니다' from student;

select substr(stu_name,1,2),stu_name from student;

select stu_name,stu_dept,substr(stu_dept,2,1) from student;

select to_char(to_number(1234.5678),'9999.999') from dual;

select NVL(stu_height,0),stu_name from student;
select NULLIF('A', 'A') from dual; -- null반환 
select NULLIF('A', 'B') from dual; -- A반환

select nvl(NULLIF('A', 'A'),'B') from dual; -- B반환

select substr('정인성홍광택',2,3) from dual; -- 인성홍 반환

select stu_no,stu_name,stu_height,
round(stu_height,-1) from student;

select stu_no,stu_name,stu_height,
trunc(stu_height,-2) from student;

select stu_weight,mod(stu_weight,30) from student;
-- 체중을 30으로 나눈 나머지

select nvl(to_char(stu_height),'미기록')height from student;
--stu_height 을 문자로 바꿔야 'null'값에 문자를 주입할 수 있다

select stu_no,stu_name,
nvl(stu_height,0)+stu_weight as 신장이null이면0이됨
from student;

select stu_no,stu_name,nvl(to_char(stu_height),'입력요망') from student;

select stu_gender,nvl2(nullif(stu_gender,'m'),'여자','남자') as 성별 from student;

select stu_name,stu_no from student 
union select sub_no,sub_name 
from subject; 

--p125 q3 집합연산자를 사용한 방식
select empno,ename,job,sal,deptno from emp
where deptno=20 and sal>2000 
union
select empno,ename,job,sal,deptno from emp
where deptno=30 and sal>2000;
select empno,ename,job,sal,deptno from emp
where deptno<>10 and sal>2000;

select max(enr_grade),min(enr_grade) from enrol;
        --최대        --최소
        
select max(stu_weight),min(stu_weight) from student
where stu_dept in '기계';

select count(*) ,count(stu_height) from student;
-- 전체 학생수 와 신장값을 가진 학생 수

select count(distinct stu_dept) from student;

select count(*) as 학생수,
sum(stu_height) as 전체학생의키합,
count(stu_height) as 키값을가진학생수,
avg(stu_height)평균키 from student;


--68. 학생 중 키가 가장 큰 학생의 신장을 검색하라.
select max(stu_height) from student;
--69. 학생의 이름 중 MAX와 MIN값을 검색하라.
select max(stu_name),min(stu_name) from student;
        --순서가 되는 듯함
--70. 학생테이블의 레코드(튜플)수를 검색하라.
select count(*) from student;

update student set stu_name='옥한빛' where stu_name='이은결';
-- 특정 테이블의 특정 열값을 수정 하는 방법
select * from student; --확인결과 제대로 수정됨

select sum(sal) from emp; --sal 의 합

select stu_dept,avg(stu_weight) from student
group by stu_dept; --그룹함수는 단일로 사용하거나 
--다른 열과 같이 사용할 경우 다른열을 그룹화해서 사용한다

select stu_dept,count(*)해당학과학생 from student
where stu_weight>=50
group by stu_dept;

select stu_dept,stu_grade as 학년,count(*)해당학과의같은학년학생수
from student group by stu_dept,stu_grade;

--71. 학과별 학생들의 인원수를 검색하라.
select stu_dept,count(*) from student group by stu_dept;

--72. 학과별 학생들의 인원수를 인원수가 많은 순으로 검색하라.
select stu_dept,count(*) from student group by stu_dept
order by count(*) desc;

--73. 학년별 학생들의 인원수를 검색하라.
select stu_grade,count(*) from student group by stu_grade;

--74. 학과별 학년별 학생들의 평균 체중을 검색하라.
select stu_dept,stu_grade,avg(stu_weight)
from student group by stu_dept,stu_grade;

--75. 학과별 학년별 학생들의 학번의 MAX와 MIN값을 검색하라.
select stu_dept,stu_grade,max(stu_no),min(stu_no)
from student group by stu_dept,stu_grade;

--p167 6-45
select empno,ename,sal,comm,sal+comm,
nvl(comm,0),sal+nvl(comm,0) from emp;

--p168 6-46
select empno,ename,comm,
nvl2(comm,'0','X'),
nvl2(comm,sal*12+comm,sal*12) as annsal
from emp;

--p170 6-47
select empno,ename,job,sal,
decode(job,
'MANAGER',sal*1.1,
'SALESMAN',sal*1.05,
'ANALYST',sal,
sal*1.03) as upsal
from emp;

--p172 6-48
select empno,ename,job,sal,
case job
when 'MANAGER' then sal*1.1
when 'SALESMAN' then sal*1.05
when 'ANALYST' then sal
else sal*1.03
end as upsal
from emp;

--p173 6-49
select empno,ename,comm,
case
when comm is null then '해당사항없음'
when comm = 0 then '수당없음'
when comm > 0 then '수당 : '||comm
end as comm_text
from emp;

--p177 7-1
select sum(sal) from emp;
--p178 7-2
select ename,sum(sal) from emp; --오류나는게맞음
--p179 7-3
select sum(comm) from emp;
--p179 7-4
select sum(distinct sal),sum(all sal),sum(sal) from emp;
--모두다 같은 한 줄 정보이므로 출력가능
--p181 7-5
select count(*) from emp;
--p181 7-6 
select count(*) from emp where deptno=30;
--p181 7-7
select count(distinct sal),count(all sal),count(sal)
from emp;
--p182 7-8
select count(comm) from emp;
--p182 7-9
select count(comm) from emp where comm is not null;
--p183 7-10
select max(sal) from emp where deptno=10;
--p183 7-11
select min(sal) from emp where deptno=10;
--p183 7-12
select max(hiredate) from emp where deptno=20;
--p184 7-13
select min(hiredate) from emp where deptno=30;
--p184 7-14
select avg(sal) from emp where deptno=30;
--p185 7-15
select avg(distinct sal) from emp where deptno=30;

select empno,rpad(substr(empno,1,2),length(empno),'*')as masking_empno,
ename,rpad(substr(ename,1,1),length(ename),'*') from emp;

select empno,ename,sal,
trunc(sal/21.5,2) as day_pay,
round(sal/21.5/8,1) as time_pay 
from emp;
-- 별칭을 변수로 사용은 안되는 듯 함

select empno,ename,hiredate,
to_char(next_day(add_months(hiredate,3),1),'YYYY-MM-DD') as r_job,
--hiredate에 90을 더하는 건 좋지않음 3달이 며칠일지는 알 수 없음
NVL(to_char(comm),'N/A') from emp;

select stu_grade, avg(stu_height) from student
where stu_dept='기계'
group by stu_grade having avg(stu_height)>=160;
--기계과 학생들을 학년별 평균키로 묶은 뒤 평균키가 160이상만 출력
--having은 그룹에 대한 조건

select stu_dept,max(stu_height) from student
group by stu_dept having max(stu_height)>=175;
--최대키가 175이상인 학과,학과별 키 구하기

select to_char(max(avg(stu_height)),'999.99') from student
group by stu_dept;
--학과별 평균키 중 가장 높은 키
--avg(stu_height) 학과별 평균키 3개가 출력됨
--max()로 감싸서 그 중 가장 큰 값을 받음
--to_char()로 소숫점 둘째자리까지 출력됨


create table dept1(
deptno number(2)
constraint pk_dept primary key,
dname varchar2(14),
loc varchar2(13));




insert into dept1 values
(10,'ACCOUNTING','NEW YORK');
insert into dept1 values
(20,'RESEARCH','DALLAS');
insert into dept1 values
(30,'SALES','CHICAGO');
insert into dept1 values
(40,'OPERATIONS','BOSTON');




create table emp1(
empno number(4)
constraint pk_emp primary key,
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));




insert into emp1 values(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
insert into emp1 values(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
insert into emp1 values(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
insert into emp1 values(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
insert into emp1 values(7788,'SCOTT','ANALYST',7566,to_date('13-07-1987','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
insert into emp1 values(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
insert into emp1 values(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
insert into emp1 values(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
insert into emp1 values(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
insert into emp1 values(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
insert into emp1 values(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);
insert into emp1 values(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
insert into emp1 values(7876,'ADAMS','CLERK',7788,to_date('13-07-1987','dd-mm-yyyy'),1100,NULL,20);




create table salgrade1(
grade number(7,2),
losal number(7,2),
hisal number(7,2));




insert into salgrade1 values(1,700,1200);
insert into salgrade1 values(2,1201,1400);
insert into salgrade1 values(3,1401,2000);
insert into salgrade1 values(4,2001,3000);
insert into salgrade1 values(5,3001,9999);

desc emp1;
desc salgrade1;
desc dept1;
select * from emp1;
select * from salgrade1;
select * from dept1;

--1.	사원 테이블의 구조를 검색하라.
desc emp1;
--2.	부서 테이블의 구조를 검색하라.
desc dept1;
--3.	급여 테이블의 구조를 검색하라.
desc salgrade1;
--4.	사원들의 사원번호, 사원이름, 사원직무를 검색하라.
select empno,ename,job from emp1;
--5.	부서의 부서번호와 부서이름을 검색하라.
select deptno,dname from dept1;
--6.	부서의 부서이름과 지역을 검색하라.
select dname,loc from dept1;
--7.	사원들의 급여와 커미션을 검색하라.
select sal,comm from emp1;
--8.	사원들의 입사일 중복을 제거하고 검색하라.
select distinct hiredate from emp1;
--9.	사원들의 상급자사원번호(mgr)중복을 제거하고 검색하라.
select distinct mgr from emp1;
--10.	사원들의 부서번호 중복을 제거하고 검색하라.
select distinct deptno from emp1;
--11.	사원들의 이름과 6개월 급여의 합을 검색하라.
select ename,sum(sal*6) as mon6 from emp1 group by ename;
--12.	사원들의 6개월 커미션(comm)의 합을 검색하라.
select nvl(comm*6,0) from emp1;
--13.	사원이름을 ‘name’으로 사원의 급여를 ‘salary’로 열의 이름을 부여하여 검색하라.
select ename as name, sal as salary from emp1;
--14.	사원의 사원번호, 사원이름, 입사일, 부서번호를 한글로 바꾸어 검색하라.
select empno as 사원번호,ename as 사원이름,
hiredate as 입사일,deptno as 부서번호 from emp1;
--15.	부서번호, 부서이름, 지역을 한글 제목으로 검색하라.
select deptno as 부서번호,dname as 부서이름,loc as 지역 from dept1;
--16.	사원의 사원직무와 사원이름을 합쳐서 검색하라.
select job||ename from emp1;
--17.	입사일(hiredate) 사원이름을 ’80-12-17에 입사한 SMITH입니다’ 식으로 검색하라.
select to_char(hiredate,'YY-MM-DD')||'에 입사한 '||ename||'입니다'
from emp1;
--18.	10번 부서에 근무하는 사원이름을 검색하라.
select ename from emp1 where deptno=10;
--19.	급여가 2000 이상인 사원들의 사원번호, 사원이름을 검색하라.
select empno,ename from emp1 where sal>=2000;
--20.	사원직무가 “CLERK”인 사원들의 사원번호, 사원이름을 검색하라.
select empno,ename from emp1 where job='CLERK';
--21.	1980년 12월 17일에 입사한 사원이름을 검색하라.
select ename from emp1 where to_char(hiredate,'YYMMDD') like '801217';
--22.	부서번호 30이외의 부서이름과 지역을 검색하라.
select dname,loc from dept1 where deptno not in '30';
--23.	급여등급이 5인 급여의 상위급여와 하위급여를 검색하라.
select hisal,losal from salgrade1 where grade=5;
--24.	‘WARD’사원의 모든 정보를 검색하라.
select * from emp1 where ename='WARD';
--25.	10번 부서의 근무하는 MANAGER의 사원이름을 검색하라.
select ename from emp1 where deptno=10 and job='MANAGER';
--26.	급여가 2000이상이며, 30번 부서에 근무하는 사원들의 사원번호와 사원이름을 검색하라.
select empno,ename from emp1 where sal>=2000 and deptno=30;
--27.	사원직무가 “CLERK”이며, 81년 이후에 입사한 사원들의 사원번호와 사원이름을 검색하라.
select empno,ename from emp1 where job='CLERK' and to_number(to_char(hiredate,'YYMMDD'))>810000;
select empno,ename from emp1 where job='CLERK' 
and hiredate>='1981-01-01';
--28.	20부터 외에 근무하는 MANAGER의 사원이름을 검색하라.
select ename from emp1 where deptno<>20 and job='MANAGER';
--29.	BOSTON이외 지역에 있는 부서이름을 검색하라.
select dname from dept1 where loc<>'BOSTON';
--30.	SALEMAN이며 급여가 1500이상인 사원이름을 검색하라.
select ename from emp1 where job='SALESMAN' and sal>=1500;
--31.	급여가 1000이상이며, 2500이하인 사원의 사원번호, 사원이름, 급여를 검색하라.
select empno,ename,sal from emp1 where sal between 1000 and 2500;
--32.	사원번호가 75XX인 사원의 사원번호, 사원이름, 부서번호를 검색하라.
select empno,ename,deptno from emp1 where empno like '75%';
--33.	부서번호가 10 또는 30에 근무하는 사원들의 사원이름과 급여를 검색하라.
select ename,sal from emp1 where deptno<>20;
--34.	상급자사원번호가 76으로 시작하는 사원들의 사원이름을 검색하라.
select ename from emp1 where mgr like '76%';
--35.	사원번호가 79로 시작하는 사원들의 사원이름, 급여, 커미션을 검색하라.
select ename,sal,comm from emp1 where empno like '79%';
--36.	1981년 2월에 입사한 사원의 사원번호, 사원이름, 부서번호를 검색하라.
select empno,ename,deptno from emp1 
--where to_char(hiredate,'YYMMDD') like '8102%';
--where hiredate between '1981/02/01' and '1981/02/28';
--where hiredate like '1981/02/%';--이거는 작동하지않는다
-- 내 sysdate 형식이 yyyy/mm/dd 로 지정되있어서
where hiredate like '1981-02-%';

--37.	사원이름 중간에 ‘A’가 들어있는 사원의 사원번호와 사원이름을 검색하라.
select empno,ename from emp1 where ename like '%A%';
--38.	상급자사원번호가 NULL인 사원의 사원번호와 사원이름을 검색하라.
select empno,ename from emp1 where mgr is null;
--39.	상급자사원번호가 NULL이 아닌 사원의 사원번호, 이름, 상급자사원번호를 검색하라.
select empno,ename,mgr from emp1 where mgr is not null;
--40.	사원번호가 7902 또는 7781인 사원이름을 검색하라.
select ename from emp1 where empno=7902 OR empno=7781;
select ename from emp1 where empno in (7902,7781);


--1.	상급자사원번호가 7698 또는 7839인 사원의 사원번호와 사원이름을 검색하라.
select empno,ename from emp1 where mgr=7698 or mgr=7839;
--2.	사원직무가 ‘MANAGER’ 또는 ‘SALESMAN’인 사원의 사원번호, 사원이름, 부서번호를 검색하라.
select empno,ename,deptno from emp1 
where job in('MANAGER','SALESMAN');
--3.	사원들의 사원번호와 사원이름을 사원번호 순으로 검색하라.
select empno,ename from emp1 order by empno;
--4.	사원들의 사원번호와 사원이름을 부서번호별 이름순으로 검색하라.
select empno,ename from emp1 order by deptno,ename;
--5.	사원들의 정보를 부서별 급여가 많은 순으로 검색하라.
select * from emp1 order by deptno,sal desc;
--6.	사원들의 정보를 사원직무별 급여 순으로 검색하라.
select * from emp1 order by job,sal;
--7.	사원들의 정보를 부서번호별, 사원직무별, 급여 순으로 검색하라.
select * from emp1 order by deptno,job,sal;
--8.	사원들의 사원이름을 소문자로 검색하라.
select lower(ename) from emp1;
--9.	사원들의 사원이름, 사원직무를 소문자로 검색하라.
select lower(ename),lower(job) from emp1;
--10.	사원들의 사원이름을 대문자로 검색하라.
select upper(ename) from emp1;
--11.	사원들의 사원이름, 사원직무를 대문자로 검색하라.
select upper(ename),upper(job) from emp1;
--12.	사원들의 사원이름을 첫자만 대문자로 검색하라.
select initcap(ename) from emp1;
--13.	사원들의 사원이름과 사원직무를 첫 자만 대문자로 검색하라.
select INITCAP(ename),initcap(job) from emp1;
--14.	사원들의 사원이름과 사원직무를 연결하여 검색하라.(concat이용)
select concat(ename,job) from emp1;
--15.	사원들의 사원이름과 사원이름의 첫 두글자를 검색하라.
select ename,substr(ename,1,2) from emp1;
--16.	사원들의 사원이름, 사원직무 그리고 사원직무의 두번째부터 세글자를 검색하라.
select ename,job,substr(job,2,2) from emp1;
--17.	사원들의 사원이름과 사원이름의 길이를 검색하라.
select ename,length(ename)이름길이 from emp1;
--18.	사원들의 사원이름과 사원직무의 자리수를 검색하라.
select ename,length(job)직무길이 from emp1;
--19.	사원들의 사원이름에 ‘A’가 몇번 째 위치에 있는지 검색하라.
select ename,instr(ename,'A')A몇번째위치 from emp1;
--20.	사원직무에 ‘A’가 몇번 째 위치에 있는지 검색하라.
select job,instr(job,'A')A몇번째위치 from emp1;


--q1
select empno,rpad(substr(empno,1,2),length(empno),'*')as masking_empno,
ename,rpad(substr(ename,1,1),length(ename),'*') from emp;
--q2
select empno,ename,sal,
trunc(sal/21.5,2) as day_pay,
round(sal/21.5/8,1) as time_pay 
from emp;
-- 별칭을 변수로 사용은 안되는 듯 함

--q3
select empno,ename,hiredate,
to_char(next_day(add_months(hiredate,3),2),'YYYY-MM-DD') as r_job,
--hiredate에 90을 더하는 건 좋지않음 3달이 며칠일지는 알 수 없음
NVL(to_char(comm),'N/A') from emp;
--q4
select empno,ename,mgr,
case
when mgr is null then 0000
when mgr between 7500 and 7599 then 5555
when mgr between 7600 and 7699 then 6666
when mgr between 7700 and 7799 then 7777
when mgr between 7800 and 7899 then 8888
else mgr
end as CHG_MGR
from emp1;

--p94 5-1
select * from emp;
--p94 5-2
select * from emp where deptno=30;
--p97 5-3
select * from emp where deptno=30 and job='SALESMAN';
--p98 5-4
select * from emp where deptno=30 or job='CLERK';
--p101 5-5
select * from emp where sal*12=36000;
--p102 5-6
select * from emp where sal>= 3000;
--p102 5-7 
select * from emp where ename>='F';
--p103 5-8
select * from emp where ename<= 'FORZ';
--p104 5-9
select * from emp where sal != 3000;
--p104 5-10
select * from emp where sal<>3000;
--p104 5-11
select * from emp where sal^=3000;
--p105 5-12
select * from emp where not sal = 3000;
--p106 5-13
select * from emp where job ='MANAGER'or
job='SALESMAN' or job='CLERK';


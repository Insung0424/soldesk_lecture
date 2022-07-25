SET SERVEROUTPUT ON; -- 실행결과를 화면에 출력
set serveroutput off;

declare
    v_con NUMBER := 1;
begin
    IF v_con > 1 then
    DBMS_OUTPUT.PUT_LINE('v_con은 1보다 크다');
    elsif v_con < 1 then
    DBMS_OUTPUT.PUT_LINE('v_con은 1보다 작다');
    else
    DBMS_OUTPUT.PUT_LINE('v_con은 1과 같다');
    END IF;
end;
/

declare
    v_score NUMBER := 87;
begin
    case
        when v_score >= 90 then dbms_output.put_line('A');
        when v_score >= 80 then dbms_output.put_line('B');
        when v_score >= 70 then dbms_output.put_line('C');
    end case;
end;
/

--loop
declare 
    v_num number := 0;
    v_sum number := 0;
begin
    loop
        v_num := v_num +1;
        v_sum := v_sum+v_num;
        dbms_output.put_line('현재 v_num,v_sum :' || v_num || ' ' || v_sum);
        exit when v_num = 10;
    end loop;
end;
/

-- for loop
DECLARE
    v_num number;
    v_sum number := 0;
begin
    for v_num in 0 .. 10 loop
        v_sum := v_sum+v_num;
        dbms_output.put_line('현재 v_num,v_sum :' || v_num || ' ' || v_sum);
    end loop;
end;
/

--while
declare 
    v_num number := 0;
    v_sum number := 0;
begin
    while v_num < 10 loop
        v_num := v_num+1;
        v_sum := v_sum+v_num;
        dbms_output.put_line('현재 v_num,v_sum :' || v_num || ' ' || v_sum);
    end loop;
end;
/


--p444 q1
begin
    for i in 0..10 loop
    continue when mod(i,2) = 0;
    dbms_output.put_line('현재 i의 값 : ' || i);
    end loop;
end;
/

create or replace procedure pro_noparam
is
    v_empno number(4) := 7788;
    v_ename varchar2(10);
begin
    v_ename := 'SCOTT';
    dbms_output.put_line('v_empno : ' || v_empno);
    dbms_output.put_line('v_ename : ' || v_ename);
end;
/
execute pro_noparam;

create or replace procedure test2
--프로시저 생성 이름은 test2
(v_stu_no in student.stu_no%type,
-- in은 실행시 직접 입력 v_stu_no에 student.stu_no의 타입을 적용
v_stu_grade in student.stu_grade%type)
is
begin
    update student
    set stu_grade = v_stu_grade
    where stu_no=v_stu_no;
end test2;
/
execute test2(20153075,3);
--execute : 함수 test2(대상이되는학번, 변경할 학년) 실행


create or replace procedure test3
(v_stu_no in student.stu_no%type,
v_stu_name out student.stu_name%type)
is
begin
    select stu_name
    into v_stu_name
    from student
    where stu_no=v_stu_no;
    --stu_name을 가져와서 v_stu_name에 적용한다
end test3;
/
variable d_stu_name varchar2(10); --변수 선언
execute test3(20153075,:d_stu_name);
-- 20153075 에서 가져온 stu_name을 :d_stu_name 으로 저장
print d_stu_name; --변수가 잘 저장되었는지 확인


create or replace procedure test4
(v_sub_no in enrol.sub_no%type,
v_stu_no in enrol.stu_no%type,
v_enr_grade in out enrol.enr_grade%type)
--in out 입력과 동시에 반환
is
begin
    update enrol
        set enr_grade=enr_grade+v_enr_grade
        where stu_no=v_stu_no and sub_no=v_sub_no;
        --학번과 과목번호가 같을 때 점수가 변경됨
    select enr_grade
        into v_enr_grade
        from enrol
        where stu_no=v_stu_no and sub_no=v_sub_no;
end test4;
/
variable d_enr_grade number
begin :d_enr_grade := 10;
end;
/ -- d_enr_grade 를 10으로 저장
execute test4(101,20131001,:d_enr_grade);
--20131001학번,101과목의 점수를 d_enr_grade에 test4함수실행
print d_enr_grade;



--p444 q2
DECLARE
    v_deptno number(2);
begin
    v_deptno := 15;
    case
        when v_deptno = 10 then dbms_output.put_line('DNAME : ACCOUNTING');
        when v_deptno = 20 then dbms_output.put_line('DNAME : RESEARCH');
        when v_deptno = 30 then dbms_output.put_line('DNAME : SALES');
        when v_deptno = 40 then dbms_output.put_line('DNAME : OPERATIONS');
        else dbms_output.put_line('DNAME : N/A');
    end case;
end;
/
    

--p518 q1
create or replace procedure pro_dept_in
(d_deptno in out dept1.deptno%type,
d_dname out dept1.dname%type,
d_loc out dept1.loc%type)
is
begin
    select deptno,dname,loc
    into d_deptno,d_dname,d_loc
    from dept1
    where deptno=d_deptno;
    dbms_output.put_line(d_deptno ||' '|| d_dname ||' '|| d_loc);
end pro_dept_in;
/
DECLARE
    d_deptno  dept1.deptno%type;
    d_dname  dept1.dname%type;
    d_loc  dept1.loc%type;
begin
    d_deptno := 10;
    pro_dept_in(d_deptno,d_dname,d_loc);
end;
/


create table cust(
c_no number(3) not null,
c_name varchar2(10),
c_flag number(1),
c_addr varchar2(20),
c_phone varchar2(20),
constraint c_no_pk primary key(c_no));


create table video(
V_NO NUMBER(1) not null,
constraint pk_v_no primary key(V_NO),
V_NAME varchar2(20),
V_ACTOR varchar2(10),
V_GROUP varchar2(10));



create table rent(
r_no number(1) constraint pk_rent primary key,
r_date date,
c_no number(3) constraint c_no_fk references cust(c_no),
r_rentfee number(5),
v_no number(1) constraint v_no_fk references video(v_no));

insert into cust values(101,'김진수',1,'서울 성북구','02-455-5544');
insert into cust values(102,'김영희',2,'서울 강서구','02-299-2565');
insert into cust values(103,'이영수',3,'서울 서초구','02-555-5555');
insert into cust values(104,'김진숙',1,'서울 동대문구','02-444-4444');

insert into video values(1,'극한직업','류승룡 이하늬','코미디');
insert into video values(2,'기생충','송강호','드라마');
insert into video values(3,'엑시트','조정석 윤아','코미디');
insert into video values(4,'봉오동전투','유해진','액션');
insert into video values(5,'나쁜녀석들','마동석','액션');
insert into video values(6,'82년생김지영','정유미 공유','드라마');

alter table video modify v_actor varchar2(20);

insert into rent values(1,'2020-07-30',101,1000,1);
insert into rent values(2,'2020-07-30',101,500,2);
insert into rent values(3,'2020-08-2',103,500,5);
insert into rent values(4,'2020-08-2',102,1000,6);
insert into rent values(5,'2020-08-2',102,1000,3);
insert into rent values(6,'2020-08-3',104,2000,2);

select * from video;
select * from cust;
select * from rent;

create sequence seq1
increment by 1
START WITH 201
maxvalue 999;

create procedure test5
(v_sub_name in subject.sub_name%type,
v_sub_prof in subject.sub_prof%type,
v_sub_grade in subject.sub_grade%type,
v_sub_dept in subject.sub_dept%type)
is
begin
    insert into subject values(seq1.nextval,v_sub_name,
    v_sub_prof,v_sub_grade,v_sub_dept);
    commit;
end test5;
/
execute test5('PL/SQL','홍길동',3,'컴퓨터정보');
select * from subject;

desc cust;
--고객 테이블의 고객이름, 등급, 주소를 검색해라. (3점)
select c_name,c_flag,c_addr from cust;
--비디오이름과 고객번호, 반납일을 equi join, natural join, join~using을 다 써서 검색해라. (10점)
select v_name,c_no,r_date from video,rent where video.v_no=rent.v_no;
--이영수 고객이 대여한 비디오이름과 주연배우를 검색해라. (equi join) (3점)
select v_name,v_actor from video,rent,cust 
where cust.c_no=rent.c_no and video.v_no=rent.v_no
and c_name in '이영수';
--기생충을 대여한 고객들의 고객번호와 이름을 검색해라. (3점)
select cust.c_no,c_name from video,rent,cust 
where cust.c_no=rent.c_no and video.v_no=rent.v_no
and v_name in '기생충';
--등급이 1등급인 고객이 대여한 비디오 이름을 모두 검색해라. (3점)
select v_name from video where v_no in 
(select v_no from rent natural join cust where c_flag in 1);
--대여료가 2000원 이상인 고객의 수를 검색해라. (3점)
select c_no, sum(r_rentfee) as total_fee
from rent
group by c_no
having sum(r_rentfee) >= 2000;

--고객번호가 103보다 작은 값만 나오도록 대여테이블을 복사하여 
--a_rent 테이블을 만든다. (5점)
create table a_rent as select * from rent 
where c_no<103;
--위에서 만든 a_rent테이블에 (9, 2020-08-01, 101, 1000, 3)
--을 삽입한다. (3점)
insert into a_rent values (9,'2020-08-01',101,1000,3);
--대여테이블의 ‘10’ 으로 시작하는 고객 데이터를 a_rent 
--테이블에 삽입한후, 내용을 확인해라. (5점)
insert into a_rent select * from rent where c_no like '10%';



--고객번호를 입력으로 고객이름을 검색하는 프로시저를 만들어라. 
create or replace procedure find
(f_cus_no in cust.c_no%type) -- 모드
is
    f_cus_name cust.c_name%type; -- 선언부
begin -- 실행부
    select c_name into f_cus_name from cust where c_no = f_cus_no;
    dbms_output.put_line(f_cus_name);
    end find;
/
drop procedure find;
execute find(101);


create or replace function test6
(v_enr_grade in number)
return char --반환값의 자료형
is
    enr_score char;
begin
    if v_enr_grade>=90 then enr_score:='A';
    elsif v_enr_grade>=80 then enr_score:='B';
    elsif v_enr_grade>=70 then enr_score:='C';  
    else enr_score:='F';
    end if;
    return (enr_score);
end test6;
/
variable d_score char; 
--함수는 반환값이 있다 이를 위해 변수선언
execute :d_score := test6(95);
print d_score;

select enr_grade,test6(enr_grade) as 점수 from enrol
where stu_no = 20131001;


--p519 q2
create or replace function func_date
(v_hiredate in date)
return varchar2
is
begin 
    return (to_char(v_hiredate,'yyyy"년 "mm"월" dd"일"'));
end func_date;
/

select ename,hiredate,func_date(hiredate) as 년월일 from emp1;
use ta_lab;

-- Right Join
select cm.course_id, p.id, p.firstname, p.lastname, s.id, s.firstname, s.lastname 
from course_members cm
right join professor p on cm.professor_id = p.id 
right join student s on cm.student_id = s.id ;

select *
from professor p 
right join course_members cm on p.id = cm.professor_id
where cm.professor_id is null;

-- Left Join
select cm.course_id, p.id, p.firstname, p.lastname, s.id, s.firstname, s.lastname 
from course_members cm
left join professor p on cm.professor_id = p.id 
left join student s on cm.student_id = s.id;

select *
from professor p 
left join course_members cm on p.id = cm.professor_id;

-- Group By
select p.firstname, p.lastname, p.age
from Professor p
group by p.firstname;

-- Order By
select *
from professor
order by professor.age;

select *
from student s
order by s.age DESC;

-- Having
Select count(id), firstname, lastname
from Professor p
group by age
having count(id) > 0;

-- Count
select count(college_members.id) as College1_Members
from college_members
where college_members.college_id = 1;

-- Update
update student
set firstname = 'Merline'
where id=1;

update student
set lastname = 'Digginson'
where id=1;

update professor 
set fistname = 'Perry' 
where id =1;

update professor
set lastname = 'The Platypus'
where id = 1;

update category 
set name = 'History', description = 'Learn about the biggest facts of the world story'
where id = 1;

update course
set professor_id = 1, student_id = 1, video_id = 1
where id = 1;

update course
set professor_id = 2, student_id = 1, video_id = 1
where id = 1;

update learning_path
set creation_date = '2020/12/12'
where id = 1;

update hosting
set video_id = 1
where id = 1;

update college
set foundation_age = '1998/04/12'
where id = 1; 

-- Alter Table
alter table student add dni int;
alter table student add birthday datetime;
alter table professor add dni int;
alter table course drop creation_date;
alter table college modify column foundation_age year; 
    
-- Delete
delete from student where age < 19;
delete from student where id = 1;
delete from professor where age < 30;
delete from category where id = 1;
delete from course where learning_path_id = null;
delete from course where professor_id = null and student_id = null and video_id = null;
delete from video where hosting_id = null;
delete from hosting where maximum_storage_gb < 10;
delete from video where duration_mns > 120;
delete from college where professor_id = null and student_id = null;
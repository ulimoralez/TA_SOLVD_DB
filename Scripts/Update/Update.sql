USE ta_lab;

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
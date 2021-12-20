use ta_lab;

-- Insert Into
-- PROFESSORS
insert into Professor(firstname, lastname, age)
values('Araldo', 'Lowin', 35);

insert into Professor(firstname, lastname, age)
values('Rich', 'Ummfrey', 30);

insert into Professor(firstname, lastname, age)
values('Sawyer', 'Geffen', 32);

insert into Professor(firstname, lastname, age)
values('Walton', 'Sweetland', 28);

insert into Professor(firstname, lastname, age)
values('Chucho', 'Seacombe', 35);

insert into Professor(firstname, lastname, age)
values('Hedwig', 'Pinsent', 30);

insert into Professor(firstname, lastname, age)
values('Lazarus', 'Huburn', 32);

insert into Professor(firstname, lastname, age)
values('Fonsie', 'Fair', 28);

-- -----------------------------------------------------
-- Students
insert into Student(firstname, lastname, age)
values('Ulrike', 'Alten', 18);

insert into Student(firstname, lastname, age)
values('Camala', 'St Quenin', 19);

insert into Student(firstname, lastname, age)
values('Tatiania', 'Gogerty', 20);

insert into Student(firstname, lastname, age)
values('Beverie', 'Isles', 21);

insert into Student(firstname, lastname, age)
values('Ryan', 'Denning', 22);

insert into Student(firstname, lastname, age)
values('Gabriella', 'Ringer', 23);
-- -----------------------------------------------------
-- College

insert into College(professor_id, student_id, name, foundation_age)
values(1, 1, 'UTN', '1990/04/12');

-- -----------------------------------------------------
-- Hosting
insert into Hosting(name, maximum_storage_gb, plans)
values('Netlify', 60, '100gb - $50');
-- -----------------------------------------------------
-- Video
insert into video(hosting_id, name, description, duration_mns)
values(1, 'Data Types in Java', 'In this class you will learn about the data types in Java', 12);
-- -----------------------------------------------------
-- Course
insert into Course (description, duration_hs, name, creation_date)
values ('Learn about Java Strings', 3, 'Java Strings', '2010/02/23');

insert into Course (description, duration_hs, name, creation_date)
values ('Learn about Javascript lambdas', 3, 'Javascript lambdas', '2010/02/23');
-- -----------------------------------------------------
-- Course Members
insert into course_members(course_id, professor_id, student_id)
value (1, 1, 1);
insert into course_members(course_id, professor_id, student_id)
value (1, 1, 2);
insert into course_members(course_id, professor_id, student_id)
value (1, 1, 3);

insert into course_members(course_id, professor_id, student_id)
value (1, 2, 4);
insert into course_members(course_id, professor_id, student_id)
value (1, 2, 5);
insert into course_members(course_id, professor_id, student_id)
value (1, 2, 6);
-- -----------------------------------------------------
-- Category
insert into Category (description, name)
values ('Curses about progamming', 'Programming');
-- -----------------------------------------------------
-- Learning Path
insert into learning_path(name, description, creation_date)
values('Test Automation with Java', 'You will learn about all the tools and good practices to be a Engineer in test with Java', '2021/08/10');
-- -----------------------------------------------------
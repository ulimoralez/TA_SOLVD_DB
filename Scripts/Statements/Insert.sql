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

insert into Student(firstname, lastname, age)
values('Mozelle', 'Pleasance', 22);

insert into Student(firstname, lastname, age)
values('Binni', 'MacMeanma', 23);
-- -----------------------------------------------------
-- College

insert into College(name, foundation_age)
values('UTN', '1990/04/12');

insert into College(name, foundation_age)
values('SOLVD', '1990/04/12');

insert into College(name, foundation_age)
values('UBA', '1990/04/12');

insert into College(name, foundation_age)
values('UNNE', '1990/04/12');

insert into College(name, foundation_age)
values('BP', '1990/04/12');

-- -----------------------------------------------------

-- College_Members
insert into College_Members(college_id, professor_id, student_id)
values(1, 1, 1);

insert into College_Members(college_id, professor_id, student_id)
values(1, 1, 2);

insert into College_Members(college_id, professor_id, student_id)
values(1, 1, 3);

insert into College_Members(college_id, professor_id, student_id)
values(1, 1, 4);

insert into College_Members(college_id, professor_id, student_id)
values(1, 1, 5);

insert into College_Members(college_id, professor_id, student_id)
values(2, 1, 1);

insert into College_Members(college_id, professor_id, student_id)
values(2, 1, 2);

insert into College_Members(college_id, professor_id, student_id)
values(2, 1, 3);

insert into College_Members(college_id, professor_id, student_id)
values(3, 2, 4);

insert into College_Members(college_id, professor_id, student_id)
values(3, 2, 5);

insert into College_Members(college_id, professor_id, student_id)
values(3, 2, 6);
-- -----------------------------------------------------
-- Hosting
insert into Hosting(name, maximum_storage_gb, plans)
values('Netlify', 60, '100gb - $100');

insert into Hosting(name, maximum_storage_gb, plans)
values('Hostinger', 50, '100gb - $100');

insert into Hosting(name, maximum_storage_gb, plans)
values('WebEmpresa', 100, '100gb - $50');

insert into Hosting(name, maximum_storage_gb, plans)
values('Neolo', 60, '120gb - $120');

insert into Hosting(name, maximum_storage_gb, plans)
values('Wiroos', 60, '90gb - $90');

insert into Hosting(name, maximum_storage_gb, plans)
values('SiteGround', 60, '15gb - $50');

-- -----------------------------------------------------
-- Video
insert into video(hosting_id, name, description, duration_mns)
values(1, 'Data Types in Java', 'In this class you will learn about the data types in Java', 12);

insert into video(hosting_id, name, description, duration_mns)
values(2, 'Classes and POO', 'In this class you will learn about the data types in Java', 12);

insert into video(hosting_id, name, description, duration_mns)
values(1, 'Interfaces & Static', 'In this class you will learn about the data types in Java', 12);

insert into video(hosting_id, name, description, duration_mns)
values(3, 'Exceptions & Logger', 'In this class you will learn about the data types in Java', 12);

insert into video(hosting_id, name, description, duration_mns)
values(1, 'Collections', 'In this class you will learn about the data types in Java', 12);

insert into video(hosting_id, name, description, duration_mns)
values(4, 'Maven', 'In this class you will learn about the data types in Java', 12);
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

insert into Category (description, name)
values ('Curses about maths', 'Maths');

insert into Category (description, name)
values ('Curses about data science', 'Data Science');

insert into Category (description, name)
values ('Curses about design', 'Graphic Design');
-- -----------------------------------------------------
-- Learning Path
insert into learning_path(name, description, creation_date)
values('Test Automation with Java', 'You will learn about all the tools and good practices to be a Engineer in test with Java', '2021/08/10');

insert into learning_path(name, description, creation_date)
values('Desktop application with Java FX', 'You will learn about building desktop application with JavaFX	', '2021/08/10');

insert into learning_path(name, description, creation_date)
values('Web development with Javascript', 'You will learn about all the tools and good practices to build webpages with JavaScript', '2021/08/10');
-- -----------------------------------------------------
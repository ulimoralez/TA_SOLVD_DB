	use ta_lab;

-- Insert Into
insert into Professor(firstname, lastname, age)
values('Araldo', 'Lowin', 35);

insert into Professor(firstname, lastname, age)
values('Rich', 'Ummfrey', 30);

insert into Student(firstname, lastname, age)
values('Valina', 'Vedyaev', 20);

insert into Student(firstname, lastname, age)
values('Karleen', 'Eastbury', 18);

insert into College(professor_id, student_id, name, foundation_age)
values(1, 1, 'UTN', '1990/04/12');

insert into Course (description, duration_hs, name, creation_date)
values ('Learn about Java Collections', 3, 'Java Collections', '2010/02/23');

insert into Hosting(name, maximum_storage_gb, plans)
values('Netlify', 60, '100gb - $50');

insert into learning_path(name, description, creation_date)
values('Test Automation with Java', 'You will learn about all the tools and good practices to be a Engineer in test with Java', '2021/08/10');

insert into video(hosting_id, name, description, duration_mns)
values(1, 'Data Types in Java', 'In this class you will learn about the data types in Java', 12);

insert into Category (description, name)
values ('Curses about progamming', 'Programming');


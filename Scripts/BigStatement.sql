use ta_lab;

select *
from course_members cm
inner join course c on cm.course_id = c.id
inner join student s on cm.student_id = s.id
inner join professor p on cm.professor_id = p.id;

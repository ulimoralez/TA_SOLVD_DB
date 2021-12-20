use ta_lab;

select course_members.course_id as CourseId,
course_members.professor_id as ProfessorID,
course.name as CourseName,
course.description as CourseDescription,
professor.firstname as ProfessorName,
professor.lastname as ProfessorLastName,
course_members.student_id as StudentID,
student.firstname as StudentName,
student.lastname as StudentLastname,
collegeProfessor.id as CollegeID,
collegeProfessor.name as CollegeName
from course_members
inner join course on course_members.course_id = course.id
inner join professor on course_members.professor_id = professor.id
inner join student on course_members.student_id = student.id
inner join college as collegeProfessor on course_members.professor_id = collegeProfessor.professor_id
inner join college as collegeStudent on course_members.student_id = collegeStudent.student_id

use ta_lab;

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
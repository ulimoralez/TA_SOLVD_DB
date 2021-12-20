-- Create Databse called "ta_lab"
-- CR EATE DATABASE ta_lab;
-- Once its created, use the keyword USE
-- USE ta_lab;

CREATE DATABASE IF NOT EXISTS ta_lab;

USE ta_lab;

CREATE TABLE IF NOT EXISTS `Course` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `professor_id` int,
  `student_id` int,
  `video_id` int,
  `learning_path_id` int,
  `description` varchar(255),
  `duration_hs` float,
  `name` varchar(255),
  `creation_date` date
);

CREATE TABLE IF NOT EXISTS `Course_Category` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `course_id` int,
  `category_id` int
);

CREATE TABLE IF NOT EXISTS `Category` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `description` varchar(255),
  `name` varchar(255)
);

CREATE TABLE IF NOT EXISTS `Video` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `hosting_id` int,
  `name` varchar(255),
  `description` varchar(255),
  `duration_mns` int
);

CREATE TABLE IF NOT EXISTS `Hosting` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `video_id` int,
  `name` varchar(255),
  `maximum_storage_gb` int,
  `plans` varchar(255)
);

CREATE TABLE IF NOT EXISTS `Course_LearningPath` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `course_id` int,
  `learning_path_id` int
);

CREATE TABLE IF NOT EXISTS `Learning_Path` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `creation_date` datetime
);

CREATE TABLE IF NOT EXISTS `Professor` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `specialization_id` int,
  `firstname` varchar(255),
  `lastname` varchar(255),
  `age` int
);

CREATE TABLE IF NOT EXISTS `Student` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `firstname` varchar(255),
  `lastname` varchar(255),
  `age` int
);

CREATE TABLE IF NOT EXISTS `College` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `professor_id` int,
  `student_id` int,
  `name` varchar(255),
  `foundation_age` datetime
);

CREATE TABLE IF NOT EXISTS `Specialization` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `foundation_age` datetime
);

CREATE TABLE IF NOT EXISTS `Specialization_Professor` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `professor_id` int,
  `specialization_id` int
);

CREATE TABLE IF NOT EXISTS `Specialization_College` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `college_id` int,
  `specialization_id` int
);

ALTER TABLE `Course_Category` ADD FOREIGN KEY (`course_id`) REFERENCES `Course` (`id`);

ALTER TABLE `Course_Category` ADD FOREIGN KEY (`category_id`) REFERENCES `Category` (`id`);

ALTER TABLE `Course` ADD FOREIGN KEY (`video_id`) REFERENCES `Video` (`id`);

ALTER TABLE `Video` ADD FOREIGN KEY (`hosting_id`) REFERENCES `Hosting` (`id`);

ALTER TABLE `Course_LearningPath` ADD FOREIGN KEY (`course_id`) REFERENCES `Course` (`id`);

ALTER TABLE `Course_LearningPath` ADD FOREIGN KEY (`learning_path_id`) REFERENCES `Learning_Path` (`id`);

ALTER TABLE `Course` ADD FOREIGN KEY (`professor_id`) REFERENCES `Professor` (`id`);

ALTER TABLE `Course` ADD FOREIGN KEY (`student_id`) REFERENCES `Student` (`id`);

ALTER TABLE `College` ADD FOREIGN KEY (`professor_id`) REFERENCES `Professor` (`id`);

ALTER TABLE `College` ADD FOREIGN KEY (`student_id`) REFERENCES `Student` (`id`);

ALTER TABLE `Specialization_Professor` ADD FOREIGN KEY (`professor_id`) REFERENCES `Professor` (`id`);

ALTER TABLE `Specialization_Professor` ADD FOREIGN KEY (`specialization_id`) REFERENCES `Specialization` (`id`);

ALTER TABLE `Specialization_College` ADD FOREIGN KEY (`college_id`) REFERENCES `College` (`id`);

ALTER TABLE `Specialization_College` ADD FOREIGN KEY (`specialization_id`) REFERENCES `Specialization` (`id`);

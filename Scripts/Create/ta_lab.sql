-- Create Databse called "ta_lab"
-- CR EATE DATABASE ta_lab;
-- Once its created, use the keyword USE
-- USE ta_lab;


drop  database ta_lab;

CREATE DATABASE IF NOT EXISTS ta_lab;

USE ta_lab;

CREATE TABLE `Course` (
  `courseId` int PRIMARY KEY AUTO_INCREMENT,
  `learningPathId` int,
  `name` varchar(255),
  `description` varchar(255),
  `duration_hs` float,
  `creation_date` datetime
);

CREATE TABLE `Course_Category` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `courseId` int,
  `categoryId` int
);

CREATE TABLE `Course_Video` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `courseId` int,
  `videoId` int
);

CREATE TABLE `Category` (
  `categoryId` int PRIMARY KEY AUTO_INCREMENT,
  `description` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `Video` (
  `videoId` int PRIMARY KEY AUTO_INCREMENT,
  `hostingId` int,
  `name` varchar(255),
  `description` varchar(255),
  `duration_mns` int
);

CREATE TABLE `Hosting` (
  `hostingId` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `maximum_storage_gb` int,
  `plans` varchar(255)
);

CREATE TABLE `Course_LearningPath` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `courseId` int,
  `learningPathId` int
);

CREATE TABLE `LearningPath` (
  `learningPathId` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `creation_date` datetime
);

CREATE TABLE `Professor` (
  `professorId` int PRIMARY KEY AUTO_INCREMENT,
  `specializationId` int,
  `firstname` varchar(255),
  `lastname` varchar(255),
  `age` int
);

CREATE TABLE `Student` (
  `studentId` int PRIMARY KEY AUTO_INCREMENT,
  `firstname` varchar(255),
  `lastname` varchar(255),
  `age` int
);

CREATE TABLE `Course_Professor` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `professorId` int,
  `courseId` int
);

CREATE TABLE `Course_Student` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `studentId` int,
  `courseId` int
);

CREATE TABLE `College` (
  `collegeId` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `foundation_age` datetime
);

CREATE TABLE `College_Professor` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `collegeId` int,
  `professorId` int
);

CREATE TABLE `College_Student` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `collegeId` int,
  `studentId` int
);

CREATE TABLE `Specialization` (
  `specializationId` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `foundation_age` datetime
);

CREATE TABLE `Specialization_Professor` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `professorId` int,
  `specializationId` int
);

ALTER TABLE `Course_Professor` ADD FOREIGN KEY (`professorId`) REFERENCES `Professor` (`professorId`);

ALTER TABLE `Course_Professor` ADD FOREIGN KEY (`courseId`) REFERENCES `Course` (`courseId`);

ALTER TABLE `Course_Student` ADD FOREIGN KEY (`studentId`) REFERENCES `Student` (`studentId`);

ALTER TABLE `Course_Student` ADD FOREIGN KEY (`courseId`) REFERENCES `Course` (`courseId`);

ALTER TABLE `Course_LearningPath` ADD FOREIGN KEY (`courseId`) REFERENCES `Course` (`courseId`);

ALTER TABLE `Course_LearningPath` ADD FOREIGN KEY (`learningPathId`) REFERENCES `LearningPath` (`learningPathId`);

ALTER TABLE `Course_Category` ADD FOREIGN KEY (`courseId`) REFERENCES `Course` (`courseId`);

ALTER TABLE `Course_Category` ADD FOREIGN KEY (`categoryId`) REFERENCES `Category` (`categoryId`);

ALTER TABLE `Video` ADD FOREIGN KEY (`hostingId`) REFERENCES `Hosting` (`hostingId`);

ALTER TABLE `Course_Video` ADD FOREIGN KEY (`courseId`) REFERENCES `Course` (`courseId`);

ALTER TABLE `Course_Video` ADD FOREIGN KEY (`videoId`) REFERENCES `Video` (`videoId`);

ALTER TABLE `College_Professor` ADD FOREIGN KEY (`collegeId`) REFERENCES `College` (`collegeId`);

ALTER TABLE `College_Student` ADD FOREIGN KEY (`collegeId`) REFERENCES `College` (`collegeId`);

ALTER TABLE `College_Student` ADD FOREIGN KEY (`studentId`) REFERENCES `Student` (`studentId`);

ALTER TABLE `College_Professor` ADD FOREIGN KEY (`professorId`) REFERENCES `Professor` (`professorId`);

ALTER TABLE `Specialization_Professor` ADD FOREIGN KEY (`professorId`) REFERENCES `Professor` (`professorId`);

ALTER TABLE `Specialization_Professor` ADD FOREIGN KEY (`specializationId`) REFERENCES `Specialization` (`specializationId`);

package utils;

import entities.*;

import java.sql.Timestamp;
import java.util.Calendar;

public class CreatedObjects{
	private static long now = System.currentTimeMillis( );
	private static Timestamp timestamp = new Timestamp( now );
	private static College collegeWithId = new College( "collegeWithId", timestamp, 25 );
	private static College collegWithoutId = new College( "collegWithoutId", timestamp );
	private static Course courseWithoutId = new Course( 3, 3, "courseWithoutId", "Description", 8, timestamp );
	private static LearningPath learningPathWithId = new LearningPath( 25, "learningPathWithId",
			"learningPathWithIdDescription", timestamp );
	private static Specialization specializationWithId = new Specialization( 25, "specializationWithId",
			"specializationWithId", timestamp );
	private static Category categoryWithId = new Category( 25, "TestCategoryWithId", "TestCategoryWithId" );
	private static Category categoryWithoutId = new Category( "categoryWithoutId", "categoryWithoutId" );
	private static Course courseWithId = new Course( 25, 3, 3, "courseWithId", "Description", 10 );
	private static Hosting hostingWithId = new Hosting( 2, 2, "HostinghWithId", 60, "Plans Description" );
	private static Hosting hostingWithoutId = new Hosting( "HostinghWithoutId", 80, "Plan description" );
	private static Professor professorWithId = new Professor( 25, "ProfessorWithId", "Id", 45 );
	private static Professor professorWithoutId = new Professor( "ProfessorWithoutId", "NoId", 40 );
	private static Student studentWithId = new Student( 25, "StudentWithId", "Withid", 20 );
	private static Video videoWithId = new Video( 25, 5, "videoWithId", "videoWithId", 15 );
	
	static{
		Calendar.getInstance( ).set( 2021, Calendar.APRIL, 22 );
	}
}

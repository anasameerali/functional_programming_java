package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP05FunctionalCustomClasses {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		Predicate<? super Course> reviewScoreGt90 = course -> course.getReviewScore() >90;
		Predicate<? super Course> reviewScoreGt95 = course -> course.getReviewScore() >95;
		Predicate<? super Course> reviewScoreLt80 = course -> course.getReviewScore() <80;

		
		System.out.println(courses.stream().allMatch(reviewScoreGt90));
		System.out.println(courses.stream().noneMatch(reviewScoreGt95));
		System.out.println(courses.stream().anyMatch(reviewScoreLt80));
		
		
		Comparator<Course> comapreByNumberOfStudentsAsc = Comparator.comparingInt(course -> course.getNoOfStudents());
		Comparator<Course> comapreByNumberOfStudentsDsc = comapreByNumberOfStudentsAsc.reversed();
		
		
		System.out.println(courses.stream().sorted(comapreByNumberOfStudentsAsc).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comapreByNumberOfStudentsDsc).collect(Collectors.toList()));
		// compare by number of students and if they are equal then compare by review
		
		Comparator<Course> compareByNoOfStudentsThenByReview =comapreByNumberOfStudentsAsc.thenComparingInt(course -> course.getReviewScore()).reversed();

		System.out.println(courses.stream().sorted(compareByNoOfStudentsThenByReview).collect(Collectors.toList()));
		
		// top 5
		System.out.println(courses.stream().sorted(comapreByNumberOfStudentsDsc).limit(5).collect(Collectors.toList()));
		
		// skip 3 rows
		
		System.out.println(courses.stream().sorted(comapreByNumberOfStudentsDsc).skip(3).collect(Collectors.toList()));
		
		// take records until it  meet the condition review score  <=95
		Predicate<Course> pred = course -> course.getReviewScore() <=95;
		
		System.out.println(courses.stream().takeWhile(pred).collect(Collectors.toList()));
		
		//skip the records until  it  meet the condition review score  <=95
        
		System.out.println(courses.stream().dropWhile(pred).collect(Collectors.toList()));
		
		//course with max number of students 
		
		System.out.println(courses.stream().max(comapreByNumberOfStudentsAsc));
		
		//first element
		
		System.out.println(courses.stream().findFirst());
		
		// return any of the value
		
		System.out.println(courses.stream().findAny());
		
		//total  number of students review score >90
		
		System.out.println(courses.stream().filter(reviewScoreGt90).mapToInt(course -> course.getNoOfStudents()).sum());
		
		// group by category
		Function<Course, String> fn = course -> course.getCategory();
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(fn)));
		
		// number of courses in each category
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(fn,Collectors.counting())));
		
		//  max number of students in each category
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(fn,Collectors.maxBy(comapreByNumberOfStudentsAsc))));
		
		// to take the name of courses in each category
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(fn,Collectors.mapping(Course::getName,Collectors.toList()))));



	}

}

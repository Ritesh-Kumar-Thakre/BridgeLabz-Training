package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class Collage {
	public static void main(String[] args) {
		Student s1 = new Student("Ritesh", 'A', 98);
		Student s2 = new Student("Ranjan", 'B', 98);
		Student s3 = new Student("Ram", 'A', 98);
		Student s4 = new Student("Rohan", 'C', 98);
		Student s5 = new Student("Shayam", 'F', 98);
		Student s6 = new Student("Manoj", 'C', 98);
		Student s7 = new Student("Sharoj", 'B', 98);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
		Map<Character, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getGrade));
		map.forEach((grade, list) -> {
			System.out.println("Grade " + grade + ":");
			list.forEach(s -> System.out.println("  " + s.name));
		});

	}
}

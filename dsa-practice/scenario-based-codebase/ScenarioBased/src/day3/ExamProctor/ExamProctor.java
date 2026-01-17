package day3.ExamProctor;

import java.util.Scanner;

public class ExamProctor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u1 = new User("Ritesh", 98);
		Questions q1 = new Questions(1, "What is red?");
		Questions q2 = new Questions(2, "What is blue?");
		Questions q3 = new Questions(3, "What is mango?");
		Questions q4 = new Questions(4, "What is banana?");
		Questions q5 = new Questions(5, "Who lives in home?");
		UserRecord record = new UserRecord();
		record.addQuestion(q1);
		record.addQuestion(q2);
		record.addQuestion(q3);
		record.addQuestion(q4);
		record.addQuestion(q5);
		record.printRecord();

		System.out.println(u1.name + " enter your answers for above question in one word:");

		Result r = new Result();
		r.userAnswer.put(q1.questionID, sc.next());
		r.userAnswer.put(q2.questionID, sc.next());
		r.userAnswer.put(q3.questionID, sc.next());
		r.userAnswer.put(q4.questionID, sc.next());
		r.userAnswer.put(q5.questionID, sc.next());

		r.correctAnswer.put(q1.questionID, "Colour");
		r.correctAnswer.put(q2.questionID, "Colour");
		r.correctAnswer.put(q3.questionID, "Fruit");
		r.correctAnswer.put(q4.questionID, "Fruit");
		r.correctAnswer.put(q5.questionID, "Humans");

		System.out.println("Total score: "+r.printScore());

	}
}

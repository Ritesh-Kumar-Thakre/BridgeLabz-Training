package day4.EduMentor;

public class Quizzes {

	private String[] questions;
	private char[] correctAnswers;
	private int score;

	public Quizzes(String[] questions, char[] correctAnswers) {
		this.questions = questions;
		this.correctAnswers = correctAnswers;
	}

	public double evaluate(char[] userAnswers) {
		score = 0;

		for (int i = 0; i < correctAnswers.length; i++) {
			if (userAnswers[i] == correctAnswers[i]) {
				score++;
			}
		}

		return ((double) score / correctAnswers.length) * 100;
	}

	public void showQuestions() {
		for (int i = 0; i < questions.length; i++) {
			System.out.println((i + 1) + ". " + questions[i]);
		}
	}
}

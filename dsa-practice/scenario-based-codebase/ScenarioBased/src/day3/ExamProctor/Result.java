package day3.ExamProctor;

import java.util.HashMap;

public class Result {
	HashMap<Integer, String> userAnswer = new HashMap<>();
	HashMap<Integer, String> correctAnswer = new HashMap<>();

	public int printScore() {
		int score = 0;
		for (Integer qid : userAnswer.keySet()) {
			if (userAnswer.get(qid).equalsIgnoreCase(correctAnswer.get(qid))) {
				score += 10;
			}
		}
		return score;
	}
}

package day3.ExamProctor;

public class Node {
	Questions questions;
	Node next;

	Node(Questions questions) {
		this.questions = questions;
		this.next = null;
	}
}

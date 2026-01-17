package day3.ExamProctor;

public class UserRecord {
	static Node head;
	static Node tail;

	public void addQuestion(Questions q) {
		Node newNode = new Node(q);
		newNode.next = head;
		head = newNode;
	}

	private void printReverse(Node node) {
		if (node == null) {
			return;
		}

		printReverse(node.next); // go deeper first

		System.out.println("Question ID: " + node.questions.questionID + " | Question: " + node.questions.question);
	}

	public void printRecord() {
		if (head == null) {
			System.out.println("No navigation history found.");
			return;
		}

		System.out.println("\n--- Question Navigation History ---");
		printReverse(head);
	}

}

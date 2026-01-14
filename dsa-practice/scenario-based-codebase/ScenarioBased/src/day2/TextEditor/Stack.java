package day2.TextEditor;

public class Stack {
	Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public void push(Text data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public Text pop() {
		if (isEmpty()) {
			Text t1 = new Text(-1, "Text is emplty");
			return t1;
		}
		Text top = head.data;
		head = head.next;
		return top;
	}

	public void displayStack() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

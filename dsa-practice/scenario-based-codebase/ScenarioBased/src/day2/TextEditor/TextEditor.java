package day2.TextEditor;

public class TextEditor {
	public static void main(String[] args) {

		Text t1 = new Text(1, "Ritesh thakre");
		Text t2 = new Text(2, "Ram shyam");

		Stack undo = new Stack();
		Stack redo = new Stack();

		undo.push(t1);
		undo.push(t2);
		System.out.println("Undo Stack");
		undo.displayStack();

		redo.push(undo.pop());
		redo.push(undo.pop());
		System.out.println("\nredo Stack");
		redo.displayStack();
	}
}

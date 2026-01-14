package day2.TextEditor;

public class Text {
	protected int textNumber;
	protected String text;

	public Text(int textNumber, String text) {
		this.text = text;
		this.textNumber = textNumber;
	}

	public void displayText() {
		System.out.println("Text No. " + textNumber + " " + text);
	}

	@Override
	public String toString() {
		return "Text No. " + textNumber + " : " + text;
	}

}

package day1.BrowserBuddy;

public class BrowserBuddyApp {
	public static void main(String[] args) {

		BrowserHistory history = new BrowserHistory();
		TabManager tabs = new TabManager();

		history.visit("google.com");
		history.visit("youtube.com");
		history.visit("github.com");

		history.back();
		history.back();
		history.forward();

		System.out.println("Current Page: " + history.getCurrentPage());

		tabs.closeTab(history.getCurrentPage());
		tabs.reopenTab();
	}
}

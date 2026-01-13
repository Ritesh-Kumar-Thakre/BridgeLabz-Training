package day1.BrowserBuddy;

import java.util.Stack;

public class TabManager {

	private Stack<String> closedTabs = new Stack<>();

	public void closeTab(String currentPage) {
		closedTabs.push(currentPage);
		System.out.println("Tab closed: " + currentPage);
	}

	public void reopenTab() {
		if (!closedTabs.isEmpty()) {
			String page = closedTabs.pop();
			System.out.println("Reopened tab: " + page);
		} else {
			System.out.println("No closed tabs to restore");
		}
	}
}

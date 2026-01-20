package day4.SmartShelf;

import java.util.*;

public class User {
	public static void main(String[] args) {
		DigitalLibraryKiosk dlk = new DigitalLibraryKiosk();
		dlk.addBook();
		dlk.addBook();
		dlk.addBook();
		dlk.addBook();
		dlk.addBook();
		dlk.addBook();

		dlk.printBooks();
	}
}

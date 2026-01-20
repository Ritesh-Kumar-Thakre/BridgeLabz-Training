package day4.EventManager;

import java.util.*;

public class Top {
	ArrayList<Ticket> tickets = new ArrayList<>();

	public void quickSort(ArrayList<Ticket> tickets, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int pivotIndex = partition(tickets, si, ei);
		quickSort(tickets, si, pivotIndex - 1);
		quickSort(tickets, pivotIndex + 1, ei);
	}

	public int partition(ArrayList<Ticket> tickets, int si, int ei) {
		double pivot = tickets.get(ei).ticketPrice;
		int i = si - 1;

		for (int j = si; j < ei; j++) {
			if (tickets.get(j).ticketPrice <= pivot) {
				i++;
				Ticket temp = tickets.get(j);
				tickets.set(j, tickets.get(i));
				tickets.set(i, temp);
			}
		}
		Ticket temp = tickets.get(i + 1);
		tickets.set(i + 1, tickets.get(ei));
		tickets.set(ei, temp);
		return i + 1;
	}

	public void printTickets() {
		System.out.println("Top Tickets");
		for (int i = 0; i < tickets.size(); i++) {
			System.out.println("Event: " + tickets.get(i).eventName + "\nTicket Price: " + tickets.get(i).ticketPrice);
			System.out.println("-------------------------");
		}
	}
}

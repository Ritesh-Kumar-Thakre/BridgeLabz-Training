package day4.EventManager;

public class EventManager {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("Dance", 4223.50);
		Ticket t2 = new Ticket("Drama", 5412.40);
		Ticket t3 = new Ticket("Hip-Hop", 9644.56);
		Ticket t4 = new Ticket("Singing", 3265.26);
		Ticket t5 = new Ticket("SSH", 9745.39);
		Ticket t6 = new Ticket("Stand UP", 8520.49);
		Ticket t7 = new Ticket("Play", 6541.65);

		Top top = new Top();
		top.tickets.add(t1);
		top.tickets.add(t2);
		top.tickets.add(t3);
		top.tickets.add(t4);
		top.tickets.add(t5);
		top.tickets.add(t6);
		top.tickets.add(t7);

		top.quickSort(top.tickets, 0, top.tickets.size() - 1);
		top.printTickets();
	}
}

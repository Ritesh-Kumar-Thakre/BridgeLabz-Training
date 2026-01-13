package day1.AmbulanceRoute;

public class AmbulanceRoute {

	private UnitNode head = null;

	// Add hospital unit
	public void addUnit(String name) {
		UnitNode newNode = new UnitNode(name);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			UnitNode temp = head;
			while (temp.next != head)
				temp = temp.next;

			temp.next = newNode;
			newNode.next = head;
		}
	}

	// Mark a unit unavailable
	public void markUnavailable(String name) {
		UnitNode temp = head;
		do {
			if (temp.unitName.equals(name)) {
				temp.available = false;
				System.out.println(name + " is under maintenance.");
				return;
			}
			temp = temp.next;
		} while (temp != head);
	}

	// Remove unit from circle
	public void removeUnit(String name) {
		if (head == null)
			return;

		UnitNode curr = head, prev = null;

		do {
			if (curr.unitName.equals(name)) {
				if (curr == head) {
					UnitNode last = head;
					while (last.next != head)
						last = last.next;

					head = head.next;
					last.next = head;
				} else {
					prev.next = curr.next;
				}
				System.out.println(name + " removed from route.");
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
	}

	// Find nearest available unit
	public void routePatient() {
		if (head == null) {
			System.out.println("No units available!");
			return;
		}

		UnitNode temp = head;

		do {
			if (temp.available) {
				System.out.println("Patient sent to: " + temp.unitName);
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("All units busy! Patient waiting.");
	}

	// Display circular path
	public void displayUnits() {
		if (head == null)
			return;

		UnitNode temp = head;
		System.out.print("Route: ");

		do {
			System.out.print(temp.unitName + " → ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to " + head.unitName + ")");
	}
}

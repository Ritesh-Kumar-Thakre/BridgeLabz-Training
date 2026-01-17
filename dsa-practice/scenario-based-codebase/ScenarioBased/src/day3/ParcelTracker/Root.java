package day3.ParcelTracker;

public class Root {
	static Stage head;
	static Stage tail;

	public void add(String name) {
		Stage newStage = new Stage(name);
		if (head == null) {
			head = tail = newStage;
			return;
		}
//		newStage.next = head;
//		head = newStage;
		tail.next = newStage;
		tail = newStage;
	}

	public void addCustomCheckpoint(String targetStageName, String name) {
		// until current stage is not equals to target (while loop tak)
		Stage current = head;
		while (current != null && !current.name.equals(targetStageName)) {
			current = current.next;
		}
		// jab current target ke equal ho jaye tab
		if (current != null) {
			Stage newStage = new Stage(name);
			newStage.next = current.next;// new stage ke next ko cureent ke next se assign
			current.next = newStage;// then current ke next me new stage add kr dege

			if (current == tail) { // inserting after last node
				tail = newStage;
			}
		}
	}

	public void trackParcel() {
		if (head == null) {
			System.out.println("No tracking information available!");
			return;
		}

		Stage temp = head;
		Stage last = null;

		System.out.print("\nTracking Path: ");

		while (temp != null) {
			System.out.print(temp.name + " ---> ");
			last = temp;
			temp = temp.next;
		}
		System.out.print("POD Verified");

		if (!last.name.equalsIgnoreCase("Delivered")) {
			System.out.println("\n⚠ Parcel lost in transit! Last known stage: " + last.name);
		} else {
			System.out.println("\n Parcel delivered successfully!");
		}
	}

	public void printRoot() {
		System.out.println("\n***Root***");
		if (head == null) {
			System.out.println("No root found");
			return;
		}
		Stage temp = head;
		while (temp != null) {
			System.out.print(temp.name + " ---> ");
			temp = temp.next;
		}
		System.out.println("POD Verified");
	}

	public void printUpdatedRoot() {
		System.out.println("\n#Checkpoit added");
		if (head == null) {
			System.out.println("No root found");
			return;
		}
		Stage temp = head;
		while (temp != null) {
			System.out.print(temp.name + " ---> ");
			temp = temp.next;
		}
		System.out.println("POD Verified");
	}
}

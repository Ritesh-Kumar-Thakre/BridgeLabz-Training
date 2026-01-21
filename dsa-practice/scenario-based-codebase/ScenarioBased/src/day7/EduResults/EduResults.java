package day7.EduResults;

public class EduResults {
	public static void main(String[] args) {
		StudentsScore s1 = new StudentsScore("Ritesh", 98);
		StudentsScore s2 = new StudentsScore("Rj", 78);
		List l1 = new List();
		l1.districtList.add(s1);
		l1.districtList.add(s2);
		l1.printList();

		StudentsScore s3 = new StudentsScore("Raj", 96);
		StudentsScore s4 = new StudentsScore("Ram", 87);
		List l2 = new List();
		l2.districtList.add(s3);
		l2.districtList.add(s4);
		l2.printList();

		MainServer main = new MainServer();
		main.collectFromDistrict(l1);
		main.collectFromDistrict(l2);

		main.mergeShot(0, main.mainList.size() - 1);
		main.printMainList();

	}
}

/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/

import java.util.*;
public class BusAttendance{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int students=10;
		int pCount=0;
		int aCount=0;
		String names[]=new String[students];
		String record[]=new String[students];
		
		// Applying the required logic
		System.out.println("Enter names");
		for(int i =0;i<students;i++){
			names[i]=sc.next();
		}
		int k =0;
		for(String name:names){
			System.out.println(name);
			System.out.println("Give attendance 'p' or 'a'");
			String call=sc.next();
			if(call.equals("p")){
				record[k++]="P";
				pCount++;
			}else{
				record[k++]="A";
				aCount++;
			}
		}
		
		// Printing the results
		System.out.println("\n------- Student Attendance -------");
        System.out.printf("%-5s %-15s %-10s%n", "No", "Name", "Attendance");
        System.out.println("---------------------------------------------");

        for(int i = 0; i < students; i++) {
            System.out.printf("%-5d %-15s %-10s%n",
                    (i+1), names[i], record[i]);
        }
	}
}
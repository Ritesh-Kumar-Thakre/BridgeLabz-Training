import java.util.*;
public class StudentVoteChecker{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int students=10;
		int age[]= new int[students];
		
		// Applying the required logic and Printing the results
		StudentVoteChecker s= new StudentVoteChecker();
		System.out.println("Enter students ages:");
		for(int i=0;i<students;i++){
			age[i]=sc.nextInt();
			if(s.canStudentVote(age[i])){
				System.out.println("This student can vote");
			}else{
				System.out.println("This student cannot vote");
			}
		}
		sc.close();
	}
	
	// Method to check Student can Vote or not
	public boolean canStudentVote(int age){
		if(age<=0){
			return false;
		}else if(age>=18){
			return true;
		}
		return false;
	}
}
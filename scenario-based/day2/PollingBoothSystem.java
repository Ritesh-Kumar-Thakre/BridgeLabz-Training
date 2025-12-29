import java.util.*;
public class PollingBoothSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1 =0;
        int candidate2 =0;
        int candidate3 =0;
		
		// Applying the required logic
        while(true){
            System.out.print("Enter age (or -1 to stop): ");
            int age = sc.nextInt();
            if(age== -1) {
                System.out.println("Voting session ended.");
                break;
            }
            if(!isEligible(age)){
                System.out.println(" Not eligible to vote");
                continue;
            }
            System.out.println("Choose your candidate:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.print("Enter your vote (1/2/3): ");

            int vote = sc.nextInt();
            switch(vote){
                case 1 ->{
                    candidate1++;
                    System.out.println("✔ Vote recorded for Candidate A");
                }
                case 2 ->{
                    candidate2++;
                    System.out.println("✔ Vote recorded for Candidate B");
                }
                case 3 ->{
                    candidate3++;
                    System.out.println("✔ Vote recorded for Candidate C");
                }
                default -> System.out.println("⚠ Invalid vote — not counted");
            }
        }

        // Printing Result
        System.out.println("\n====== Voting Summary ======");
        System.out.println("Candidate A Votes : " +candidate1);
        System.out.println("Candidate B Votes : " +candidate2);
        System.out.println("Candidate C Votes : " +candidate3);
        sc.close();
    }

    // Method to check eligibility
    static boolean isEligible(int age){
        return age>=18;
    }
}

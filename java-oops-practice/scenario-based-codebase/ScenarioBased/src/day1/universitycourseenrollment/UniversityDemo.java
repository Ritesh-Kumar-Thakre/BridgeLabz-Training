package day1.universitycourseenrollment;

public class UniversityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Undergraduate("U909", "Ashish");
        Student s2 = new Postgraduate("P202", "Ravi", "Data Science");

        
        Faculty profDavid = new Faculty("Dr. David");

        
        Enrollment ashishCS = new Enrollment(s1, "Computer Science");
        Enrollment raviAI = new Enrollment(s2, "Advanced AI");

        
        System.out.println("--- Grading Period ---");
        profDavid.gradeStudent(ashishCS, 95.0);
        profDavid.gradeStudent(raviAI, 88.0);

        System.out.println("\n--- Final Transcripts ---");
        s1.getTranscript();
        s2.getTranscript();
	}

}

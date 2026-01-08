package day4.EduMentor;

public class EduMentor {

    public static void main(String[] args) {

        Learner learner = new Learner(
                "Ritesh",
                "ritesh@mail.com",
                101,
                "FULL_TIME"
        );

        Instructor instructor = new Instructor(
                "Dr. Sharma",
                "sharma@edu.com",
                201,
                "AI & ML",
                12
        );

        String[] questions = {
                "Java is OOP language?",
                "Interface supports multiple inheritance?"
        };

        char[] correctAnswers = {'A', 'A'};
        char[] userAnswers = {'A', 'B'};

        Quizzes quiz = new Quizzes(questions, correctAnswers);

        quiz.showQuestions();
        double percentage = quiz.evaluate(userAnswers);

        LearnerProgress progress = new LearnerProgress(percentage);
        learner.setPercentage(progress.getPercentage());

        System.out.println("\n--- Learner Details ---");
        learner.displayUser();

        learner.generateCertificate();

        System.out.println("\n--- Instructor Details ---");
        instructor.displayUser();
    }
}

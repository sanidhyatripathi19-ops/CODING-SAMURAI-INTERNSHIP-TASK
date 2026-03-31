//quiz application
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. What is 2 + 2?",
            "4. Who is known as father of Java?",
            "5. Which data structure uses FIFO?"
        };

        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"},
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. 3", "B. 4", "C. 5", "D. 6"},
            {"A. James Gosling", "B. Dennis Ritchie", "C. Elon Musk", "D. Mark Zuckerberg"},
            {"A. Stack", "B. Queue", "C. Tree", "D. Graph"}
        };

        char[] answers = {'B', 'B', 'B', 'A', 'B'};

        int score = 0;

        System.out.println("=== Welcome to Quiz ===");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        System.out.println("\n=== Quiz Finished ===");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}

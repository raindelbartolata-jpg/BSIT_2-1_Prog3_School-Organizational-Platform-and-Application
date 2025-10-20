import java.util.Scanner;
public class Grade_Assigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Welcome to Laluta Grade Assigner!");
        System.out.println("Please enter your numerical score to get your letter grade.");
        
        System.out.print("Enter your numerical score: ");
        int score = scanner.nextInt();
        
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
           grade = 'F';
        }
        
        System.out.println("Your letter grade is: " + grade);
        scanner.close();
    }
}


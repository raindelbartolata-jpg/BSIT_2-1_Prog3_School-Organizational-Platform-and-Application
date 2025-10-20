import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------Welcome to LaLuTa Factorial App------");
        System.out.println("Enter a number to find its factorial: ");
        int num = input.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);

        input.close();
    }
}

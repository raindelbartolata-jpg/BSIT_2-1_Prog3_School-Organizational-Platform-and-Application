import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("------Welcomee to LaLuTa Fibonacci App!!------");

        System.out.println("Enter your first value: ");
        int firstnum = input.nextInt();

        System.out.print("Enter the range (number of terms): ");
        int range = input.nextInt();

        int a = firstnum, b = firstnum, c;

        System.out.println("\n--------Fibonacci Sequence---------:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < range; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        input.close();
    }
}
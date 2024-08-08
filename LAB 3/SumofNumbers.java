import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number (m): ");
        int m = input.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = m; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from " + m + " to " + n + " is: " + sum);

        
    }
}
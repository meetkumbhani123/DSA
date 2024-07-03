import java.util.Scanner;


public class SumSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;
        int termSum = 0;

        for (int i = 1; i <= n; i++) {
            termSum += i;
            sum += termSum;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
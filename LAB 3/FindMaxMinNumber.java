import java.util.Scanner;

public class FindMaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        int maxPosition = 0;
        int minPosition = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxPosition = i;
            }

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minPosition = i;
            }
        }

        System.out.println("Position of the largest number: " + maxPosition);
        System.out.println("Position of the smallest number: " + minPosition);

        
    }
}
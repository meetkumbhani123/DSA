import java.util.Scanner;

public class ArrayReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the replacemnt number: ");
        int replacement = scanner.nextInt();

        
                int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == firstNumber) {
                arr[i] = replacement;
                break; 
            }
        }

        
        System.out.println("Index of replaced element: " + index);
        System.out.print("after replacement: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

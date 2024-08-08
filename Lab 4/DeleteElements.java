import java.util.Scanner;

public class DeleteElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

       
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the location to delete (0-based index): ");
        int location = scanner.nextInt();

        
        if (location < 0 || location >= n) {
            System.out.println("Invalid location!");
        } else {
           
            for (int i = location; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            
            n--;

           
            System.out.println("Array after deleting the number:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
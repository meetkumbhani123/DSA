import java.util.*;

public class InsertInarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = arr.length;
        System.out.println("Enter the position where you want to insert the element: ");
        int pos = sc.nextInt();
        System.out.println("Enter the insert element:  ");
        int x = sc.nextInt();
        int[] newarr = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            if (i < pos - 1) {
                newarr[i] = arr[i];
            } else if (i == pos - 1) {
                newarr[i] = x;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        for (int i = 0; i < m + 1; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
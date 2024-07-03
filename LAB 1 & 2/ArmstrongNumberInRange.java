
import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first range number");
        int n = sc.nextInt();
        System.out.println("Enter second number for range");
        int m = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int arm = 0;
            int num = temp;
            while (num > 0) {
                int rem = num % 10;
                arm += Math.pow(rem, 3);
                num = num / 10;
            }
            if (arm == temp) {
                System.out.println(temp);
            }
        }
    }
}
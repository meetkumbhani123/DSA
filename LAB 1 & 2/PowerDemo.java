
import java.util.Scanner;
public class PowerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println("Enter the power");
        int power = scanner.nextInt();
        int c=num;
        for(int i=1; i<power; i++) {

            c=c*num;
    
    }
    System.out.println("power = " + c);
}
}

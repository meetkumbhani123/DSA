import java.util.Scanner;
public class Factere {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = SC.nextInt();
    System.out.println("facter is: ");
    for (int i = 1; i < n; i++) {
        if(n % i == 0) {
            System.out.println(i);
    }
    
    }
    
}
    
}
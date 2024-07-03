import java.util.Scanner;

public class powerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        int ans = power(n);
        System.out.println("Ans is : "+ans);
       
    }
    public static int power(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*power(n-1);
        }
    }
}
    


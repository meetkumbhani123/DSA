import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int totaldays = sc.nextInt();
        int year=totaldays/365;
        int week=(totaldays%365)/7;
        int days=(totaldays%365)%7;
        System.out.println(year+" year: "+week+" weeks: "+days+" days");
    }
}
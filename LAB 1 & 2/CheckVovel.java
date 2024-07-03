import java.util.Scanner;
public class CheckVovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is a vovel");
        }
        else{
            System.out.println(ch+" is not a vovel");
        }


    }
}

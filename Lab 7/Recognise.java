import java.util.Stack;
import java.util.Scanner;

public class Recognise {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int index=1;
        s.push("c");
        char next = str.charAt(0);
        while (next != 'c') {
          
            
            if(next==' '){
                System.out.println("invalid");
            }
            else{
                s.push(String.valueOf(next));
                next= str.charAt(0);
            }
            index++;
        }
        while(s.peek()!="c" && str.length()<index){
            next = str.charAt(0);
          String x = s.push(String.valueOf(next));
        if(next != x.charAt(0)){
                System.out.println("invalid");
          }

        }
        next= str.charAt(0);
        if(next == ' '){
            System.out.println("valid");

        }
        else{
          System.out.println("invalid");
        }
        
        
    }
}
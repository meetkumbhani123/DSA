import java.util.Scanner;
public class duplicate {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the index of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements of array: ");
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }   

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    
                    break;
                }
                
            }
        }
        if(flag){
            System.out.println("Duplicate element  found");
        }
        else{
            System.out.println("Duplicate element not found");
        }

        
        




    }
}
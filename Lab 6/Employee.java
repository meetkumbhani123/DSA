import java.util.*;
class emplyoee_info{
    long id;
    String name;
    String Degegnation;
    double salary;
    emplyoee_info(long id,String name,String Degegnation,double salary){
        this.Degegnation=Degegnation;
        this.id=id;
        this.name=name;
        this.salary=salary;


    }
    public void printinfo(){
        System.out.println("id: "+id+"name: "+name+"Degegnation: "+Degegnation);
    }
}
public class Employee {
public static void main(String[] args) {
    emplyoee_info e1= new emplyoee_info(23010101148l,"meet","vice-president",2000000);
    e1.printinfo();
}
    
}
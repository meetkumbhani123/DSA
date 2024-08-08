import java.util.*;

class Student {
    int enroll_no;
    String name;
    int semester;
    double cpi;

    Student(int enroll_no, String name, int semester, double cpi) {
        this.enroll_no = enroll_no;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }
}

public class Student_detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(0,"",0,0.0);
            System.out.println("Enter the enroll no: ");
            students[i].enroll_no= sc.nextInt();
            System.out.println("Enter the name: ");
            sc.nextLine(); // add this line to consume the newline character
            students[i].name = sc.nextLine();
            System.out.println("Enter the semester: ");
            students[i].semester=sc.nextInt();
            System.out.println("Enter the cpi: ");
            students[i].cpi=sc.nextDouble();

            
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i]!= null) {
                System.out.println("Enroll no: " + students[i].enroll_no + " Name: " + students[i].name + " Semester: " + students[i].semester + " CPI: " + students[i].cpi);
            }
        }
    }
}
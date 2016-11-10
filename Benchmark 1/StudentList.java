
/**
 * Write a description of class StudentList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentList
{
    private ArrayList <Student> students = new ArrayList();

    public void addStudent(){
        System.out.println("You chose add student");
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        double gpa = 0;
        String name = "No Name";
        System.out.println("********************");
        System.out.println("Enter Student Name");
        name = scanner.nextLine();
        System.out.println("Enter Student Number");
        id = scanner.nextInt();
        System.out.println("Enter Student GPA");
        gpa = scanner.nextDouble();
        String clearBuffer = scanner.nextLine();
        //         Student student = new Student(id, gpa, name);
        students.add(new Student(id, gpa, name));
    }

    public String printStudent(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getStuName(String stuName));
            System.out.println(students.get(i).getStuID(int stuID));
            System.out.println(students.get(i).getStuGPA(double stuGPA));
        }
    }
}
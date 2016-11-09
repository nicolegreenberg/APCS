
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
    ArrayList<String> students = new ArrayList<String>();

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
        Student student = new Student(id, gpa, name);
        //         students.add(student(id, gpa, name));
    }
    public void printAll(){
        System.out.print(students);
    }

    }
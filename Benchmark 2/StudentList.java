
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

    public void parseUserInput(String name, String stuName){
        String firstName;
        String middleName;
        String lastName;
        int count;
        if(name.indexOf(",") > -1){
            for(int i = 0; i < name.length(); i++){
                if(name.indexOf(i) = " "){
                    count ++;
                }
            }
            if(count > 1){
                lastName = name.substring(0, name.indexOf(","));
                
            }
        }
    }

    public void printStudent(){
        int control = -1;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i) != null){
                System.out.println("Name: " + students.get(i).getStuName());
                System.out.println("ID: " + students.get(i).getStuID());
                System.out.println("GPA: " + students.get(i).getStuGPA());
                control++;
            }
        }
    }
}
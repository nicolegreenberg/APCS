
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
        name.parseUserInput();
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
        String substring1;
        String substring2;
        String sstring1;
        String sstring2;
        if(name.indexOf(",") > -1){
            lastName = name.substring(0, name.indexOf(","));
            substring1 = name.substring(name.indexOf(",") + 1);
            firstName = substring1.substring(0, substring1.indexOf(" "));
            substring2 = substring1.substring(substring1.indexOf(" ") + 1);
            middleName = substring2;
        }else if(name.indexOf(" ") > -1){
            firstName = name.substring(0, name.indexOf(" "));
            sstring1 = name.substring(name.indexOf(" ") + 1);
            if(sstring1.indexOf(" ") > -1){
                middleName = sstring1.substring(0, sstring1.indexOf(" "));
                sstring2 = sstring1.substring(sstring1.indexOf(" "));
                lastName = sstring2;
            } else{
                lastName = sstring1.substring(0, sstring1.indexOf(" "));
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
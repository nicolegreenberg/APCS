
/**
 * Write a description of class StudListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudListRunner
{public static void main(String[] args){
        int stuIndex = 0;
        StudentList studlist = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int control = 0;
        String cntrl = "y";
        while(cntrl.equals("y") || cntrl.equals("yes")){
            System.out.println("\u001b");
            System.out.println("1. Add a Student");
            System.out.println("2. Print List");
            System.out.println("3. Quit");
            System.out.println("What would you like to do?");
            if(control == 1){
                if(stuIndex < 3){
                    studlist.addStudent(stuIndex);
                    stuIndex++;
                }else{
                    System.out.println("Sorry, the list is full");

                }
            }
            else if(control == 2){
                studList.printStudent();
            }else if(control == 3){
                cntrl = "Quit";
            }else{
                Scanner sc = new Scanner(System.in);
                System.out.println("Not an option, press 1, 2, or 3");
                System.out.println("Press return to continue");
                String clearBuffer = sc.nextLine();
            }
            String clearBuffer = scanner.nextLine();
        }
    }

    //         public void printStudent(){
    //             System.out.println("
    //     }
}
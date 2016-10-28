/**
 * Write a description of class ListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListRunner
{
   public static void main(String[] args){
       int stuIndex = 0;
       StudList studlist = new StudList();
       Scanner scanner = new Scanner(System.in);
       int control = 0;
       String cntrl = "y";
       while(cntrl.equals("y") || cntrl.equals("yes")){
           System.out.println("\u001b");
           System.out.println("1. Add a Student");
           System.out.println("2. Print List");
           System.out.println("3. Quit");
           System.out.println("What would you like to do?");
           control.nextInt();
           if(control == 1){
               if(stuIndex < 3){
                   studList.addStudent(stuIndex);
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
        public void addStudent(int studentIndex){
            System.out.println("You chose add student");
            Scanner scanner = new Scanner(System.in);
            int id = 0;
            double gpa = 0;
            String name = "No Name";
            System.out.println("********************");
            System.out.println("Enter Student Name");
            name = scanner.nextLine();
            System.out.println("Enter Student Number");
            id = scanner.nextLine();
            System.out.println("Enter Student GPA");
            gpa = scanner.nextLine();
            String clearBuffer = scanner.nextLine();
            Student student = new student(id, gpa, name);
            students[studentIndex] = student;
        }
        public void printStudent(){
            System.out.println("
    }
}
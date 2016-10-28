/**
 * Write a description of class Student here.
 * 
 * Nicole Greenberg 
 * @version (a version number or a date)
 */
public class Student
{
    int stuID;
    double stuGPA;
    String stuName;
    public Student(int id, double gpa, String name)
    {
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }

    public int getStuID(int stuID)
    {
        return stuID;
    }

    public double getStuGPA(double stuGPA){
        return stuGPA;
    }

    public String getStuName(String stuName){
        return stuName;
    }

    public int setStuID(int x){
        stuID = x;
        return stuID;
    }

    public double setStuGPA(double y){
        stuGPA = y;
        return stuGPA;
    }

    public String setStuName(String z){
        stuName = z;
        return stuName;
    }
}
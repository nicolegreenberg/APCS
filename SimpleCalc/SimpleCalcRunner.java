
/**
 * Write a description of class SimpleCalcRunner here.
 * 
 * Nicole Greenberg
 * August 23, 2016
 */
public class SimpleCalcRunner
{
    // instance variables - replace the example below with your own
    public static void main (String [] args) {
        int n1 = 1123;
        int n2 = 567;
        SimpleCalc sc = new SimpleCalc (n1, n2);
        System.out.println("Numbers: " + n1 + ", " + n2);
        System.out.println("The Sum is: " + sc.add());
        System.out.println("The Diff is: " + sc.subtract());
        System.out.println("The Product is: " + sc.mult());
        System.out.println("The Quotient is: " + sc.div());
        System.out.println("n1 greater than n2: " + sc.isGreater());
    }
}


/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
     public static void main(String[] args){
        fun4(1);
    }
    //Problems 2 & 3
    public static void fun(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            fun(x-1);
        }
    }
    //Before Test: 1 & 54321
    //After Test:1 & 54321

    //Problem 4
    public static void fun1(int x)
    {
        if(x >= 0)
        {
            System.out.print(x);
            fun1(x-1);
        }
    }
    //Before Test: 0
    //After Test: 0

    //Problem 5
    public static void fun2(int x)
    {
        if(x < 5)
        {
            System.out.print(x);
            fun2(x+1);
            System.out.print(x);
        }
    }
    //Before Test: 45
    //After Test: 44

    //Problem 6
    public static void fun3(int x)
    {
        if(x < 5){
            fun3(x-1);
            System.out.print(x);
        }
    }
    //Before Test: 
    //After Test:

    //Problem 7
    public static int fun4(int x){
        if(x < 3)
            return 1;
        else
            return x + fun4(x - 1);
    }
    //Before Test: 1
    //After Test: 1

    //Problem 8
    public static int fun5(int x)
    {
        if(x < 1)
            return 1;
        else
            return x + fun5(x - 1);
    }
    //Before Test: 7
    //After Test: 11

    //Problem 9
    public static int wacky(int x, int y)
    {
        if(x <= 1)
            return y;
        else
            return wacky(x - 1,y - 1) + y;
    }
    //Before Test: 11
    //After Test: 11

    //Problem 10
    public static int go(int x, int y)
    {
        if(x <= 1)
            return y;
        else
            return go(x - 1,y) + y;
    }
    //Before Test: 7
    //After Test: 8

    //Problem 11
    public static String wow(String s, int pos)
    {
        if(pos > s.length())
            return s.substring(0, s.length()/2);
        else
            return s + wow(s.substring(pos), pos + 1);
    }
    //Before Test:pacmancman3
    //After Test: pacmancman
    
    //Problem 12
    //c
    
    //Problem 13
    //c
    
    //Problem 14
    //d
    
    //Sorting 1
    //compareTo
    
    //2
    //
    
    //3
    //12 5 18 2 9 1
    //1 5 18 2 9 12
    //1 2 18 5 9 12
    //1 2 5 18 9 12
    //1 2 5 9 18 12
    //1 2 5 9 12 18
    
    //4
    //12 5 18 2 9 1
    //5 12 18 2 9 1
    //2 5 12 18 9 1
    //2 5 9 12 18 1
    //1 2 5 9 12 18
    
    //5
    //9
    
    //6
    //12 5 18 2 9 1
    //12 5 18     2 9 1
    //12 5   18     2 9   1
    //12   5   18     2   9   1
    //5 12   18     2 9   1
    //5 12 18     1 2 9
    //1 2 5 9 12 18
    
    //Abstract 1
    //a. true
    //b. true
    //c. false
    //d. true
    //e. true
    
    //2
    //1
    
    //3
    //e
    
    //4
    //b

}


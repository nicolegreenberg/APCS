
/**
 * Write a description of class SimpleCalc here.
 * 
 * Nicole Greenberg
 * August 23, 2016
 */
  public class SimpleCalc
{
   int firstNumber;
   int secondNumber;
   
public SimpleCalc(int x, int y)
   {
       firstNumber = x;
       secondNumber = y;
}

public int add(){
        return firstNumber + secondNumber;
    }
 public int subtract(){
        return firstNumber - secondNumber;
}
    
public int mult(){
    return firstNumber * secondNumber;
}
public int div(){
    return firstNumber / secondNumber;
}
public boolean isGreater(){
    if( firstNumber > secondNumber) return true;
    else return false;
}
}

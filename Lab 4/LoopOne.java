
/**
 * Write a description of class LoopOne here.
 * 
 * Nicole Greenberg 
 * Sept. 9
 */
public class LoopOne
{
    private int[] numbers = new int [10];
    private String print = "";
    public LoopOne(){
    }
    public void loadArray(){
        
        for( int i=0; i<numbers.length; i++){
            numbers[i] = 5 * (i + 1);
            print = print + numbers[i] + " \t ";
        }
    }
    public String printArray(){
        return print;

        }
}

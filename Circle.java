
/**
 * Write a description of class Circle here.
 * 
 * @Nicole Greenberg 
 * @313
 */
public class Circle extends Shape
{
    //overriding
    public String getColor(int x){
        if(x == 1){
            return "blue";
        }else if(x == 2){
            return "green";
        }
        return "red";
    }
    
    //overloading
    public int getArea(int y){
        return 6 * y;
    }
}

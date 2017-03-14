
/**
 * Write a description of class Triangle here.
 * 
 * @Nicole Greenberg 
 * @313
 */
public class Triangle extends Shape
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
    public double getArea(double b, double h){
        return .5 * b * h;
    }
}

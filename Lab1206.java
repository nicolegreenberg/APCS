
/**
 * Write a description of class Lab1206 here.
 * 
 * @author Nicole Greenberg 
 * @version (120616)
 */
import java.util.*;
public class Lab1206
{
    ArrayList<String> strings = new ArrayList();
//     /**
//      * Constructor for objects of class Lab1206
//      */
//     public Lab1206()
//     {
//         // initialise instance variables
//         x = 0;
//     }

    public String scrambleWord(String str){
        char char1;
        char char2;
        for(int i = 0; i < str.length() -1; i++){
            if(str.charAt(i) == 'a' && str.charAt(i + 1) != 'a'){
                char1 = str.charAt(i);
                char2 = str.charAt(1 + 1);
                char1 = str.charAt(i + 1);
                char2 = 'a';
            }
        }
        return str;
    }
    public String scrambleOrRemove(String str){
        if(str.scrambleWord().equals(str)){
            strings.get(indexOf(str) + 1) = strings.get(indexOf(str));
        }
    }
}

//A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {
     if(other.toString().length() > orig.length()){
         return other.toString().length();
        }

     return 1; 
  }

  public String toString() { return orig; }
}
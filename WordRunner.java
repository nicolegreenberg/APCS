//A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		
		ArrayList<Word> words = new ArrayList<Word>();
		words.add(x);
		words.add(y);
		words.sort();
		System.out.print(words);
  }
}
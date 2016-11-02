/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);

        // Demonstrate indexOf
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        
        // Demonstrate other indexOf
        public String indexOf(String str, int fromIndex){
            
        int bob = sample.indexOf("fast");
        System.out.print
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);

        //  Try other methods here:

        //         String x = "true";
        //         String y = "false";
        //         String z = "false";
        //         System.out.println(x.equals(y));
        //         System.out.println(!x.equals(y));
        //         System.out.println(!(x.equals(y) || y.equals(z)));
        //         System.out.println(!(x.equals(y) && y.equals(z)));

        //         String s1 = "The big Frog Ate the Fly";
        //         String s2 = "I love Mississippi";
        //         System.out.println("a = " + s1.substring(20));
        //         System.out.println("a = " + s1.substring(0,4));
        //         System.out.println("c = " + s2.substring(2,6));

        //         String s1 = "The big Frog Ate the Fly";
        //         String s2 = "I love Mississippi";
        //         System.out.println("a = " + s1.indexOf("i"));
        //         System.out.println("b = " + s2.indexOf("i"));
        //         System.out.println("c = " + s1.indexOf("Ate"));

        //         String s1 = "Superman is better than Batman";
        //         String s2 = s1.substring(s1.indexOf(("better"),11));
        //         System.out.println("Batman is" + s2 + s1.substring(0,8));
    }

}

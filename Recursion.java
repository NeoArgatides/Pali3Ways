/**
 * Neo Argatides
 */
import java.util.*;
import java.lang.*;
public class Recursion
{
    // instance variables - replace the example below with your own
    private int errorCode;

    public Recursion()
    {
        // initialise instance variables
        errorCode = 0;
    }
       
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        String input, convert;
        int through = 0;
        int is = 0;
        
        System.out.println("Input a string");
        input = keyboard.nextLine();
        convert = input.toLowerCase();
        convert = convert.replaceAll("[\\W]", "");
            
        boolean pali = check(convert, through, is);
        
        if(pali == true)
        {
            System.out.println("That is a palindrome");
        }
        else
        {
            System.out.println("That is not a palindrome");
        }
    }
    
        
    public static boolean check(String word, int through, int is)
    {
        if(through <= (word.length() - 1))
        {
            if(word.charAt(through) == word.charAt((word.length() - 1) - through))
            {
                through++;
                is++;
                
                check(word, through, is);
            }
        }
        
        if(is == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
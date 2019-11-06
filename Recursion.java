/**
 * Neo Argatides
 */
import java.util.*;
import java.lang.*;
public class Recursion
{
    // instance variables - replace the example below with your own
    private int errorCode;
    public static int through;
    public static int is;

    public Recursion()
    {
        // initialise instance variables
        errorCode = 0;
    }
       
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        Keyinput kInput = new Keyinput();
        String input, convert;
        through = 0;
        is = 0;
        
        kInput.printPrompt("Input a string");
        input = keyboard.nextLine();
        convert = input.toLowerCase();
        convert = convert.replaceAll("[\\W]", "");
            
        boolean pali = check(convert);
        
        if(pali == true)
        {
            kInput.printPrompt("That is a palindrome");
        }
        else
        {
            kInput.printPrompt("That is not a palindrome");
        }
    }
    
        
    public static boolean check(String word)
    {
        if(through <= (word.length() - 1))
        {
            if(word.charAt(through) == word.charAt((word.length() - 1) - through))
            {
                through++;
                is++;
                
                check(word);
            }
        }
        
        if(is == word.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
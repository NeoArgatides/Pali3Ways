
/**
 * Neo Argatides
 */
import java.util.*;
import java.lang.*;
public class Build
{
    // instance variables - replace the example below with your own
    private int errorCode;

    public Build()
    {
        // initialise instance variables
        errorCode = 0;
    }

    public void backforth()
    {
        StringBuilder build;
        Scanner keyboard = new Scanner (System.in);
        Keyinput kInput = new Keyinput();
        System.out.print('\u000C');
        String input = "";
        String convert = "";
        String backwards;
        int length = 0;
        while(!convert.equals("q")) //repeat until string is Q or q
        {
            kInput.printPrompt("Input a string (type Q to exit): ");
            input = kInput.inString();
            convert = input;
            convert = input.toLowerCase();
            convert = convert.replaceAll("[\\W]", "");
            
            length = convert.length();
            if(length > 1) //string has to be more than 1 character
            {
                if(!convert.equals("q"))
                {
                    build = new StringBuilder(convert);
                    backwards = build.reverse().toString(); //reverse string
                    
                    if(convert.equals(backwards)) //check if forward is same as backwards
                    {
                        kInput.printPrompt("\"" + input + "\" is a palindrome");
                    }
                    else
                    {
                        kInput.printPrompt("\"" + input + "\" is not a palindrome");
                    }
                }
            }
            else if(!convert.equals("q"))
            {
                kInput.printPrompt("String is too short");
            }
        }
    }
}
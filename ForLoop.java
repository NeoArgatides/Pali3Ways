/**
 * Neo Argatides
 */
import java.util.*;
import java.lang.*;
public class ForLoop
{
    // instance variables - replace the example below with your own
    private int errorCode;

    public ForLoop()
    {
        // initialise instance variables
        errorCode = 0;
    }
    
    public static void main()
    {
         Scanner keyboard = new Scanner(System.in);  
         Keyinput kInput = new Keyinput();
         String word, convert;  
         int i = 0;
         int x = 0;
         int length;
         char [] forward, backward;
            
         kInput.printPrompt("Input a string");
         word = keyboard.nextLine();
         convert = word.toLowerCase();
         convert = convert.replaceAll("[\\W]", "");
             
         x = 0;
         length = convert.length(); 
         forward = convert.toCharArray();
         backward = convert.toCharArray();
             
         for(i = length - 1; i >= 0; i--) 
         {
             backward[x] = forward[i]; 
             x++;
         }
         String reverse = new String(backward);
             
         if(convert.equals(reverse)) 
         {  
             kInput.printPrompt("That is a palindrome");
         } 
         else 
         {
             kInput.printPrompt("That is not a palindrome");
         }
     } 
}
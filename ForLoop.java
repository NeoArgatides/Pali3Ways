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
         String word, convert;  
         int i = 0;
         int x = 0;
         int length;
         char [] forward, backward;
            
         System.out.println("Input a string");
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
             System.out.println("That is a palindrome");
         } 
         else 
         {
             System.out.println("That is not a palindrome");
         }
     } 
}
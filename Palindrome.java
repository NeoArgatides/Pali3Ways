
/**
 * Neo Argatiddes
 */
import java.util.*;
public class Palindrome
{
    // instance variables - replace the example below with your own
    private int errorCode;

    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome()
    {
        // initialise instance variables
        errorCode = 0;
    }

    public static void main()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print('\u000C');
        Recursion again = new Recursion();
        ForLoop loop = new ForLoop();
        Build back = new Build();
        Keyinput input = new Keyinput();
        
        int exit = 1;
        
        while(exit != 0)
        {
           input.printPrompt("---------------------------------");
           input.printPrompt("Type 0 to quit");
           input.printPrompt("Type 1 for Recursion");
           input.printPrompt("Type 2 for Forloop");
           input.printPrompt("Type 3 for Build");
           input.printPrompt("---------------------------------");
           exit = keyboard.nextInt();
           
           switch(exit) //choose
           {
              case 0:
                input.printPrompt("Goodbye!");
                break;
              case 1:
               again.main();
                break;
              case 2:
                loop.main();
                break;
              case 3:
                back.backforth();
                break;
           }
        }
    }
}

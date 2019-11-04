
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

    public void main()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print('\u000C');
        Recursion again = new Recursion();
        ForLoop loop = new ForLoop();
        Build back = new Build();
        
        int exit = 1;
        
        while(exit != 0)
        {
           System.out.println("---------------------------------");
           System.out.println("Type 0 to quit");
           System.out.println("Type 1 for Recursion");
           System.out.println("Type 2 for Forloop");
           System.out.println("Type 3 for Build");
           System.out.println("---------------------------------");
           exit = keyboard.nextInt();
           
           switch(exit) //choose
           {
              case 0:
                System.out.println("Goodbye!");
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

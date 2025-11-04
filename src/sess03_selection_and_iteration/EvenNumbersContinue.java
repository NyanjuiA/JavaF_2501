package sess03_selection_and_iteration;

/**
 * Java program that displays the even numbers between 20 - 50 using a for 
 * loop and the continue keyword.
 * 
 * @author a.nyanjui
 */
public class EvenNumbersContinue
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // Variable to be used in the progam
        int num = 20;
        System.out.println("The even numbers between 20 to 50 are: ");
        
        for(; num <= 50; num++)
        {
            if(num % 2 == 1)
                continue;
            System.out.printf("%d, ",num);
        }
        System.out.println("");
    }
}

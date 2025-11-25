package sess09_exceptions;

/**
 * Java program to demonstrate NumberFormatException and ArithmeticException.
 * 
 * @author a.nyanjui
 */
public class Mathematics
{
    //============================================
    // Class Methods
    //============================================
    public static long addNums(String num1, String num2) throws InvalidNumberFormatException
    {
        try
        {
            int n1 = Integer.parseInt(num1); // Try to convert num1 to integer
            int n2 = Integer.parseInt(num2); // Try to convert num2 to integer
            return (long) (n1 + n2); 
        } catch (NumberFormatException nfe)
        {
            // Catch and handle NumberFormat exception if either num1 or num2 is
            // not a valid integer
            System.err.println("Error: " + nfe.getLocalizedMessage());
            throw new InvalidNumberFormatException("One or both of the input "
                    + "values is not a valid number.");
        }
    }
    
    public static long multiplyNums(int num1, int num2)
    {
        return (long)(num1 * num2); // Multiply the two numbers and return the products as a long
    }
    
    public static int subtractNums(int num1, int num2)
    {
        return num1 - num2; // subtract the two numbers and return the products as an integer
    }
    
    public static int divideNums(int num1, int num2) throws DivideByZeroException
    {
        try
        {            
            return num1 / num2; // return the quotient of num1 divided by num2
        } catch (ArithmeticException ae)
        {
            // Catch and handle ArithmeticException when division by zero occurs
            System.err.println("Error: " + ae.getLocalizedMessage());
            throw new DivideByZeroException("Division by zero is not allowed");
        }
    }
    
    // main method begins program execution
    public static void main(String[] args)
    {
        try
        {
        // Demonstrate the addNums method with valid and invalid input
        System.out.println("Result of adding '5' and '3' is: " + addNums("5", "3"));
        //System.out.println("Result of adding '2' and 'ten' is: " + addNums("2", "ten"));
        
        // Demonstrate the multiplyNums method
        System.out.println("Result of multiplying '5' and '4' is" + multiplyNums(5, 4));
        
        // Demonstrate the subtractNums method
        System.out.println("Result of subtracting '8' and '4' is" + subtractNums(8, 4));
        
        // Demonstrate the divideNums method with valid and invalid input
        System.out.println("Result of dividing '10' and '5' is: " + divideNums(10,5));
        System.out.println("Result of dividing '2' and '0' is: " + divideNums(2,0));
        }
        catch(InvalidNumberFormatException infe)
        {
            System.err.println("Error: " + infe.getLocalizedMessage());
        }
        catch(DivideByZeroException dbze)
        {
            System.err.println("Error: " + dbze.getLocalizedMessage());
        }
    }
}

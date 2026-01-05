package sess11_additional_java_features;

/**
 * Functional interface for mathematical operations. 
 * 
 * @author a.nyanjui
 */
@FunctionalInterface
interface MathOperation
{
    int operation(int num1, int num2);
}

/**
 * Java program to demonstrate a functional interface, use of lambda 
 * expressions for mathematical operations. 
 * 
 * This class performs basis arithmetic operations (addition, subtraction, 
 * multiplication, and division) using lambdas. 
 * 
 * 
 * @author a.nyanjui
 */
public class SampleLambda
{
    /**
     * Executes a mathematical operation on two numbers.
     * 
     * @param num1 The first number to be used in the operation.
     * @param num2 The second number to be used in the operation.
     * @param mo The operation to be performed.
     * @return The result of the arithmetic operation.
     */
    private int operate(int num1, int num2, MathOperation mo)
    {
        return mo.operation(num1, num2);
    }
    
    // main method demonstrates lambda expresion for various operations
    public static void main(String[] args)
    {
        SampleLambda sl = new SampleLambda();
        
        // compact code
        // succint code
        
        // Lambda expressions for each operation
        MathOperation sum = (num1,num2) -> num1 + num2; // Addition
        MathOperation difference = (num1,num2) -> num1 - num2; // Subtraction
        MathOperation product = (num1,num2) -> num1 * num2; // Multiplication
        MathOperation multiplication = (num1, num2) ->
        {
            return num1 * num2;
        };
        MathOperation quotient = (num1, num2) ->
        {
            if (num2 == 0)
                    throw new ArithmeticException("Division by Zero will give "
                            + "an error.\nPlease use a non-zero denominator.");
            return num1 / num2; //Division with check for div. by zero
        };
        
        // Perform the various arithmetic operations and print the results
        try
        {
            System.out.println("Addition operation: 20 + 10 = " 
                    + sl.operate(20, 10, sum));
            System.out.println("Subraction operation: 7 - 2 = " 
                    + sl.operate(7, 2, difference));
            System.out.println("Multiplication operation: 8 x 5 = " 
                    + sl.operate(8, 5, product));
            System.out.println("Multiplication operation: 4 x 3 = " 
                    + sl.operate(4, 3, multiplication));
            System.out.println("Division operation: 20 / 10 = " 
                    + sl.operate(20, 10, quotient));
            System.out.println("Division operation: 4 / 0 = " 
                    + sl.operate(4, 0, quotient));
        } catch (ArithmeticException ae)
        {
            // Handle the arithmetic exception(division by zero)
            System.err.println("Error: " + ae.getLocalizedMessage());
        }
    }
}

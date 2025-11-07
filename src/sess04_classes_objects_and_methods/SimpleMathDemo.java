package sess04_classes_objects_and_methods;

import java.util.Scanner;

/**
 * Java program to demonstrate the SimpleMath class methods.
 * 
 * @author a.nyanjui
 */
public class SimpleMathDemo
{
    static Scanner sc = new Scanner(System.in);
    // main method begins program execution
    public static void main(String[] args)
    {
        // Prompt the user for the values to be used in the program
        System.out.println("Please enter the first number to be used in the"
                + "calculation -> ");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number to be used in the"
                + "calculation -> ");
        int secondNum = sc.nextInt();
        
        // Declare and instantiate a SimpleMath object
        SimpleMath sm = new SimpleMath();
        
        // Perform the various arithmetic operations
        long sum = sm.addNums(firstNum, secondNum);
        int difference = sm.subtractNums(firstNum, secondNum);
        long product = sm.multiplyNums(firstNum, secondNum);
        int quotient = sm.divideNums(firstNum, secondNum);
        float exponent = sm.getExponent(firstNum, secondNum);
        int remainder = sm.getModulus(firstNum,secondNum);
        
        // Display the result of the arithmetic operations
        System.out.println("-".repeat(50));
        System.out.println("Results of various arithmetic operations");
        System.out.println("-".repeat(50));
        System.out.printf("%d + %d = %d\n",firstNum,secondNum,sum);
        System.out.printf("%d - %d = %d\n",firstNum,secondNum,difference);
        System.out.printf("%d x %d = %d\n",firstNum,secondNum,product);
        System.out.printf("%d / %d = %d\n",firstNum,secondNum,quotient);
        System.out.printf("%d ^ %d = %.1f\n",firstNum,secondNum,exponent);
        System.out.printf("%d %% %d = %d\n",firstNum,secondNum,remainder);
        System.out.println("-".repeat(50));
        
    }
}

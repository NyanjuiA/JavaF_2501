package sess11_additional_java_features;

import java.util.function.IntBinaryOperator;

/**
 * Java program that demonstrates how to call a simple static method in: 
 * 
 * 1) Pre-Java 8 style (direct call)
 * 2) Java 8 lambda expression
 * 3) Java 8 method reference (ClassName::methodName)
 * 
 * @author a.nyanjui
 */
public class MethodReferenceDemo
{
    // Simple static method
    public static int addTwoNums(int num1, int num2)
    {
        return num1 + num2; 
    }
    
    // main method begins program execution
    public static void main(String[] args)
    {
        // ========================================================
        // 1) Pre-Java 8 Approach
        // ========================================================
        // Invoke/call the method directly
        int sum1 = MethodReferenceDemo.addTwoNums(5, 3);
        System.out.println("Directly calling 'addTwoNums()' to add 5 and 3 "
                + "gives: " + sum1);
        
        // ========================================================
        // 2) Java 8 Lambda Approach
        // ========================================================
        // Use IntBinaryOperator -> A functional interfaces that takes 
        // two ints and returns an int.
        
        // Use a lambda to "wrap" out addTwoNums method
        IntBinaryOperator lambdaAddition = (n,a) -> MethodReferenceDemo.addTwoNums(n, a);
        int sum2 = lambdaAddition.applyAsInt(20, 10);
        System.out.println("Using a lambda for 'addTwoNums()' to add 20 and 10 "
                + "gives: " + sum2);
        
        // ========================================================
        // 3) Java 8+ Method reference
        // ========================================================
        // Cleaner version of the lamda above.
        // Instead of writing (n,a) -> addTwoNums(n,a)
        // Java lets us 'refer' to the method directly:
        //          className::methodName
        
        // Use a lambda to "wrap" out addTwoNums method
        IntBinaryOperator referenceAddition = MethodReferenceDemo::addTwoNums;
        int sum3 = referenceAddition.applyAsInt(4,3);
        System.out.println("Using method refernce for 'addTwoNums()' to add 4 and 3 "
                + "gives: " + sum3);
    }
}

package sess02_variable_types_operators;

import java.util.Scanner;

/**
 * Java program to demonstrate the concept of constants and class variables.
 * 
 * @author a.nyanjui
 */
public class CircleConst
{
    // Class field constant to hold the value of PI
    static final float MYPI = 3.1415923f; // or MYPI = 22 / 7.0f;
    
    // Class field variable to hold the input variable
    static Scanner sc;
    
    // main method begins program execution
    public static void main(String[] args)
    {
        // method variables to be used in the program
        float radius, area, circumference;
        // Instantiate the class variable for user input
        sc = new Scanner(System.in);
        
        // Read in the radius from the user
        System.out.println("Please enter the radius of the circle in cm and "
                + "I\'ll tell you its area and circumference");
        radius = sc.nextFloat();
        sc.close(); // Close the input stream
        
        // Calculate the area and circumference
        area =(float) (MYPI * Math.pow(radius, 2));
        circumference = MYPI * (radius * 2);
        
        // Display the circle's dimensions
        System.out.println("Circle's Dimensions");
        System.out.println("-".repeat(50));
        System.out.printf("%-15s : %7.1f cm.\n","Radius",radius);
        System.out.printf("%-15s : %7.1f cm2.\n","Area",area);
        System.out.printf("%-15s : %7.1f cm.\n","Circumference",circumference);
        System.out.println("-".repeat(50));
    }
    
}

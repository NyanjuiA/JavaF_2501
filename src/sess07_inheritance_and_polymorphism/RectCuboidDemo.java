package sess07_inheritance_and_polymorphism;

import java.util.Scanner;

/**
 * Java class to demonstrate creating Rectangle and Cuboid objects.
 * 
 * @author a.nyanjui
 */
public class RectCuboidDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the dimensions of the rectangle
        System.out.println("Please enter the rectangle's length in cm:\n");
        int length = sc.nextInt();
        
        System.out.println("Please enter the rectangle's width in cm:\n");
        int width = sc.nextInt();
        
        // Declare and instantiate a Rectangle object with the user's dimensions
        Rectangle rect1 = new Rectangle(length, width);
        
        // Display the rectangle's dimensions
        System.out.println(rect1);
        
        // Declare a cuboid, then hard-code its values
        Cuboid cb1;
        cb1 = new Cuboid(8, 5, 2);
        
        // Display the cuboid's dimensions
        System.out.println(cb1);
    }
}

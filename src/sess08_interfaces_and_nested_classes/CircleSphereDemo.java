package sess08_interfaces_and_nested_classes;

import java.util.Scanner;

/**
 * Java program to demonstrate declaring and instantiating Circle and Sphere
 * objects and displaying their details.
 *
 * @author a.nyanjui
 */
public class CircleSphereDemo
{

    // main method begins program execution
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Declare Circle and Sphere objects
        Circle c1, c2;
        Sphere s1, s2;

        // Prompt the user for the radius of 'c2' and 's2'
        System.out.println("Please enter the radius of the circle in cm:\n");
        int rad = sc.nextInt();
        System.out.println("Please enter the radius of the sphere in cm:\n");
        int rad2 = sc.nextInt();
        
        // Instantiate the circles, then the spheres
        c1 = new Circle(); // Using default constructor
        c1.setRadius(7);
        c2 = new Circle(rad); // Using the parameterised constructor
        
        s1 = new Sphere(); // Using default constructor
        s1.setRadius(7);
        s2 = new Sphere(rad2); // Using the parameterised constructor
        
        // Display the dimensions of the circles & spheres
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(s2);
        
    }
}

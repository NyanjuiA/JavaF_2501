package sess03_selection_and_iteration;

import java.util.Scanner;

/**
 * Java program to demonstrate the various selection/decision/conditional 
 * constructs.
 * 
 * @author a.nyanjui
 */
public class JavaDecisionConstructs
{
    // Class variable to be used for user input
    static Scanner sc = new Scanner(System.in);
    
    // main method begins program execution
    public static void main(String[] args)
    {
        // Variables to be used in the program
        float temperature;
        String password = "";
        
        // Get the temperature
        System.out.println("Please enter today's temperature in degrees Celsius");
        temperature = Float.parseFloat(sc.nextLine());
        
        // 1. if
        System.out.println("=".repeat(62));
        System.out.println("   1. if SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        if (temperature > 25.0f)
            System.out.println("Hooray 🎉🎉, it's a warm day, let's head to the beach 🍹🍹!");
        if (password == "")
            System.out.println("Please enter your password!");
        
        // 2. if...else
        System.out.println("=".repeat(62));
        System.out.println("   2. if...else SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        System.out.println("Please enter a number and I'll tell you if it's odd"
                + " or even ->");
        int userNum = Integer.parseInt(sc.nextLine().trim());
        if(userNum % 2 == 1)
            System.out.printf("\n%d is an odd number!",userNum);
        else
            System.out.printf("\n%d is an even number!",userNum);
        System.out.println("\nPlease enter the student's score in the exam ->"); // check whether the score is < 0 or > 100 : notify the user and terminate the application
        int score = Integer.parseInt(sc.nextLine().trim());
//        if(score >= 40)
//            System.out.printf("\nCongratulations! With a score of %d, you've "
//                    + "passed the exam!\n",score);
//        else
//            System.out.printf("\nUnfortunately with a score of %d, you've failed "
//                    + "the exam!\n",score);
        System.out.printf(score >= 40? "\nCongratulations! With a score of %d, you've "
                    + "passed the exam!\n" : "\nUnfortunately with a score of %d, you've failed "
                    + "the exam!\n",score);
        //3. if...elseif...else
        // Grade the student based on their score
        System.out.println("=".repeat(62));
        System.out.println("   3. if...elseif...else SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        if (score >=70 && score <=100)
            System.out.printf("\nWith a score of %d, you got grade 'A'\n",score);
        else if (score >=60 )
            System.out.printf("\nWith a score of %d, you got grade 'B'\n",score);
        else if (score >=50 )
            System.out.printf("\nWith a score of %d, you got grade 'C'\n",score);
        else if (score >=40 )
            System.out.printf("\nWith a score of %d, you got grade 'D'\n",score);
        else
            System.out.printf("\nWith a score of %d, you got grade 'E'\n",score);
        
        // 4. Switch...Case
        // Check if a day of the week is on a weekday or weekend
        System.out.println("=".repeat(62));
        System.out.println("   4. switch...case SELECTION CONSTRUCT");
        System.out.println("=".repeat(62));
        // Prompt the user for the day of the week
        System.out.println("Please enter the day of the week ->");
        String day = sc.nextLine().trim().toLowerCase();// read in, remove leading and trailing whitespace and covert to lowercase for case insensitive day comparison
        
        // Java 17+ pattern-matching switch
//        switch (day)
//        {
//            case "monday","tuesday", "wednesday","thursday","friday" ->
//                System.out.println("\n" + day + " is a weekday.");
//            case "saturday", "sunday" -> 
//                System.out.println("\n" + day + " is on a weekend.");
//            default ->
//            {
//                System.out.println("Sorry, " + day + " is not a valid day of "
//                        + "the week.");
//                System.exit(0); // Terminate the program
//            }
//        }
        
        // Java <17 classic switch...case
        switch (day)
        {
            case "monday":
            case "tuesday":  
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("\n" + day + " is a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println("\n" + day + " is on a weekend.");
                break;
            default:
                System.out.println("Sorry, " + day + " is not a valid day of "
                        + "the week.");
                System.exit(0); // Terminate the program
        }
        
        // close the input stream
        sc.close();
    }
}

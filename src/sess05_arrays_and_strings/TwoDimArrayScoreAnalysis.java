package sess05_arrays_and_strings;

import java.util.Scanner;

/**
 * Java program to analyse the score details of a class in various 
 * subjects/modules. 
 * 
 * @author a.nyanjui
 */
public class TwoDimArrayScoreAnalysis
{
    // main method begins program execution.
    public static void main(String[] args)
    {
        // Variables to be used in the program
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0; // looping variables
        int numofStudents, numOfModules; // Variables for the no. of students & modules/subjects
        String [] studentNames, moduleNames; // String array for the names of students and modules/subjects
        int [] totalScore, studScore[]; // Integer arrays for total score and individual scores. 
        float meanScore[]; // Float array to hold each student's mean/avg. score
        char grade[]; // Char array to hold each student's grade
        String [] comment; // String array to hold each student's performance comment.
        
        // Prompt the user for the number of student's in the class and read in their names
        System.out.println("How many students are there in the class?");
        numofStudents = sc.nextInt();
        studentNames = new String[numofStudents];// instantiate the student names array
        for(; n < studentNames.length; n++)
        {
            System.out.println("Please enter the name of student " + (n + 1));
            studentNames[n] = sc.next();
        }
        
        // Prompt the user for the number of modules and read in their names
        System.out.println("How many modules/subjects are the students taking?");
        numOfModules = sc.nextInt();
        moduleNames = new String[numOfModules];// instantiate the module names array
        for(n = 0; n < moduleNames.length; n++)
        {
            System.out.println("Please enter the name of module " + (n + 1));
            moduleNames[n] = sc.next();
        }
        
        // Instantiate all the remaining arrays
        studScore = new int[numofStudents][numOfModules];
        totalScore = new int[numofStudents];
        meanScore = new float[numOfModules];
        grade = new char[numofStudents];
        comment = new String[numofStudents];
        
        // Prompt the user for each student's score in each subject
        for(n= 0; n < studentNames.length; n++)
        {
            totalScore[n] = 0; // Initialise each student's total score to zero
            for(i = 0; i < moduleNames.length; i++)
            {
                System.out.printf("\nPlease enter %s's score in %s ->",
                        studentNames[n],moduleNames[i]);
                studScore[n][i] = sc.nextInt();
                //Calculate each student's total score
                totalScore[n] += studScore[n][i];
            }
            // Calculate each student's mean score
            meanScore[n] = totalScore[n] / (float) moduleNames.length;
            // Assign a grade base on the student's mean score
            if(meanScore[n] >= 70)
                grade[n] = 'A';
            else if(meanScore[n] >= 60)
                grade[n] = 'B';
            else if(meanScore[n] >= 50)
                grade[n] = 'C';
            else if(meanScore[n] >= 40)
                grade[n] = 'D';
            else 
                grade[n] = 'E';
            
            // Assign a comment based on the student's mean grade
            switch(grade[n])
            {
                case 'A':
                    comment[n] = "Excellent!";
                    break;
                case 'B':
                    comment[n] = "Very Good!";
                    break;
                case 'C':
                    comment[n] = "Good!";
                    break;
                case 'D':
                    comment[n] = "Fair!";
                    break;
                case 'E':
                    comment[n] = "Try Harder!";
                    break;
            }
        }
        
        // close the input stream
        sc.close();
        
        // Display the results
        System.out.printf("%-14s","Student Name");
        for(n = 0; n < moduleNames.length; n++)
        {
            System.out.printf("%-12s",moduleNames[n]);
        }
        System.out.printf("%-12s %-12s %-12s %-12s%n","Total","Average",
                "Grade","Comment");
        for (n = 0; n < studentNames.length; n++)
        {
           System.out.printf("%-14s",studentNames[n]);
            for(i = 0; i < moduleNames.length; i++)
            {
                System.out.printf("%-12d",studScore[n][i]);
            }
            System.out.printf("%-12d %-12.1f %-12c %-12s%n",totalScore[n],
                    meanScore[n],grade[n],comment[n]);
        }
    }
}

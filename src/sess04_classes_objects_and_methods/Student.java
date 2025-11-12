package sess04_classes_objects_and_methods;

/**
 * Java class to model a student object.
 *
 * @author a.nyanjui
 */
public class Student
{

    String studentID;
    String name;
    int age;
    char gender;

    // no argument constructor
    public Student()
    {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'F';
    }

    // Student initialiser
    public void initialiseStudent()
    {
        this.studentID = "Student0001";
        this.name = "Student One";
        this.age = 18;
    }

    // Method to display the student's details
    public void displayDetails()
    {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student's Name: " + this.name);
        System.out.println("Student's age: " + this.age);
        System.out.println("Student's gender: " + (this.gender == 'm'
                || this.gender == 'M' ? "Male" : "Female"));
        System.out.println("-".repeat(50));
    }

    @Override
    public String toString()
    {
        return "Student Details\n"
                + "-".repeat(50)
                + "\nStudent ID: " + this.studentID
                + "\nStudent's Name: " + this.name
                + "\nStudent's age: " + this.age
                + "\nStudent's gender: " + (this.gender == 'm'
                || this.gender == 'M' ? "Male\n" : "Female\n")
                + "-".repeat(50);
    }

}

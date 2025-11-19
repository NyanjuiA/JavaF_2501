package sess06_modifiers_and_packages;

/**
 * Java program to demonstrate the 'final keyword in Java.
 * 
 * 1. final field -> cannot be reassigned/modified after initialisation
 * 2. final method -> cannot be overriden in subclasses
 * 3. final class  -> cannot be extended (no subclasses allowed)
 * 
 * @author a.nyanjui
 */
public class FinalKeywordDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // 1. Demonstrate the final field
        System.out.println("====1. Final Field Demo====");
        Person person = new Person(30, "Jane Mutisya");
        System.out.println(person);
        
        // Try to reassign Jane's ID no
        //person.id  = 21;// Would not compile due to private access & trying to
        // modify a final field
        
        // We can change Jane's age
        person.setAge(23);
        System.out.println("After Jane's Birthday: \n" + person);
        
        // 2. Demonstrate the final method
        System.out.println("====2. Final Method Demo====");
        Employee emp = new Employee(50000.0, "Alice");
        emp.setAge(25); // Set the employee's age
        System.out.println(emp.getDetails());
        
        // 3. Demonstrate the final class
        System.out.println("====3. Final Class Demo====");
        MathUtils.add(20, 10);
        MathUtils.multiply(5, 8);
    }
}

/** 
 * 1. Class with a final field 
 * 
 * The 'id' field is final -> must be set in the constructor and never 
 * changed/modified. 
 */
class Person
{
    private final int id; // final instance field
    private String name;
    private int age;

    public Person(int id, String name)
    {
        this.id = id; // Only place where final Id field can be assigned
        this.name = name;
        this.age = 0;
    }
    
    public int getId() { return this.id;}
    public String getName() {return this.name;}
    public int getAge() { return this.age;}
    
    public void setAge(int age) { this.age = age;}

    @Override
    public String toString()
    {
        return "Person Details"
                + "\n" + "-".repeat(50)
                + "\nID No.: " + this.id
                + "\nName : " + this.name
                + "\nAge : " + this.age
                + "\n" + "-".repeat(50);
    }    
}

/**
 * 2. Class with a final method
 * Its subclasses cannot override the getDetails() method. 
 * 
 * @author a.nyanjui
 */
class Employee extends Person
{
    private double salary;
    
    // Constructor

    public Employee(double salary, String name)
    {
        super((int)(Math.random() * 10000), name); // generate a random id for the user
        this.salary = salary;
    }
    
    public final String getDetails()
    {
        return "Employee Details"
                + "\n" + "-".repeat(50)
                + "\nID No.: " + this.getId()
                + "\nName : " + this.getName()
                + "\nAge : " + this.getAge()
                + "\nSalary: " + this.salary
                + "\n" + "-".repeat(50);
    }
    
}

/**
* 3. Final class - cannot be subclassed
* Examples in Java API: String, Integer, Double, Math, System, etc.
*/
final class MathUtils {
 
    // Static final field (constant) - convention: all final fields should be in UPPERCASE
    public static final double PI = 3.14159265359;
 
    // Utility methods
    public static void add(int a, int b) 
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
 
    public static void multiply(int a, int b) 
    {
        System.out.println(a + " x " + b + " = " + (a * b));
    }
}
 
// This would cause a compile-time error:
// class AdvancedMath extends MathUtils { }  // Cannot inherit from final 'MathUtils'

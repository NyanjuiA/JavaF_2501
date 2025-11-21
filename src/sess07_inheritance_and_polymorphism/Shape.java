package sess07_inheritance_and_polymorphism;

/**
 * The {@code Shape} class will be the super class of all shapes and it 
 * has field name to hold the shape's name and an abstract method getName()
 * that returns the name of the shape. 
 * 
 * @author a.nyanjui
 */
public abstract class Shape
{
    protected String name;
    
    public abstract String getName();
}

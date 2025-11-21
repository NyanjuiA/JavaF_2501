package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

/**
 *
 * @author a.nyanjui
 */
public class Circle extends Shape implements I2DShape
{

    //============================================
    // Instance field(s)
    //============================================
    /**
     * The radius of the circle (in units)
     */
    protected int radius;

    //============================================
    // Getters & Setters
    //============================================
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    //============================================
    // Constructors
    //============================================
    
    public Circle()
    {
        this.radius = 0;
        this.name = "Circle";
    }

    public Circle(int radius)
    {
        this.radius = radius;
        this.name = "Circle";
    }
    
    //============================================
    // Overriden methods
    //============================================

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float calcArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }    
    
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n Radius: " + this.radius
                + "\n Area: " + this.calcArea()
                + "\n Circumference: " + this.calcCircumference()
                + "\n" + "-".repeat(50);
    }
    
    public float calcCircumference()
    {
        return (float) (Math.PI * (radius * 2));
    }

}

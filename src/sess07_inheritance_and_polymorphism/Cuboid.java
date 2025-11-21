package sess07_inheritance_and_polymorphism;

/**
 * The {@code Cuboid} class represents a 3-dimensional Cuboid with its length,
 * width and breadth (depth). It provides methods to compute its surface area
 * and volume.
 *
 * @author a.nyanjui
 */
public class Cuboid extends Rectangle
{

    //============================================
    // Instance fields
    //============================================
    /**
     * The breadth of the cuboid (in units)
     */
    private int breadth;

    //============================================
    // Getters & Setters
    //============================================
    /**
     * returns the breadth of the rectangle (in units)
     *
     * @return the rectangle's breadth (in units)
     */
    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    
    //============================================
    // Constructors
    //============================================

    public Cuboid()
    {
        super(); // Call the parent/super class constructor
        this.breadth = 0;
        this.name = "Cuboid"; // Change the name from rectangle to Cuboid
    }

    public Cuboid(int length, int width, int breadth)
    {
        super(length, width);
        this.breadth = breadth;
        this.name = "Cuboid";
    }
    
    //============================================
    // Instance methods
    //============================================
    
    /**
     * Calculates and returns the cuboid's surface area (in square units).
     * 
     * @return the cuboid's surface area (in square units)
     */
    protected long calcSurfaceArea()
    {
        return 2 * (this.calcArea() + width * breadth + length * breadth); // 2 (lw + wb + lb)
    }
    
    protected long calcVolume()
    {
        return this.calcArea() * this.breadth;
    }
    
    //============================================
    // Overriden methods
    //============================================
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Breadth: " + this.breadth
                + "\n Surface Area: " + this.calcSurfaceArea()
                + "\n Volume: " + this.calcVolume()
                + "\n" + "-".repeat(50);
    }

}

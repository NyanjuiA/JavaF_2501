package sess08_interfaces_and_nested_classes;

/**
 *
 * @author a.nyanjui
 */
public class Sphere extends Circle implements I3DShape
{
    //============================================
    // Constructors
    //============================================
    
    public Sphere()
    {
        super();
        this.name = "Sphere";
    }

    public Sphere(int radius)
    {
        super(radius);
        this.name = "Sphere";
    }
    

    //============================================
    // Overriden methods
    //============================================
    @Override
    public float calcSurfaceArea()
    {
        // 4IIr2
        return 4 * this.calcArea() ;
    }

    @Override
    public float calcVolume()
    {
        // 4/3IIr3
        return 4/3.0f * this.calcArea() * this.radius;
    }
    
    @Override
    public String toString()
    {
//        return this.getName() + " Details"
//                + "\n" + "-".repeat(50)
//                + "\n Radius: " + this.radius
//                + "\n Surface Area: " + this.calcSurfaceArea()
//                + "\n Volume: " + this.calcVolume()
//                + "\n" + "-".repeat(50);
        return String.format(this.getName() +" Details"
                + "\n" + "-".repeat(50)
                + "\n Radius: %d m."
                + "\n Surface Area: %.2f m2."
                + "\n Volume: %.2f m3."
                + "\n" + "-".repeat(50), 
                this.radius,this.calcSurfaceArea(),this.calcVolume());
    }
    
}

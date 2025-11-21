package sess08_interfaces_and_nested_classes;

/**
 * The {@code I3DShape} interface represents a three-dimensional geometric
 * shape. It defines contracts for calculating the surface area, and volume of 
 * the 3-D shape. 
 * Any class that implements this interface must provide its own implementation
 * of the {@link #calcSurfaceArea()}, and the {@link #calcVolume()} methods.
 * 
 * @author a.nyanjui
 * @version 1.0
 */
public interface I3DShape
{
    /**
     * Calculates the surface area of the shape as a {@code float}
     * 
     * @return The surface area of the shape as a {@code float}. The surface 
     * area is typically expressed in square units (e.g., square cm, or feet).
     */
    public float calcSurfaceArea();
    
    /**
     * Calculates the volume of the shape as a {@code float}
     * 
     * @return The volume of the shape as a {@code float}. The volume is 
     * typically expressed in cubic units (e.g., cubic cm, or feet).
     */
    public float calcVolume();
    
}

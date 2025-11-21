package sess08_interfaces_and_nested_classes;

/**
 * The {@code I2DShape} interface represents a two-dimensional geometric
 * shape. It defines a contract for calculating the area of the shape. 
 * Any class that implements this interface must provide its own implementation
 * of the {@link #calcArea()} method. 
 * 
 * @author a.nyanjui
 */
public interface I2DShape
{
    /**
     * Calculates the area of the shape as a {@code float}
     * 
     * @return The area of the shape as a {@code float}. The area is typically
     * expressed in square units (e.g., square cm, or feet).
     */
    public float calcArea();
}

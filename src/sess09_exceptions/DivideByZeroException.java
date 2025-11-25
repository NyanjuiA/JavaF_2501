package sess09_exceptions;

/**
 *
 * @author a.nyanjui
 */
public class DivideByZeroException extends ArithmeticException
{
    // Constructor
    public DivideByZeroException(String message)
    {
        super(message);
    }
    
}

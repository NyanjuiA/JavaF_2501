package sess09_exceptions;

/**
 * A custom exception that represents an attempt to divide a number by zero.
 *
 * <p>
 * This exception extends {@link ArithmeticException} and is thrown when a
 * division operation is performed with a divisor of zero. Although Java's
 * runtime already throws an {@code ArithmeticException} with the message "/ by
 * zero" in such cases, this custom exception allows for more specific semantic
 * meaning, better control over error messages, and improved readability in code
 * that explicitly wants to distinguish division-by-zero errors from other
 * arithmetic exceptions.</p>
 *
 * <p>
 * Example usage:</p>
 * <pre>
 *     if (divisor == 0) {
 *         throw new DivideByZeroException("Cannot divide " + dividend + " by zero");
 *     }
 * </pre>
 *
 * <p>
 * This exception is a {@code RuntimeException} (unchecked), so callers are not
 * forced to catch it unless desired.</p>
 *
 * @author a.nyanjui
 * @since 1.0
 */
public class DivideByZeroException extends ArithmeticException
{

    /**
     * Constructs a new {@code DivideByZeroException} with the specified detail
     * message.
     *
     * @param message the detail message explaining the reason for the
     * exception. The message can be retrieved later by the
     * {@link Throwable#getMessage()} method.
     */
    public DivideByZeroException(String message)
    {
        super(message);
    }
    

    /**
     * Constructs a new {@code DivideByZeroException} with a default message.
     *
     * <p>
     * Default message: "Division by zero is not allowed"</p>
     */
    public DivideByZeroException()
    {
        super("Division by zero is not allowed");
    }
}

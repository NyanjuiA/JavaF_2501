package sess02_variable_types_operators;

/**
 * Java program to demonstrate the 8 Java primitive data types, their sizes in
 * bytes, default values and minimum/maximum values for numeric types.
 *
 * @author a.nyanjui
 */
public class JavaPrimitiveTypesDemo
{

    // Declare one class (static) variable for each of primitive types
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean boolVar;

    public static void main(String[] args)
    {

        System.out.println("=================================================");
        System.out.println("     JAVA PRIMITIVE DATA TYPES DEMONSTRATION");
        System.out.println("=================================================\n");

        // 1. Display the declared variables and their default values
        System.out.println("1. DECLARED VARIABLES AND THEIR DEFAULT VALUES");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s\n", "Type", "Variable",
                "Default Value");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-15s %-10d\n", "byte", "byteVar", byteVar);
        System.out.printf("%-10s %-15s %-10d\n", "short", "shortVar", shortVar);
        System.out.printf("%-10s %-15s %-10d\n", "int", "intVar", intVar);
        System.out.printf("%-10s %-15s %-10d\n", "long", "longVar", longVar);
        System.out.printf("%-10s %-15s %-10.2f\n", "float", "floatVar",
                floatVar);
        System.out.printf("%-10s %-15s %-10.2f\n", "double", "doubleVar",
                doubleVar);
        System.out.printf("%-10s %-15s %c (Unicode: \\u%04X)\n", "char",
                "charVar", charVar, (int) charVar);
        System.out.printf("%-10s %-15s %-10b\n", "bool", "boolVar", boolVar);

        // 2. Display the size of the declared variables in bytes
        System.out.println("2. SIZE OF EACH PRIMITIVE TYPE IN BYTES");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-12s\n", "Type", "Size in Bytes");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-12d\n", "byte", Byte.BYTES);
        System.out.printf("%-10s %-12d\n", "short", Short.BYTES);
        System.out.printf("%-10s %-12d\n", "int", Integer.BYTES);
        System.out.printf("%-10s %-12d\n", "long", Long.BYTES);
        System.out.printf("%-10s %-12d\n", "float", Float.BYTES);
        System.out.printf("%-10s %-12d\n", "double", Double.BYTES);
        System.out.printf("%-10s %-12d\n", "char", Character.BYTES);
        System.out.printf("%-10s %-12s\n", "boolean", "1 bit (JVM-dependent, "
                + "usually 1 byte in arrays)");

        // 3. Display the minimum and maximum values for the numeric types
        System.out.println("3. MINIMUM & MAXIMUM VALUES FOR OF EACH PRIMITIVE TYPES");
        System.out.println("-".repeat(55));// Repeat the quoted character/string (int) times
        System.out.printf("%-10s %-25s %-25s\n", "Type", "Minimum Value", "Maximum Value");
        System.out.println("-".repeat(55));
        System.out.printf("%-10s %-25d %-25d\n", "byte", (int) Byte.MIN_VALUE,
                (int) Byte.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "short", (int) Short.MIN_VALUE,
                (int) Short.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "int", Integer.MIN_VALUE,
                Integer.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "long", Long.MIN_VALUE,
                Long.MAX_VALUE);
        System.out.printf("%-10s %-25e %-25e\n", "float",
                Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s %-25s %-25s\n", "",
                "(Smallest positive: " + Float.MIN_NORMAL + ")",
                "(Note: MIN_VALUE is subnormal)");
        System.out.printf("%-10s %-25e %-25e%n", "double",
                Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s %-25s %-25s\n", "",
                "(Smallest positive: " + Double.MIN_NORMAL + ")", "");
        System.out.printf("%-10s U+%04X to U+%04X\n", "char",
                (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
    }
}

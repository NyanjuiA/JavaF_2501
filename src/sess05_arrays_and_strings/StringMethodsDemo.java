package sess05_arrays_and_strings;

/**
 * The {@code StringMethodsDemo} class demonstrates some commonly used methods
 * of the {@link java.lang.String} class in Java.
 *
 * @author a.nyanjui
 */
public class StringMethodsDemo
{

    // main method begins program execution
    public static void main(String[] args)
    {
        // Sample strings
        String s1 = "Java", s2 = "programming";
        String s3 = "hamburger", s4 = "urge";

        System.out.println("----------------STRING CLASS METHODS DEMO----------"
                + "-------");
        // 1. length() -> returns the number of characters in a string
        System.out.println("1. \tlength()");
        System.out.println("\'" + s1 + "\' has " + s1.length() + " characters.");
        System.out.println("\'" + s2 + "\' has " + s2.length() + " characters.\n");

        // 2. charAt() -> returns the character at a given position in a string
        System.out.println("2. \tcharAt()");
        System.out.println("Character at index 1 in " + s1 + " is '"
                + s1.charAt(1) + "'.");
        System.out.println("Character at index 4 in " + s2 + " is '"
                + s2.charAt(4) + "'.");

        // 3. toUpper() -> returns the string in uppercase
        // 4. toLower() -> returns the string in lowercase
        System.out.println("3. \ttoUpper()");
        System.out.println("\'" + s3 + "\' in upper case "
                + s3.toUpperCase() + " .");
        System.out.println("4. \ttoLower()");
        System.out.println("\'" + s1 + "\' in lower case "
                + s1.toLowerCase() + " .\n");

        // 5. equals() -> checks exact equality (case sensitive)
        System.out.println("5. \tequals()");
        System.out.println("Does '" + s1 + "' equal 'Java'? " + s1.equals("Java"));
        System.out.println("Does '" + s1 + "' equal 'java'? "
                + s1.equals("java") + "\n");

        // 6. equalsIgnoreCase -> checks equality without considering case
        System.out.println("6. \tequalsIgnoreCase()");
        System.out.println("Does '" + s1 + "' equal 'java'? "
                + s1.equalsIgnoreCase("Java"));

        // 7. compareTo() -> lexicographically compares strings
        System.out.println("7. \tcompareTo()");
        System.out.println("'" + s1 + "' compare to '" + s2 + "' gives: "
                + s1.compareTo(s2));
        System.out.println("'" + s1 + "' compare to 'Java' gives: "
                + s1.compareTo("Java") + ".\n");

        // 8. substring() -> extract a portion of a string from a given index
        System.out.println("8. \tsubstring()");
        System.out.println("Substring of '" + s2 + "' from index 0 - 6: '"
                + s2.substring(0, 6) +"'");
        System.out.println("Substring of '" + s3 + "' from index 3 - 8: '"
                + s3.substring(3, 8) + "'.\n");

        // 9. indexOf() -> first occurence of a character or string in a string
        System.out.println("9. \tindexOf()");
        System.out.println("Index of 'a' in '" + s3 + "' is: " + s3.indexOf('a'));
        System.out.println("Index of 'urge' in '" + s3 + "' is: "
                + s3.indexOf(s4) + ".\n");

        // 10. lastIndexOf() -> last occurence of a character or string in a string
        System.out.println("10. \tlastIndexOf()");
        System.out.println("Last index of 'a' in '" + s3 + "' is: " + s3.lastIndexOf('a'));
        System.out.println("Last index of 'm' in '" + s2 + "' is: "
                + s2.lastIndexOf('m') + ".\n");

        // 11. contains() -> check occurrence of a substring in a string
        System.out.println("11. \tcontains()");
        System.out.println("Does '" + s3 + "' contain '" + s4 + "'? " 
                + s3.contains(s4));
        System.out.println("Does '" + s3 + "' contain 'gram'? " 
                + s3.contains("gram") + ".\n");
        
        // 12. startsWith(prefix) -> check if the string start prefix
        System.out.println("12. \tstartsWith()");
        System.out.println("Does '" + s2 + "' start with 'pro'? " 
                + s2.startsWith("pro"));
        System.out.println("Does '" + s3 + "' start with 'ham'? " 
                + s3.startsWith("ham") +".\n");
        
        
        // 13. endsWith(suffix) -> check if the string ends with suffix
        System.out.println("13. \tendsWith()");
        System.out.println("Does '" + s3 + "' end with 'pro'? " 
                + s3.endsWith("pro"));
        System.out.println("Does '" + s1 + "' end with 'va'? " 
                + s1.endsWith("va") +".\n");
        
        // 14. concat() -> combines one string to the end of another
        System.out.println("14. \tconcat()");
        String combined =  s1.concat(" ").concat(s2); // method chaining
        System.out.println("After concatenating '" + s1 + "' a space ' ' and '"
                + s2 +"', we get : '" + combined +"'.\n");
        
        // 15. replace() -> substitutes one string for another in a string
        System.out.println("15. \treplace()");
        System.out.println("Replacing 'a' with '@' in '" + s1 + "' gives : '" 
                + s1.replace("a", "@") + "'.\n");

    }
}

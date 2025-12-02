package sess10_datetimeapi_enums;

/**
 * Enumeration to represent the four suits in a standard deck of playing cards. 
 * The four suits are: 
 * 1. HEARTS
 * 2. DIAMONDS
 * 3. CLUBS
 * 4. SPADES
 * 
 * @author a.nyanjui
 */
public enum CardSuit
{
    //=============================================
    // Card Suits
    //=============================================
    HEARTS("Hearts","Red"),
    DIAMONDS("Diamonds","Red"),
    CLUBS("Clubs","Black"),
    SPADES("Spades","Black");
    
    //=============================================
    // Card suit fields
    //=============================================    
    private String suitName;
    private String colour;

    
    //=============================================
    // Constructor
    //=============================================
    private CardSuit(String suitName, String colour)
    {
        this.suitName = suitName;
        this.colour = colour;
    }
    
    
    //=============================================
    // Getters & Setters
    //=============================================
    public String getSuitName()
    {
        return suitName;
    }

    public void setSuitName(String suitName)
    {
        this.suitName = suitName;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    @Override
    public String toString()
    {
        return String.format("Suit Details" +
                "\n" + "-".repeat(55) +
                "\nSuit: %s" + 
                "\nColour: %s" +
                "\n" + "-".repeat(55), suitName,colour);
    }
    
    
    // main method begins program execution
    public static void main(String[]args)
    {
        // Loop through all suits in the enumeration and display information
        System.out.println("Demonstrating the four suits in a standard deck of "
                + "playing cards:\n");
        for (CardSuit suit: CardSuit.values())
            System.out.println(suit); // Display information about each suit
        
        // Example of how to get a specific suit by name
        System.out.println("\nAccessing a specific suit (e.g., Hearts):");
        CardSuit heartSuit = CardSuit.valueOf("HEARTS");
        System.out.println("Specific suit: " + heartSuit.getSuitName() +
                ", Colour: " + heartSuit.getColour());
    }
    
    
}

public class Card {
    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * This is the constructor.  It does not have a return type,
     * and the name must be exactly the same as the class name (including the upper case letter)
     * You can have overloaded constructors.
     * @param faceName - example ace
     * @param suit - example spades
     * @param faceValue - example 14
     */
    public Card(String faceName, String suit, int faceValue)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(faceValue);
    }

    /**
     * This constructor should be used if you want ace's to be the highest card value
     * @param faceName
     * @param suit
     */
    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }
}

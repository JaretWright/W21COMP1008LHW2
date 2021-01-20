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
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= 14)
            this.faceValue = faceValue;
        else
            throw new IllegalArgumentException("face value must be between 1 and 14 inclusive");
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * This method will return a String that represents
     * the card with the face name and suit
     */
    public String toString()
    {
        return faceName + " of " + suit;
    }
}

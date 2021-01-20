import java.util.List;
import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {

        //Create a Scanner
        //datatype  object name         calling the constructor
        Scanner     scanner       = new Scanner(System.in);
        Card        aceOfSpades   = new Card("Ace","Spades",14);
        Card        twoOfHearts   = new Card("two","Hearts",13);
        Card        aceOfHearts   = new Card("ace","Hearts");

        //on lines 9 - 11 we instantiated 3 Card objects

        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
        System.out.println(aceOfHearts);

        //experiment to see how the indexOf method works
//        List<String> faceNames = Card.getValidFaceNames();
//        int positionTwo = faceNames.indexOf("two");
//        int positionThree = faceNames.indexOf("three");
//        int positionKing = faceNames.indexOf("king");

    }
}

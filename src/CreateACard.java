import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {

        //Create a Scanner
        //datatype  object name         calling the constructor
        Scanner     scanner       = new Scanner(System.in);
        Card        aceOfSpades   = new Card("Ace","Spades",14);

        System.out.println(aceOfSpades);
    }
}

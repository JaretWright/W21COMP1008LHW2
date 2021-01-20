import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {

        //Create a Scanner
        //datatype  object name         calling the constructor
        Scanner     scanner       = new Scanner(System.in);
        Card        aceOfSpades   = new Card("Ace","Spades",14);
        Card        phoneOfBatteries = new Card("Phone","Batteries",13);

        System.out.println(aceOfSpades);
        System.out.println(phoneOfBatteries);
    }
}

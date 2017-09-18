
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word1 = reader.nextLine();

            if (words.contains(word1)) {
                System.out.print("You gave the word " + word1 + " twice");
                break;
            } else {
                words.add(word1);
            }
        }
    }
}
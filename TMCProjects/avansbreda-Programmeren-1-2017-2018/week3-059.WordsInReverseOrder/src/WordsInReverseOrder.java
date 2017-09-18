import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {

            System.out.print("Type a word: ");
            String name = reader.nextLine();

            if (!name.isEmpty()) {
                words.add(name);
            } else {
                System.out.println("\n" + "You type the following words: " + "\n");
                Collections.reverse(words);
                for (String s : words) {
                    System.out.println(s);
                }
                break;
            }
        }
    }
}
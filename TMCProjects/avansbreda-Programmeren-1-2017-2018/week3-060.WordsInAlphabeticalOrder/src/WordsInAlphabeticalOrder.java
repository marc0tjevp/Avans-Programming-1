
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {

            System.out.print("Type a word: ");
            String name = reader.nextLine();

            if (!name.isEmpty()) {
                words.add(name);
            } else {
                Collections.sort(words);
                System.out.println("\n" + "You type the following words: " + "\n");
                for (String s : words) {
                    System.out.println(s);
                }
                break;
            }
        }
    }
}
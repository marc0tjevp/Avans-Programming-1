import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the end part: ");
        int endNumber = Integer.parseInt(reader.nextLine());

        int lengthword = word.length();

        int word1 = word.length() - endNumber;

        String result = word.substring(word1, lengthword);

        System.out.print("Result: " + result);
    }
}

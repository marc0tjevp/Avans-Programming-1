
import java.util.Scanner;

    public class FirstPart {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
            String word1 = reader.nextLine();


            System.out.print("Length of the first part: ");
            int length = Integer.parseInt(reader.nextLine());

            String result = word1.substring(0, length);


            System.out.print("Result: " + result);
        }
    }

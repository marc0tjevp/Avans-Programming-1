
import java.util.Scanner;

public class ManyPrints {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        int number = 0;
        int tracker = 1;

        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        number = reader.nextInt();

        while(tracker <= number) {
            tracker++;
            printText();
        }
    }
}
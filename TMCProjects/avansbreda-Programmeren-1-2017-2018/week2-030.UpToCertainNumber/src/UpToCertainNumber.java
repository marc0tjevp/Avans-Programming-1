
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int init = 1;

        // Write your code here
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());

        while (init <= number) {
            System.out.println(init);
            init++;
        }
        
    }
}

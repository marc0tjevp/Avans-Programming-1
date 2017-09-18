
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double a =  Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        double b = Integer.parseInt(reader.nextLine());

        double result = a / b;

        System.out.println("Division: " + a + " / " + b + " = " + result);

    }
}

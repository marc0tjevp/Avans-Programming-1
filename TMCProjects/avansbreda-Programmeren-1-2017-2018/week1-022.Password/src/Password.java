
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String command = reader.nextLine();
            if (command.equals(password)) {
                System.out.println("Right!");
                System.out.println("This message is very secret");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

    }
}

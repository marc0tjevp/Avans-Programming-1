
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int lower = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int higher = Integer.parseInt(reader.nextLine());

        while (lower <= higher) {
            System.out.println(lower);
            lower++;
        }

    }
}


import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name =  reader.nextLine();

        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String name2 =  reader.nextLine();

        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        int total = age + age2;

        System.out.println(name + " and " + name2 +" are " + total + " years old in total.");

    }
}

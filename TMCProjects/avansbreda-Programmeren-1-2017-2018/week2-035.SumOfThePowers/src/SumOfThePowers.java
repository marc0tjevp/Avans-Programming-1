import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int base = 0;
        int result = 0;
        int power = 0;


        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());

        while(base <= number1){
            base++;
            result = result + (int)Math.pow(2, power);
            power++;


        }
        System.out.println("The result is " + result);

    }
}
import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        int tracker = 0;
        double avg = 0;
        int even = 0;
        int uneven = 0;

        Scanner reader = new Scanner(System.in);

        while (number >= 0) {

            System.out.print("Type numbers: ");
            number = reader.nextInt();

            if(number >= 0) {
                sum+= number;
                tracker++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    uneven++;
                }
            }
        }

        avg = (double) sum / (double) tracker;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + tracker);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd number: " + uneven);

    }
}

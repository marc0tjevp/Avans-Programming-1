import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guesses = 0;

        while(true){

            System.out.print("Guess a number: ");

            int userGuess = Integer.parseInt(reader.nextLine());

            guesses++;

            if (numberDrawn == userGuess){
                System.out.println("Congratulations, your guess is correct");
                break;
            }
            else if(userGuess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guesses);
            } else if (userGuess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + guesses);
            }
        }

    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
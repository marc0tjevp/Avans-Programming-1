
import java.util.Scanner;

import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        int number = 0;
        int j = 0;

        while(name.length() > i){
            i++;
            number++;
            System.out.println(number + ". character: " + name.charAt(j) );
            j++;
        }
    }
}
import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        int j = name.length();
        String reverse1 = "";
        String reverse2 = "";

        while(i < name.length()){

            reverse1 = name.substring(j-i-1, j-i);
            reverse2 = reverse2 + reverse1;

            i++;
        }
        System.out.println("In reverse order: " + reverse2);

    }
}

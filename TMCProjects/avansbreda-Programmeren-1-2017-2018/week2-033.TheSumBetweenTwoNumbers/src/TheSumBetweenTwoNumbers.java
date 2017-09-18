
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Second number: ");
        int b = Integer.parseInt(reader.nextLine());

        int result = 0;

        if(a>b)
        {
            result=a;
            a=b;
            b=result;
            result=0;
        }

        while (a <=b) {
            result+=a;
            a++;
        }

        System.out.println("The sum of all numbers is "+result);

    }
}

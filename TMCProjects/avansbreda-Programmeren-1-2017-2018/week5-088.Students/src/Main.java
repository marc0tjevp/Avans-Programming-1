
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        Student pekka = new Student("Pekka Mikkola", "013141590");
        Student marco = new Student("Marco van Poortvliet", "013144530");

        students.add(pekka);
        students.add(marco);

        while(true) {

            String name;
            String studentnummer;

            System.out.print("Name: ");
            name = s.nextLine();

            if (name.equals("")) {
                for (Student student : students) {
                    System.out.println(student.toString());
                }
                break;
            } else {
                System.out.print("StudentNummer: ");
                studentnummer = s.nextLine();
            }
        }

    }
}

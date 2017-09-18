public class Printing {

    public static void printStars(int amount) {
        int tracker = 0;

        while(amount > tracker) {
            System.out.print("*");
            tracker++;
        }
    }

    public static void printSquare(int sideSize) {

        int tracker = 0;

        while(sideSize > tracker) {
            printStars(sideSize);
            System.out.println("");
            tracker++;
        }
    }

    public static void printRectangle(int width, int height) {

        int tracker = 0;

        while(height > tracker) {
            printStars(width);
            System.out.println("");
            tracker++;
        }

    }

    public static void printTriangle(int size) {
        int tracker = 0;
        int rows = 1;

        while(size > tracker) {
            printStars(rows);
            System.out.println("");
            tracker++;
            rows++;
        }
    }
;
    public static void main(String[] args) {

        System.out.println("");
        printStars(7);
        System.out.println("");
        printSquare(4);
        System.out.println("\n");
        printRectangle(17, 3);
        System.out.println("\n");
        printTriangle(3);
        System.out.println("\n");
    }

}

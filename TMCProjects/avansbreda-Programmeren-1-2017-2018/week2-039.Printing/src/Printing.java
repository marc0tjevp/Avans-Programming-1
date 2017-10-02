public class Printing {

    public static void printStars(int amount) {
        // 39.1
        int base = 0;
        while(base < amount){
            base++;
            System.out.print("*");}


        System.out.println();
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int base1 = 0;
        while(base1 < sideSize){
            base1++;
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int base = 0;
        while(base < height){
            base++;
            printStars((width));}

    }

    public static void printTriangle(int size) {
        // 39.4
        int base = 0;
        int rows = 1;
        while(base < size){
            printStars(rows);
            base++;
            rows++;


        }

    }

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));

    }

    public static int smallest(int[] array) {

        int smallest = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {

        int i = 0;
        int lookFor = smallest(array);

        while (lookFor == smallest(array)) {

            if (lookFor == array[i]) {
                break;
            }

            i++;
        }
        return i;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int i = 0;
        int lookFor = smallest(array);

        while (lookFor == smallest(array)) {

            if (lookFor == array[i]) {
                break;
            }

            i++;
        }
        return i;
    }

}

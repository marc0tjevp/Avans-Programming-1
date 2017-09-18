import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int a : list){
            sum += a;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double endresult = (double)sum(list) / list.size();
        return endresult;
    }

    public static double variance(ArrayList<Integer> list) {
//        if (list.size() == 1) {
//            System.out.println("Not a number");
//        }
        int count = 0;
        double sum = 0;
        double average = average(list);

        while (count < list.size()) {
            sum += Math.pow(list.get(count) - average, 2);
            count++;
        }

        return sum / (list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
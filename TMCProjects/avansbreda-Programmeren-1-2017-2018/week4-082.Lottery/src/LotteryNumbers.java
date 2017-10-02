import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random r = new Random();

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i < 8) {
            int randomInt = r.nextInt(39) + 1;
            if (!containsNumber(randomInt))
                this.numbers.add(randomInt);
                i++;
            }
        }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)) {
            return true;
        }
        else {
            return false;
        }
    }
}

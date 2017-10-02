import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;
    private int lowerOfSides = 1;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides + 1;
    }

    public int roll() {
        return random.nextInt(this.numberOfSides) + lowerOfSides;
    }
}

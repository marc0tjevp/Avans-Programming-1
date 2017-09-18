public class DecreasingCounter {
    private int value;
    private int init;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.init = this.value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
            System.out.println(this.value);
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = init;
    }
}

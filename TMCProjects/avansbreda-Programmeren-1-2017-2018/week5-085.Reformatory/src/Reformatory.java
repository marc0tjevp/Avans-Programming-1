public class Reformatory {

    private int totalMeasured = 0;

    public int weight(Person person) {
        totalMeasured++;
        return person.getWeight();
    }

    public void feed(Person p) {
        p.setWeight(p.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return totalMeasured;
    }

}

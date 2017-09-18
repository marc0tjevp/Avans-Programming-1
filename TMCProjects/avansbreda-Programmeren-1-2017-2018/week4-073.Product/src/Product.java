public class Product {

    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
        this.nameAtStart = nameAtStart;
    }

    public void printProduct(){
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }
}

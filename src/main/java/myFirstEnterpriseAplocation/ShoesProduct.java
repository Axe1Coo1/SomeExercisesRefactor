package myFirstEnterpriseAplocation;

public class ShoesProduct extends Product{

    int size;
    Colours colour;

    public ShoesProduct(String title, int price, int quantity, int size, Colours colour) {
        super(title, price, quantity);
        this.size = size;
        this.colour = colour;
    }


    @Override
    public String toString() {
        return super.toString() +
                "size=" + size +
                ", colour=" + colour +
                "} ";
    }

    public ShoesProduct(String title, int price, int quantity) {
        super(title, price, quantity);
    }
}

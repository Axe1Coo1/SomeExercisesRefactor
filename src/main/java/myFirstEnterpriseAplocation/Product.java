package myFirstEnterpriseAplocation;

public abstract class Product {
    private String title;
    private int price;
    private int quantity;

    public Product(String title, int price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + ", ";
    }

    public double getPrice() {
        double realCost = quantity * price;
        return realCost - realCost * getDiscount() / 100;
    }

    public static final int DEF_DISCOUNT = 10;

    protected int getDiscount() {
        if (quantity > 10) {
            return DEF_DISCOUNT;
        } else {
            return 0;
        }
    }


}

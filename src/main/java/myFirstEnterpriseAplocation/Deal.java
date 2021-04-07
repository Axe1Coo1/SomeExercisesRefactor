package myFirstEnterpriseAplocation;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Deal {
    private Date date;
    private Party seller;
    private Party buyer;
    private Collection<Product> products;

    public Deal(Date date, Party seller, Party buyer, LinkedList products) throws ParseException {
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
        this.products = (Collection<Product>) products;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "date=" + date +
                ", seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + products +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public Party getSeller() {
        return seller;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Product getProducts() {
        return (Product) products;
    }
}

package myFirstEnterpriseAplocation;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;


public class ApplicationTest {
    @Test
    public void getPrice() {
        Product shoes = new ShoesProduct("N996", 100, 10, 41, Colours.GREEN);
        double x = shoes.getPrice();
        assertEquals(1000, (double) x, 0.0);
    }

    @Test
    public void getDiscount() {
        Product canon = new PhotoProduct("Canon EOS 6D", 1000, 11, 100, "No");
        Product shoes = new ShoesProduct("N996", 100, 12, 41, Colours.GREEN);
        assertEquals(1080, shoes.getPrice(), 0.0);
        assertEquals(8800, canon.getPrice(), 0.0);
    }

    @Test
    public void addDeal() throws ParseException {
        Date x = new Date();
        Party NB = new Party("New Balance");
        Party Me = new Party("Me");
        Product shoes = new ShoesProduct("N996", 100, 10, 41, Colours.GREEN);
        Product canon = new PhotoProduct("Canon EOS 6D", 1000, 11, 100, "Yes");

        LinkedList prod = new LinkedList();
        prod.add(shoes);
        prod.add(canon);

        System.out.println(prod);
        Deal deal1 = new Deal(x, NB, Me, prod);
        System.out.println(deal1);
    }

}

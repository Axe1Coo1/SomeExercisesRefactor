package myFirstEnterpriseAplocation;

public class PhotoProduct extends Product {

    private int megaPx;
    private String digital;

    protected int getDiscount(){
        int def = super.getDiscount();
        if (digital == "No"){
            def += 10;
        }
        return def;
    }

    public PhotoProduct(String title, int price, int quantity, int megaPx, String digital) {
        super(title, price, quantity);
        this.megaPx = megaPx;
        this.digital = digital;
    }

    public int getMegaPx() {
        return megaPx;
    }

    public void setMegaPx(int megaPx) {
        this.megaPx = megaPx;
    }

    public String getDigital() {
        return digital;
    }

    public void setDigital(String digital) {
        this.digital = digital;
    }


    @Override
    public String toString() {
        return super.toString() +
                "megaPx=" + megaPx +
                ", digital='" + digital + '\'' +
                '}';
    }


}

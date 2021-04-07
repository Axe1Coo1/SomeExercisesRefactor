package myFirstEnterpriseAplocation;

public class Party {
    String name;
    String address;
    String[] keys;
    String[] values;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Party{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

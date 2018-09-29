package data;

public class Hamburger {
    double price;
    String meat;
    String bun;

    public Hamburger(String meat, String bun) {
        this.price = 7.0;
        this.meat = meat;
        this.bun = bun;
    }

    public double getPrice() {
        return price;
    }
}



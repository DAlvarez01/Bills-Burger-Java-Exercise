package data;

public class Sides {
    private String name;
    private double price;
    private int id;

    public Sides(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //Side menu

    public Sides(int id) {
        this.id = id;
        if (id == 1) {
            name = "Cheese";
            price = 2.0;
        }
        if (id == 2) {
            name = "Lettuce";
            price = 0.5;
        }
        if (id == 3) {
            name = "Tomato";
            price = 0.5;
        }
        if (id == 4) {
            name = "Extra Secret Sauce";
            price = 1.0;
        }
        if (id == 5) {
            name = "Pickles";
            price = 0.5;
        }
        if (id == 6) {
            name = "Onion";
            price = 0.5;
        }
        //
        if (id == 11) {
            name = "Small Coke";
            price = 3.0;
        }
        if (id == 12) {
            name = "Large Coke";
            price = 5.0;
        }
        if (id == 13) {
            name = "Large Coke";
            price = 2.5;
        }
        if (id == 14) {
            name = "Large Fries";
            price = 4.0;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

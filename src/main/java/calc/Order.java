package calc;

import data.*;
import io.*;

public class Order {
    String meat;
    String bun;
    int side1;
    int side2;
    int side3;
    int side4;
    int side5;
    int side6;
    int t;

    private int orderNumber; //todo ???

    public Order(int t, String meat, String bun, int side1, int side2, int side3, int side4, int side5, int side6) {
        this.t = t;
        this.meat = meat;
        this.bun = bun;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }

    public Order() {
        Input input = new Input();
        Order order = input.readAndCreateOrder();

        //todo 3 objects? useless
        Hamburger hamburger = new Hamburger(order.meat, order.bun);
        HealthyBurger healthyBurger = new HealthyBurger(order.meat);
        DeluxeBurger deluxeBurger = new DeluxeBurger(order.meat, order.bun);

        Sides sides1 = new Sides(order.side1);
        Sides sides2 = new Sides(order.side2);
        Sides sides3 = new Sides(order.side3);
        Sides sides4 = new Sides(order.side4);
        Sides sides5 = new Sides(order.side5);
        Sides sides6 = new Sides(order.side6);

        Calculate calc = new Calculate();
        if (order.t == 1) {
            calc.setPos1(hamburger.getPrice());
        } else if (order.t == 2) {
            calc.setPos1(healthyBurger.getPrice());
        } else if (order.t == 3) {
            calc.setPos1(deluxeBurger.getPrice());
        }
        calc.setPos2(sides1.getPrice());
        calc.setPos3(sides2.getPrice());
        calc.setPos4(sides3.getPrice());
        calc.setPos5(sides4.getPrice());
        calc.setPos6(sides5.getPrice());
        calc.setPos7(sides6.getPrice());

        Output output = new Output();

        //todo redundant code
        if (order.t == 1) {
            output.setPrice1(hamburger.getPrice());
        } else if (order.t == 2) {
            output.setPrice1(healthyBurger.getPrice());
        } else if (order.t == 3) {
            output.setPrice1(deluxeBurger.getPrice());
        }
        output.setPrice2(sides1.getPrice());
        output.setPrice3(sides2.getPrice());
        output.setPrice4(sides3.getPrice());
        output.setPrice5(sides4.getPrice());
        output.setPrice6(sides5.getPrice());
        output.setPrice7(sides6.getPrice());

        if (order.t == 1) {
            output.setName1("Hamburger");
        } else if (order.t == 2) {
            output.setName1("Healthy Burger");
        } else if (order.t == 3) {
            output.setName1("Deluxe Burger");
        }
        output.setName2(sides1.getName());
        output.setName3(sides2.getName());
        output.setName4(sides3.getName());
        output.setName5(sides4.getName());
        output.setName6(sides5.getName());
        output.setName7(sides6.getName());

        output.printReceipt();

        calc.calculateTotalPrice();

    }
}

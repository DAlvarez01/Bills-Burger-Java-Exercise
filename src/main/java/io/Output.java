package io;

public class Output {
    String name1;
    String meat;
    String bun;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;
    String name7;
    double price1;
    double price2;
    double price3;
    double price4;
    double price5;
    double price6;
    double price7;

    public Output() {
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setMeatName(String meat) {
        this.meat = meat;
    }

    public void setBunName(String bun) {
        this.bun = bun;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public void setName7(String name7) {
        this.name7 = name7;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public void setPrice3(double price3) {
        this.price3 = price3;
    }

    public void setPrice4(double price4) {
        this.price4 = price4;
    }

    public void setPrice5(double price5) {
        this.price5 = price5;
    }

    public void setPrice6(double price6) {
        this.price6 = price6;
    }

    public void setPrice7(double price7) {
        this.price7 = price7;
    }

    public void printReceipt() { //todo meat type, bun type
        System.out.println(" ");
        System.out.println("Your receipt:");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(name1 + "  $" + price1);
        System.out.println("Meat type: " + meat);
        System.out.println("Bun type: " + bun);
        System.out.println(name2 + "  $" + price2);
        System.out.println(name3 + "  $" + price3);
        System.out.println(name4 + "  $" + price4);
        System.out.println(name5 + "  $" + price5);
        if (price6 != 0) System.out.println(name6 + "  $" + price6);
        if (price7 != 0) System.out.println(name7 + "  $" + price7);
        System.out.println(" ");
    }
}

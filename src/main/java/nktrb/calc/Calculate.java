package nktrb.calc;

public class Calculate {

    double totalPrice;
    double pos1;
    double pos2;
    double pos3;
    double pos4;
    double pos5;
    double pos6;
    double pos7;


    public Calculate() {
    }

    public void setPos1(double pos1) {
        this.pos1 = pos1;
    }

    public void setPos2(double pos2) {
        this.pos2 = pos2;
    }

    public void setPos3(double pos3) {
        this.pos3 = pos3;
    }

    public void setPos4(double pos4) {
        this.pos4 = pos4;
    }

    public void setPos5(double pos5) {
        this.pos5 = pos5;
    }

    public void setPos6(double pos6) {
        this.pos6 = pos6;
    }

    public void setPos7(double pos7) {
        this.pos7 = pos7;
    }

    public double calculateTotalPrice() {
        totalPrice = pos1 + pos2 + pos3 + pos4 + pos5 + pos6 + pos7;
        System.out.println("Total price is: $" + totalPrice);
        return totalPrice;
    }
}


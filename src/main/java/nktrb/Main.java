package nktrb;

import nktrb.calc.Order;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        boolean flag = true;
        //infinite loop
        while (flag) {
            Order test = new Order(i);
            i++;
        }
    }
}

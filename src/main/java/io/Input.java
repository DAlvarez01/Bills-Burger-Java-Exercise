package io;

import calc.Order;

import java.util.Scanner;

public class Input {
    String meat;
    String bun;
    int side1;
    int side2;
    int side3;
    int side4;
    int side5;
    int side6;
    int t;
    int[] sidet = new int[6];

    private Scanner sc;

    public Input() {
    }

    public Order readAndCreateOrder() {

        sc = new Scanner(System.in);

        System.out.println("Welcome to Bills Burgers! ");
        System.out.println(" ");
        System.out.println("Please, prompt correctly, we don't handle errors yet"); //todo
        System.out.println(" ");
        System.out.println("What would you like to order? ");
        System.out.println(" ");
        System.out.println("[1] Classic Burger [$7]");
        System.out.println("[2] Healthy Burger with some additional sides [$12] ");
        System.out.println("[3] Deluxe Burger with large Coke and large fries [$13]");
        System.out.println("[4] Only side dishes  /* not available yet */"); //todo
        System.out.println(" ");
        int t = sc.nextInt();
        sc.nextLine();
        if (t == 1) {
            meat = meatTypeSelect();
            bun = bunTypeSelect();
            displaySideMenu();
            for (int i = 0; i < 4; i++) {
                sidet[i] = sideTypeSelect();
            }
        } else if (t == 2) {
            meat = meatTypeSelect();
            displaySideMenu();
            for (int i = 0; i < 6; i++) {
                sidet[i] = sideTypeSelect();
            }
        } else if (t == 3) {
            meat = meatTypeSelect();
            bun = bunTypeSelect();
            side5 = 12;
            side6 = 14;
            displaySideMenu();
            for (int i = 0; i < 4; i++) {
                sidet[i] = sideTypeSelect();
            }
        }
        side1 = sidet[0];
        side2 = sidet[1];
        side3 = sidet[2];
        side4 = sidet[3];
        if (sidet[4] != 0) side5 = sidet[4];
        if (sidet[5] != 0) side6 = sidet[5];

        //scannerClose();

        return new Order(t, meat, bun, side1, side2, side3, side4, side5, side6);
    }

    public String meatTypeSelect() {
        System.out.println("Type in meat type: ");
        System.out.println(" ");
        String meat = sc.nextLine();
        System.out.println(" ");
        return meat;
    }

    public String bunTypeSelect() {
        System.out.println("Type in bun type: ");
        System.out.println(" ");
        String bun = sc.nextLine();
        System.out.println(" ");
        return bun;
    }

    public void displaySideMenu() {
        System.out.println("Select side dishes: ");
        System.out.println(" ");
        System.out.println("[1]Cheese [$2]");
        System.out.println("[2]Lettuce [50c]");
        System.out.println("[3]Tomato [50c]");
        System.out.println("[4]Extra Secret Sauce [$1]");
        System.out.println("[5]Pickles [50c]");
        System.out.println("[6]Onion [50c]");
        System.out.println(" ");
        System.out.println("[11]Small Coke [$3]");
        System.out.println("[12]Large Coke [$5]");
        System.out.println("[13]Small Fries [$2.50]");
        System.out.println("[14]Large Fries [$4]");
        System.out.println(" ");
    }

    public int sideTypeSelect() {
        int side = sc.nextInt();
        sc.nextLine();
        System.out.println("OK");//todo you can do better
        return side;
    }

    public void scannerClose() {
        sc.close();
    }
}


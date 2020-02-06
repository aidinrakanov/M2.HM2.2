package com.company;

public abstract class Toys implements Printable {
    private int price;

    public Toys(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

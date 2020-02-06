package com.company;

public class Balls extends Toys {
    private int size;
    private String type;

    public Balls(int price, int size, String type) {
        super(price);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public void print() {
        System.out.println("Мячик " + "| размер: "+getSize() + "| тип: " + getType() + "| цена: " + getPrice() );
    }
}

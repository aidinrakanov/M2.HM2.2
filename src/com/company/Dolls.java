package com.company;

public class Dolls extends Toys {
    private int heigth;
    private String name;

    public Dolls(int price, int heigth, String name) {
        super(price);
        this.heigth = heigth;
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Кукла " + "| имя: "+getName() + "| высота: " + getHeigth()+ "см" + "| цена: " + getPrice() );
    }
}

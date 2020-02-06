package com.company;

public class Cars extends Toys {
    private String colour;
    private String model;

    public Cars(int price, String colour, String model) {
        super(price);
        this.colour = colour;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println("Машинка " +"| цвет: " + getColour() + "| модель: " + getModel() + "| цена: " + getPrice());
    }
}

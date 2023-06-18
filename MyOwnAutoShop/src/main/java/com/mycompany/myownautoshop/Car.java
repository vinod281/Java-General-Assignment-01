package com.mycompany.myownautoshop;

public class Car 
{
    private int speed;
    protected double regularPrice;
    private String color;
    
    double getSalePrice()
    {
        return regularPrice;
    }
    
    public Car(double regularPrice)
    {
        this.regularPrice=regularPrice;
    }
}


package com.mycompany.myownautoshop;


public class Ford extends Car
{
    private int year;
    private int manufactureDiscount;
    
    @Override
    public double getSalePrice()
    {
        return regularPrice-manufactureDiscount;
    }
    
    public Ford(double regularPrice,int manufactureDiscount)
    {
        super(regularPrice);
        this.manufactureDiscount=manufactureDiscount;
    }
}

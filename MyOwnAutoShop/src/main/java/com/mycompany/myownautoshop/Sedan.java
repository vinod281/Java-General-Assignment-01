
package com.mycompany.myownautoshop;


public class Sedan extends Car
{
    private int length;
    
    @Override
    public double getSalePrice()
    {
        if(length>20)
        {
            return regularPrice-regularPrice*0.05;
        }
        else
        {
            return regularPrice-regularPrice*0.1;
        }
    }
    
    public Sedan(double regularPrice,int length)
    {
        super(regularPrice);
        this.length=length;
    }
}

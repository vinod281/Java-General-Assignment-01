
package com.mycompany.myownautoshop;


public class Truck extends Car 
{
    private int weight;
    
    @Override
    public double getSalePrice()
    {
        if(weight>2000)
        {
            return regularPrice-(regularPrice*0.1);
        }
        else
        {
            return regularPrice-(regularPrice*0.2);
        }
        
    }
    
    public Truck(double regularPrice,int weight)
    {
        super(regularPrice);
        this.weight=weight;
    }
}

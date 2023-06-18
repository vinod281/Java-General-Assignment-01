package com.mycompany.shapeobj;


public class Triangle extends Shape 
{
    @Override
    public void draw()
    {
        System.out.println("Drawing triangle...");
    }
    
    @Override
    public void erase()
    {
        System.out.println("Triangle eraced!");
    }
    
}

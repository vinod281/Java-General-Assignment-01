
package com.mycompany.shapeobj;


public class Square extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing square...");
    }
    
    @Override
    public void erase()
    {
        System.out.println("Square eraced!");
    }
}

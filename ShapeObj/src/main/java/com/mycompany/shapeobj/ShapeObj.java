package com.mycompany.shapeobj;

public class ShapeObj 
{

    public static void main(String[] args) 
    {
        Circle c1=new Circle();
        c1.draw();
        c1.erase();
        
        Square s1=new Square();
        s1.draw();
        s1.erase();
        
        Triangle t1=new Triangle();
        t1.draw();
        t1.erase();
    }
}


package com.mycompany.myownautoshop;


public class MyOwnAutoShop 
{

    public static void main(String[] args) 
    {
        Car c1=new Car(50000);
        System.out.println("Car's Price : "+c1.getSalePrice());
        
        Truck t1=new Truck(20000,3000);
        System.out.println("Truck Final Price : "+t1.getSalePrice());
        
        Ford f1=new Ford(30000,1000);
        System.out.println("Ford's Final Price : "+f1.getSalePrice());
        
        Sedan s1=new Sedan(15000,25);
        System.out.println("Sedan's Final Price : "+s1.getSalePrice());
    }
}

package com.mycompany.itemobj;

public class ItemObj 
{

    public static void main(String[] args) 
    {
        Monster m1=new Monster(0000,"Homagama");
        
        m1.setLocation(28221);
        m1.setDescription("Anuradhapura");
        
        System.out.println("Location is : "+m1.getLocation());
        System.out.println("Description is : "+m1.getDescription());
        
    }
}

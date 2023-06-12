
package com.mycompany.itemobj;


public class Item 
{
    protected int location;
    protected String description;
    
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public void setLocation(int location)
    {
        this.location=location;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public String getDescription()
    {
        return description;
    }
}

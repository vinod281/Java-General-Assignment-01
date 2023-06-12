
package com.mycompany.datetest;

public class Date 
{
    
    private int year,date,month;
    
    public Date()
    {
        this.year=1999;
        this.month=12;
        this.date=22;
    }
    
    public void setYear(int year)
    {
        this.year=year;
    }
    
    public void setMonth(int month)
    {
        this.month=month;
        
    }
    public void setDate(int date)
    {
        this.date=date;
    }
    
    public int getDate()
    {
        return date;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void displayDate()
    {
        
        System.out.println(year+"/"+month+"/"+date);
        
    }
    
}

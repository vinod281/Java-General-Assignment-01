package com.mycompany.datetest;

public class DateTest {

    public static void main(String[] args) 
    {
        Date d1 =new Date();
        
        d1.displayDate();
        
        d1.setDate(12);
        d1.setMonth(06);
        d1.setYear(2023);
        
        System.out.println("\nYear : "+d1.getYear());
        System.out.println("Month : "+d1.getMonth());
        System.out.println("Date : "+d1.getDate()+"\n");
        
        d1.displayDate();
    }
}

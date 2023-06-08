package com.mycompany.question_4;
import java.util.Scanner;
public class Question_4 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int no1,no2,no3;
        System.out.print("Frist number : ");
        no1=sc.nextInt();
        System.out.print("Second Number : ");
        no2=sc.nextInt();
        System.out.print("Third Number : ");
        no3=sc.nextInt();
        
        System.out.println("\nSum of Numbers : "+(no1+no2+no3));
        System.out.println("Avarage of Numbers : "+(no1+no2+no3)/3);
        System.out.println("Products of Numbers :"+(no1*no2*no3));
        
        int max=no1;
        
        if(max<no2)
        {
            max=no2;
        }
        if(max<no3)
        {
            max=no3;
        }
        
        System.out.println("\nMax is : "+max);
        
        
        int min=no1;
        
        if(min>no2)
        {
            min=no2;
        }
        if(min>no3)
        {
            min=no3;
        }
        
        System.out.println("Min is : "+min);
    }
}

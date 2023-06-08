package com.mycompany.question_2;
import java.util.Scanner;

public class Question_2 
{

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        
        int no1,no2,no3;
        
        System.out.print("Enter Frist Number :");
        no1=sc.nextInt();
        System.out.print("Enter Second Number :");
        no2=sc.nextInt();
        System.out.print("Enter Third Number :");
        no3=sc.nextInt();
        
        System.out.println("\nProduct of three integers : "+no1*no2*no3);
        
        
    }
}

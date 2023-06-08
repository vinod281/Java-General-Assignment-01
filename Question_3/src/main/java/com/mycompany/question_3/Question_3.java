package com.mycompany.question_3;
import java.util.Scanner;
public class Question_3 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit degree :");
        float fahrenheit=sc.nextFloat();
        float celsius=(fahrenheit-32)*5/9;
        
        System.out.println("Celcius :"+celsius);
    }
}

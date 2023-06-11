package com.mycompany.question_5;
import java.util.Scanner;

public class Question_5 
{
    double[] grades=new double[20];
    int count=0;
    
    public void getGrades()
    {
        Scanner sc=new Scanner(System.in);
        
        
        
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter "+(i+1)+" Grade : ");
            double temp=sc.nextDouble();
            if(temp==-1)
            {
                break;
            }
            else
            {
            
            grades[i]=temp;
            count++;
            }
        }
    }
    
    public void getAvarage()
    {
        double sum=0;
        for(int i=0;i<count;i++)
        {
            sum=sum+grades[i];
        }
        
        double avarage=sum/count;
        
        System.out.println("\nAvarage is : "+avarage);
        
    }

    public static void main(String[] args) 
    {
   
        Question_5 q5=new Question_5();
        q5.getGrades();
        q5.getAvarage();
    }
}

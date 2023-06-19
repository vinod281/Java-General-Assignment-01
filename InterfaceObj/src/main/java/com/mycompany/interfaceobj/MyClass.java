
package com.mycompany.interfaceobj;


public class MyClass implements A,test 
{
    @Override
    public void meth1()
    {
        System.out.println("This is meth1.");
    }
    
    @Override
    public void meth2()
    {
        System.out.println("This is meth2.");
    }
    
    @Override
    public void square()
    {
        System.out.println("Example method for multiple inheritance.");
    }
    
}

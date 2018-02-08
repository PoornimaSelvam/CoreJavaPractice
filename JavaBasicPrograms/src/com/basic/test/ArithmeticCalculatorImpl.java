package com.basic.test;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator
{
    private int x;
    
    
    public ArithmeticCalculatorImpl(int x)
    {
        super();
        this.x = x;
        System.out.println("Param.... "+x);
    }

    public ArithmeticCalculatorImpl(){
        System.out.println("ArithmeticCalculatorImpl.ArithmeticCalculatiorImpl()");
    }

    @Override
    public int add(int i, int j)
    {
        // TODO Auto-generated method stub
        return i + j;
    }

    @Override
    public int sub(int i, int j)
    {
        // TODO Auto-generated method stub
        return i -j;
    }

}

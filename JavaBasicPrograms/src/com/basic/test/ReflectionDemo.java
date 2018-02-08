package com.basic.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, InvocationTargetException
    {
        Class c = Class.forName("test.ArithmeticCalculatorImpl");
        //ArithmeticCalculator arthimeticCalculator = (ArithmeticCalculator) c.newInstance();
        Constructor<ArithmeticCalculatorImpl> constructor = c.getConstructor(int.class);
        constructor.newInstance(10);
    }
}

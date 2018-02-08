package com.basic.test;

import java.awt.List;
import java.util.ArrayList;

public class StackDemo
{

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        ArrayList<Object> a = new ArrayList<>();

        a.add("A");
        a.add("B");
        stack.push(a);
        
        Object value = stack.pop();
        System.out.println(value);
    }

}

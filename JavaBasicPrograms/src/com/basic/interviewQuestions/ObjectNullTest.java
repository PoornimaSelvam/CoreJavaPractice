package com.basic.interviewQuestions;

import com.basic.test.Person;

public class ObjectNullTest
{
    public static void main(String[] args)
    {
        Person p = null;
        methodcall(null);
    }

    public static void methodcall(Object object)
    {
        System.out.println("object");
    }

    public static void methodcall(String object)
    {

        System.out.println("String");
    }
}

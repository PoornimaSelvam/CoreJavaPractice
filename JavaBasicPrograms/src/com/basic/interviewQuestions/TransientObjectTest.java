package com.basic.interviewQuestions;

import java.util.Date;

import com.basic.test.Person;

public class TransientObjectTest
{
    public static void main(String[] args)
    {
        Person p = new Person("Poornima", "lastName", new Date(), "placeOfBirth");
        
        System.out.println(p.getLastName());
    }
}

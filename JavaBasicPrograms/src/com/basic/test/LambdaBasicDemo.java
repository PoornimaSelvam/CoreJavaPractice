package com.basic.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaBasicDemo
{
    public static void main(String[] args)
    {

        List<Person> people = null;

        Collections.sort(people, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.firstName.compareTo(o2.firstName);
            }
        });
        
    }
}

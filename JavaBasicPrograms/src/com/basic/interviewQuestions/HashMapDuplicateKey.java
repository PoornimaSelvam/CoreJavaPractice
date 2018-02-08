package com.basic.interviewQuestions;

import java.util.HashMap;

public class HashMapDuplicateKey
{

    public static void main(String[] args)
    {
        HashMap<Integer,String> h = new HashMap<Integer,String>();
        
        h.put(null, "a");
        h.put(1, "a");
        System.out.println(h);
    }

}

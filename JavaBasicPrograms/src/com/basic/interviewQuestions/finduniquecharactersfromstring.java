package com.basic.interviewQuestions;

import java.util.HashMap;

public class finduniquecharactersfromstring
{

    public static void main(String[] args)
    {
        String s = "welcome to thomson reuters";
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        Character c;
        for (int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            
            if (hashmap.containsKey(c))
            {
                int count = hashmap.get(c); 
                hashmap.put(c, count + 1);
            }
            else
            {
                hashmap.put(c, 1);
            }
        }
        System.out.println(hashmap);

        /*for (Character ch : hashmap.keySet())
        {
            if (hashmap.get(ch) == 0)
            {
                System.out.println("unique elements : " + ch);
            }
        }*/

    }

}

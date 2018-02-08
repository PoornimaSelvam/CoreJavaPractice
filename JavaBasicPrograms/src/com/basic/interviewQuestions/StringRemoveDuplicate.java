package com.basic.interviewQuestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringRemoveDuplicate
{

    public static void main(String[] args)
    {
        String s = "aabbabbddccdcba";
        List<Character> chars = new ArrayList<>();
        
        StringBuilder strBuilder = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++)
        {
           char resultChar = s.charAt(i);
           
           if(chars == null)
           {
               chars.add(resultChar);
           }
           if(chars!=null && !chars.contains(resultChar))
           {
               chars.add(resultChar);
               strBuilder.append(resultChar);
           }
        }

        System.out.println(strBuilder);
        
        /*char[] chars = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());*/
    }

}

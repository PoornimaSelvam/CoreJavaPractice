package com.basic.interviewQuestions;

import java.util.Scanner;

public class Removevowels
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        
        String s = in.nextLine();
        
        String  result = s.replaceAll("[aeiouAEIOU]", "");
                
        System.out.println(result);
    }
}

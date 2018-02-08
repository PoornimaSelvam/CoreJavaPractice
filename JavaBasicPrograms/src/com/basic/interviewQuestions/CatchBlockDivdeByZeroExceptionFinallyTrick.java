package com.basic.interviewQuestions;

public class CatchBlockDivdeByZeroExceptionFinallyTrick
{
    public static void main(String[] args)
    {
        System.out.println(test());
    }

    public static int test()
    {
        try
        {
            int y = 2 / 0;
            System.out.println("hello");
            return 1;
        }
        catch (Exception e)
        {
            System.out.println("in catch");
            return 2;
        }

        finally
        {
            System.out.println("In finally");
            return 3;
        }

    }

}

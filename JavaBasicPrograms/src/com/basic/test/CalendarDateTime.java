package com.basic.test;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class CalendarDateTime
{

    public static void main(String[] args)
    {
        byte b = 0;
        for (int i = 0; i < 3; i++)
        {
            
            System.out.println("byte :" + b);
            b++;
        }

        System.out.println("Date Time: " + new Date());
        
        String ec = null;
        
        System.out.println("append: "+ ec + "jjj");

        Date date = DateUtils.truncate(new Date(), Calendar.SECOND);
        System.out.println("Date: " + date);
    }
}

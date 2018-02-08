package com.basic.interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.MultiValueMap;

public class HashMapAllowDuplicateKeys
{
    // Download apache commons jar
    public static void main(String[] args)
    {
        List list = new ArrayList();
        MultiValueMap<String, Integer> map = new MultiValueMap<String, Integer>();
        map.put("A", 4);
        map.put("A", 3);
        map.put("B", 7);
        map.put("C", 1);
        map.put("B", 9);
        map.put("A", 5);

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();

        System.out.println("ObjectKey \t ObjectValue");

        while (it.hasNext())
        {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Integer> mapEntry = (Map.Entry<String, Integer>) it
                    .next();
            
            //System.out.println(mapEntry.getKey() + "\t" + mapEntry.getValue());
            
            list = (List) map.get(mapEntry.getKey());
            
            for(int j=0 ; j<list.size(); j++)
            {
                System.out.println(mapEntry.getKey() + "\t" + list.get(j));
            }
            
        }
    }
}

// Output:

/*
System.out.println(mapEntry.getKey() + "\t" + mapEntry.getValue());
-------------------------------------
ObjectKey        ObjectValue
A               [4, 3, 5]
B               [7, 9]
C               [1]
-------------------------------------
*/


/*
ObjectKey       ObjectValue
A               4
A               3
A               5
B               7
B               9
C               1
*/
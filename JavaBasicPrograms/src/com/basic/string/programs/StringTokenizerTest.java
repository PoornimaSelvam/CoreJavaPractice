package com.basic.string.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String s = "Hello Good Morning Hello Morning";
		/*int count = 1;
		StringTokenizer st = new StringTokenizer(s);
		HashMap map = new HashMap<>();
		
		while(st.hasMoreElements())
		{
			String newToken = st.nextToken();
			if(map.containsKey(newToken))
			{
				map.put(newToken, count+1);
			}
			else
			{
				map.put(newToken, count);
			}
		}
		
		System.out.println(map);*/
		
		System.out.println(Stream.of(s.split("\\s")).collect(Collectors.groupingBy(String::toString, Collectors.counting())));
	}

}

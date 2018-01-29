package com.basic.string.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {
	public static void main(String[] args) {
		List<String> mafValues = Arrays.asList("[25-402n", "25-402o", "25-402p");
		
		mafValues = mafValues.stream().map(e -> e.startsWith("[") ? e.substring(1) : e).collect(Collectors.toList());
		
		System.out.println("mafvalues: " + mafValues);
	}
}

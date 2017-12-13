package com.collections.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComp> {

	@Override
	public int compare(StudentComp s1, StudentComp s2) {
		if(s1.age < s2.age) return -1;
		if(s1.age > s2.age) return 1;
		return 0; 
	}

}

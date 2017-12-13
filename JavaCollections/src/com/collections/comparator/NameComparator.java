package com.collections.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentComp> {

	@Override
	public int compare(StudentComp s1, StudentComp s2) {
		return s1.name.compareTo(s2.name);
	}

}

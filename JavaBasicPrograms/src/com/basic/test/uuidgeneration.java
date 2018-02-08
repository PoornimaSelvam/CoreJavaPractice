package com.basic.test;

import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class uuidgeneration {

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID());
		System.out.println("Length: "+StringUtils.remove(UUID
                .randomUUID().toString(), '-').length());

	}

}

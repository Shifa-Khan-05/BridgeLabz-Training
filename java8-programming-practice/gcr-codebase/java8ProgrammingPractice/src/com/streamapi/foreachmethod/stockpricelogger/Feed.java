package com.streamapi.foreachmethod.stockpricelogger;

import java.util.ArrayList;
import java.util.List;

public class Feed {

	public static void main(String[] args) {
		List<Double> price=new ArrayList<Double>();
		price.add(123.234);
		price.add(234.76);
		price.add(57758.876);
		price.add(2345.5);
		
		price.forEach(System.out::println);
		
	}
}

package com.streamapi.transformingnames;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
 public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("shifa");
	names.add("abhay");
	names.add("rahul");
	names.add("riya");
	
	List<String> uppercaslist=names.stream().map(n-> n.toUpperCase()).sorted().collect(Collectors.toList());
	uppercaslist.forEach(System.out::println);
	
	
}
}

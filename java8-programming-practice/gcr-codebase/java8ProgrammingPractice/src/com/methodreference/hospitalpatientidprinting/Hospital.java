package com.methodreference.hospitalpatientidprinting;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
  public static void main(String[] args) {
	  List<Integer> patientId=new ArrayList<Integer>();
	   patientId.add(01);
	   patientId.add(02);
	   patientId.add(03);
	   patientId.add(04);
	   patientId.add(05);
	   
	   patientId.forEach(System.out::println);
}
}

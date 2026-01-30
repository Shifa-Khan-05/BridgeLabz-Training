package com.methodreference.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class NameUppercase {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Abhay");
        names.add("Shifa");
        names.add("Zeenat");
        names.add("ram");
        names.add("aliya");

     
        names.replaceAll(String::toUpperCase);

        System.out.println(names);
    }
}

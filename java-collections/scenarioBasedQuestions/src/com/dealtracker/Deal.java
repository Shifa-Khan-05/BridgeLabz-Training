package com.dealtracker;



public class Deal<T> {
    String code;
    int discount;

    public Deal(String c, int d) {
        code = c;
        discount = d;
    }
}

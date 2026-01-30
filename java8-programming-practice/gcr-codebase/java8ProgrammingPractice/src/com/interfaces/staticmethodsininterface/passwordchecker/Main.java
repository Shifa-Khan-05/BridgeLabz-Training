package com.interfaces.staticmethodsininterface.passwordchecker;


public class Main {

    public static void main(String[] args) {

        String password = "Secure";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is STRONG");
        } else {
            System.out.println("Password is WEAK");
        }
    }
}

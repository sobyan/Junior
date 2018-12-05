package com.company;

public class MethodCall implements Method {

    public static int count = 0;

    @Override
    public String Meth() {
        count++;
        return "Method is called";
    }
}

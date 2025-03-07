package com.poly.test2_string;

import org.w3c.dom.ls.LSOutput;

public class StringDemo {
    static String s1 = new String("Hello");
    static String s2 = new String("Hello");
    static String s3 = "hi";
    static String s4 = "hi";

    public static void main(String[] args) {
        System.out.println("Kiem tra vung nho s1: " + System.identityHashCode(s3));
        System.out.println("Kiem tra vung nho s2: " + System.identityHashCode(s4));
        System.out.println(s1 == s2);
    }

}

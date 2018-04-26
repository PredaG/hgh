package com.company;

public class Main {
    public static void main(String[] args) {
        double value = 12.56;
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.println("Original value: " + value);
        System.out.println("Integral part: " + integral_part);
        System.out.println("Fractional part: " + fractional_part);

    }
}
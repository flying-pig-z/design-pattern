package com.flyingpig.structuralPatterns.strategy;

public class OldExample {
    public static void main(String[] args) {
        Double price = discount("95", 100.0);
        System.out.println(price);
    }

    public static Double discount(String type, Double price) {
        if ("9".equals(type)) {
            return price * 0.9;
        } else if ("95".equals(type)) {
            return price * 0.95;
        }
        return price;
    }

}

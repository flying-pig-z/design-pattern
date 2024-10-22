package com.flyingpig.creationalPatterns.factory.simpleFactory;

import com.flyingpig.creationalPatterns.factory.Product;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();

        Product productB = SimpleFactory.createProduct("B");
        productB.use();
    }
}

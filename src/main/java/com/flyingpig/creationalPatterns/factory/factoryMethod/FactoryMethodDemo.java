package com.flyingpig.creationalPatterns.factory.factoryMethod;

import com.flyingpig.creationalPatterns.factory.Product;

// 测试
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.use();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.use();
    }
}
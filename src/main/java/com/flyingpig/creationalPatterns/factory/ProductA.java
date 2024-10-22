package com.flyingpig.creationalPatterns.factory;

public class ProductA implements Product {
    @Override
    public void use() {
        System.out.println("使用产品 A");
    }
}

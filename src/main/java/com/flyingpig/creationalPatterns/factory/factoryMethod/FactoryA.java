package com.flyingpig.creationalPatterns.factory.factoryMethod;


import com.flyingpig.creationalPatterns.factory.Product;
import com.flyingpig.creationalPatterns.factory.ProductA;

// 具体工厂 A
public class FactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
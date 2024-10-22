package com.flyingpig.creationalPatterns.factory.factoryMethod;

import com.flyingpig.creationalPatterns.factory.Product;
import com.flyingpig.creationalPatterns.factory.ProductB;

// 具体工厂 B
public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
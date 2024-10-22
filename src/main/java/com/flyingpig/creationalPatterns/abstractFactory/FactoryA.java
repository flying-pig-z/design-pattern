package com.flyingpig.creationalPatterns.abstractFactory;

// 具体工厂 A
public class FactoryA implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}

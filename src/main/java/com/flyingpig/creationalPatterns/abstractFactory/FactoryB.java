package com.flyingpig.creationalPatterns.abstractFactory;
// 具体工厂 B
public class FactoryB implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}

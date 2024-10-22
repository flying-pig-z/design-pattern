package com.flyingpig.creationalPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryA = new FactoryA();
        ProductA productA1 = factoryA.createProductA();
        ProductB productB1 = factoryA.createProductB();

        productA1.use(); // 输出：使用产品 A1
        productB1.use(); // 输出：使用产品 B1

        AbstractFactory factoryB = new FactoryB();
        ProductA productA2 = factoryB.createProductA();
        ProductB productB2 = factoryB.createProductB();

        productA2.use(); // 输出：使用产品 A2
        productB2.use(); // 输出：使用产品 B2
    }
}


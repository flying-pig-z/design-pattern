package com.flyingpig.creationalPatterns.abstractFactory;

/*
    抽象工厂模式：在工厂方法模式的基础上可以创建多个产品，而不是只创建一个产品
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

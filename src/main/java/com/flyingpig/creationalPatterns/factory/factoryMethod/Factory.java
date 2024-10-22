package com.flyingpig.creationalPatterns.factory.factoryMethod;

import com.flyingpig.creationalPatterns.factory.Product;

/*
    工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，
        具体使用的时候采用多态进行调用。
 */
public interface Factory {
    Product createProduct();
}
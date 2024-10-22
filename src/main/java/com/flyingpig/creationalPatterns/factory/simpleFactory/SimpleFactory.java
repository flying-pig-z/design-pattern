package com.flyingpig.creationalPatterns.factory.simpleFactory;

import com.flyingpig.creationalPatterns.factory.ProductA;
import com.flyingpig.creationalPatterns.factory.ProductB;
import com.flyingpig.creationalPatterns.factory.Product;

/*
    简单工厂模式：通过一个工厂类，根据传入的参数决定创建哪一种类
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("未知产品类型");
        }
    }
}

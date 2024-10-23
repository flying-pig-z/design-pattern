package com.flyingpig.creationalPatterns.prototype;

// 客户端代码
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("Original name: " + original.getName());
        System.out.println("Cloned name: " + clone.getName());
    }
}
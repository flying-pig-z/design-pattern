package com.flyingpig.creationalPatterns.builder;

// 测试
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.getResult();
        System.out.println(product);
    }
}
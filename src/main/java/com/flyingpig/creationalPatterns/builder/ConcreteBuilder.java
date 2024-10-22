package com.flyingpig.creationalPatterns.builder;

// 具体建造者
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("Part A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

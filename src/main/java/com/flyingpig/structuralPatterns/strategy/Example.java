package com.flyingpig.structuralPatterns.strategy;

// 使用策略模式后
public class Example {
    public static void main(String[] args) {
        // 从抽象策略工厂中选择具体的策略
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy("95");

        // 执行具体策略代码
        Double price = discountStrategy.discount(100.0);

        // 输出策略执行结果
        System.out.println(price);
    }
}

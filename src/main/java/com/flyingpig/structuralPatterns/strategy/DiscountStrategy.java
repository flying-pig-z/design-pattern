package com.flyingpig.structuralPatterns.strategy;

// 定义策略抽象接口
public interface DiscountStrategy {
    Double discount(Double price);
}

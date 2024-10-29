package com.flyingpig.structuralPatterns.strategy;


// 95折优惠策略类
public class Discount95Strategy implements DiscountStrategy{
    @Override
    public Double discount(Double price) {
        return price * 0.95;
    }
}

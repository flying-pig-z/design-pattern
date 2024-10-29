package com.flyingpig.structuralPatterns.strategy;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategyFactory {
    private static final Map<String, DiscountStrategy> discountStrategies = new HashMap<>();

    static {
        discountStrategies.put("95", new Discount95Strategy());
        discountStrategies.put("9", new Discount9Strategy());
    }

    public static DiscountStrategy getDiscountStrategy(String type) {
        return discountStrategies.get(type);
    }
}

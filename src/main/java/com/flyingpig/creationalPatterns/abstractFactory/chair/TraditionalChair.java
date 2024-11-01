package com.flyingpig.creationalPatterns.abstractFactory.chair;

public class TraditionalChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a traditional chair.");
    }
}
package com.flyingpig.creationalPatterns.abstractFactory.sofa;

public class TraditionalSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a traditional sofa.");
    }
}
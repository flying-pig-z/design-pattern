package com.flyingpig.creationalPatterns.abstractFactory;

import com.flyingpig.creationalPatterns.abstractFactory.chair.Chair;
import com.flyingpig.creationalPatterns.abstractFactory.chair.TraditionalChair;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.Sofa;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.TraditionalSofa;

public class TraditionalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TraditionalChair();
    }

    @Override
    public Sofa createSofa() {
        return new TraditionalSofa();
    }
}

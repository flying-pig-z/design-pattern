package com.flyingpig.creationalPatterns.abstractFactory;

import com.flyingpig.creationalPatterns.abstractFactory.chair.Chair;
import com.flyingpig.creationalPatterns.abstractFactory.chair.ModernChair;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.ModernSofa;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

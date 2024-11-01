package com.flyingpig.creationalPatterns.abstractFactory;

import com.flyingpig.creationalPatterns.abstractFactory.chair.Chair;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

package com.flyingpig.creationalPatterns.abstractFactory;


import com.flyingpig.creationalPatterns.abstractFactory.chair.Chair;
import com.flyingpig.creationalPatterns.abstractFactory.sofa.Sofa;

public class Main {
    public static void main(String[] args) {
        // 使用现代家具工厂
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn();
        modernSofa.lieOn();

        // 使用传统家具工厂
        FurnitureFactory traditionalFactory = new TraditionalFurnitureFactory();
        Chair traditionalChair = traditionalFactory.createChair();
        Sofa traditionalSofa = traditionalFactory.createSofa();

        traditionalChair.sitOn();
        traditionalSofa.lieOn();
    }
}

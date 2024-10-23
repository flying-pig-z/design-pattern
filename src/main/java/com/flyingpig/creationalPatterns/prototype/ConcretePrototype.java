package com.flyingpig.creationalPatterns.prototype;

// 具体原型类
public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }
}

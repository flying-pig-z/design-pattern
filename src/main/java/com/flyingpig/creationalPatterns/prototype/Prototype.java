package com.flyingpig.creationalPatterns.prototype;

// 原型模式:通过复制已有的实例来创建新对象，避免了使用构造函数的复杂性。
public interface Prototype {
    Prototype clone();
}
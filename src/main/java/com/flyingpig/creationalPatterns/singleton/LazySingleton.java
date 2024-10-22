package com.flyingpig.creationalPatterns.singleton;

/*
    懒汉式单例模式 -- 第一次使用的时候才加载对象，线程不安全
    实现方式：有个静态变量保存唯一实例，调用getInstance()方法如果没有该实例就创建该实例返回，如果已有直接返回
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
package com.flyingpig.creationalPatterns.singleton;

/*
    饿汉式单例模式 -- 类加载时就加载对象，线程安全
    实现方式：有个静态变量保存唯一实例，直接在赋初始值初始化，调用getInstance()方法可以返回这个实例
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}

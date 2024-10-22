package com.flyingpig.creationalPatterns.singleton;

/*
    双重检查锁单例模式 -- 懒汉式单例模式的线程安全版本
    实现方式：懒汉模式的基础上加上synchronized锁，保证线程安全
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

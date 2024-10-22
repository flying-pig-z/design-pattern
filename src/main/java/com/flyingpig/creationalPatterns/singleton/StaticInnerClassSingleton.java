package com.flyingpig.creationalPatterns.singleton;

/*
    静态内部类单例模式 -- 懒汉式单例模式的线程安全版本
    静态内部类只在第一次调用 getInstance() 方法时加载，从而避免了饿汉式中无论是否使用都会创建实例的问题
    由于静态内部类的加载是线程安全的，JVM 确保只会加载一次，因此在多线程环境中不会出现实例的重复创建，避免懒汉式的线程安全问题
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {}

    private static class Holder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return Holder.INSTANCE;
    }
}

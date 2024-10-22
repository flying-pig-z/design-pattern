package com.flyingpig.creationalPatterns.singleton;

/*
    枚举单例模式
    实现方式：在枚举类创建单例对象，可以防止序列化和反序列化攻击
 */
public enum EnumSingleton {
    INSTANCE;

    public void someMethod() {
        // 业务逻辑
    }
}

package com.flyingpig.behavioralPatterns.adapter;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewSystem newSystem = new Adapter(oldSystem);

        // 使用适配后的新系统方法
        newSystem.newMethod();
    }
}

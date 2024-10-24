package com.flyingpig.behavioralPatterns.adapter;

// 适配器类
public class Adapter implements NewSystem {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void newMethod() {
        // 调用老系统的方法
        oldSystem.oldMethod();
    }
}

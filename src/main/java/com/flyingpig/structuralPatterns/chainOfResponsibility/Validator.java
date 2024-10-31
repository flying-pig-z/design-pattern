package com.flyingpig.structuralPatterns.chainOfResponsibility;

// 抽象处理者
public abstract class Validator {
    protected Validator next;

    public void setNext(Validator next) {
        this.next = next;
    }

    public abstract void validate(String input);
}


package com.flyingpig.structuralPatterns.chainOfResponsibility;

// 具体处理者 - 校验非空
public class NotNullValidator extends Validator {
    @Override
    public void validate(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("输入不能为空");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
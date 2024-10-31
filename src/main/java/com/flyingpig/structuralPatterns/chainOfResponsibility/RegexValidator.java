package com.flyingpig.structuralPatterns.chainOfResponsibility;

// 具体处理者 - 校验正则表达式
public class RegexValidator extends Validator {
    private String regex;

    public RegexValidator(String regex) {
        this.regex = regex;
    }

    @Override
    public void validate(String input) {
        if (!input.matches(regex)) {
            throw new IllegalArgumentException("输入格式不正确");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}
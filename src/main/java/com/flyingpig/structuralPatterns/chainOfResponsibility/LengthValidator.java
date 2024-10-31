package com.flyingpig.structuralPatterns.chainOfResponsibility;


// 具体处理者 - 校验长度
public class LengthValidator extends Validator {
    private int minLength;
    private int maxLength;

    public LengthValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public void validate(String input) {
        if (input.length() < minLength || input.length() > maxLength) {
            throw new IllegalArgumentException("输入长度必须在 " + minLength + " 到 " + maxLength + " 之间");
        }
        if (next != null) {
            next.validate(input);
        }
    }
}

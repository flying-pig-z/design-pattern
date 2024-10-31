package com.flyingpig.structuralPatterns.chainOfResponsibility;

// 客户端代码
public class ValidatorClient {
    public static void main(String[] args) {
        // 构建责任链
        Validator notNullValidator = new NotNullValidator();
        Validator lengthValidator = new LengthValidator(5, 10);
        Validator regexValidator = new RegexValidator("^[a-zA-Z0-9]*$");

        notNullValidator.setNext(lengthValidator);
        lengthValidator.setNext(regexValidator);

        // 校验输入
        String input = "Hello123";

        try {
            notNullValidator.validate(input);
            System.out.println("输入校验通过");
        } catch (IllegalArgumentException e) {
            System.err.println("校验失败: " + e.getMessage());
        }
    }
}

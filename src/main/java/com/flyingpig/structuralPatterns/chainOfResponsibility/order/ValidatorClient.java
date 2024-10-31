package com.flyingpig.structuralPatterns.chainOfResponsibility.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 抽象处理者
abstract class Validator {
    protected Validator next;

    public void setNext(Validator next) {
        this.next = next;
    }

    public abstract void validate(String input);

    public abstract int getOrder();
}

// 具体处理者 - 校验非空
class NotNullValidator extends Validator {
    @Override
    public void validate(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("输入不能为空");
        }
        if (next != null) {
            next.validate(input);
        }
    }

    @Override
    public int getOrder() {
        return 1; // 设定处理顺序
    }
}

// 具体处理者 - 校验长度
class LengthValidator extends Validator {
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

    @Override
    public int getOrder() {
        return 2; // 设定处理顺序
    }
}

// 具体处理者 - 校验正则
class RegexValidator extends Validator {
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

    @Override
    public int getOrder() {
        return 3; // 设定处理顺序
    }
}

// 责任链管理类
class ValidatorChain {
    private List<Validator> validators = new ArrayList<>();

    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    public Validator buildChain() {
        // 排序处理者
        Collections.sort(validators, Comparator.comparingInt(Validator::getOrder));

        // 链接处理者
        for (int i = 0; i < validators.size() - 1; i++) {
            validators.get(i).setNext(validators.get(i + 1));
        }

        // 返回链的第一个处理者
        return validators.isEmpty() ? null : validators.get(0);
    }
}

// 客户端代码
public class ValidatorClient {
    public static void main(String[] args) {
        ValidatorChain validatorChain = new ValidatorChain();
        validatorChain.addValidator(new NotNullValidator());
        validatorChain.addValidator(new LengthValidator(5, 10));
        validatorChain.addValidator(new RegexValidator("^[a-zA-Z0-9]*$"));

        Validator firstValidator = validatorChain.buildChain();

        // 校验输入
        String input = "Hello123";

        try {
            if (firstValidator != null) {
                firstValidator.validate(input); // 从链的第一个处理者开始校验
            }
            System.out.println("输入校验通过");
        } catch (IllegalArgumentException e) {
            System.err.println("校验失败: " + e.getMessage());
        }
    }
}

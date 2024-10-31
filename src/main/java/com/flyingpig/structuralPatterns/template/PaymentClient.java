package com.flyingpig.structuralPatterns.template;

// 抽象支付类
abstract class Payment {
    // 模板方法
    public final void pay() {
        authenticate();
        processPayment();
        generateReceipt();
    }

    protected abstract void authenticate();

    protected abstract void processPayment();

    private void generateReceipt() {
        System.out.println("生成支付收据");
    }
}

// 微信支付实现
class WeChatPayment extends Payment {
    @Override
    protected void authenticate() {
        System.out.println("使用微信账号进行身份验证");
    }

    @Override
    protected void processPayment() {
        System.out.println("通过微信进行支付");
    }
}

// 支付宝支付实现
class AlipayPayment extends Payment {
    @Override
    protected void authenticate() {
        System.out.println("使用支付宝账号进行身份验证");
    }

    @Override
    protected void processPayment() {
        System.out.println("通过支付宝进行支付");
    }
}

// QQ支付实现
class QQPayment extends Payment {
    @Override
    protected void authenticate() {
        System.out.println("使用QQ账号进行身份验证");
    }

    @Override
    protected void processPayment() {
        System.out.println("通过QQ进行支付");
    }
}

// 客户端代码
public class PaymentClient {
    public static void main(String[] args) {
        Payment weChatPayment = new WeChatPayment();
        weChatPayment.pay();

        System.out.println("---------");

        Payment alipayPayment = new AlipayPayment();
        alipayPayment.pay();

        System.out.println("---------");

        Payment qqPayment = new QQPayment();
        qqPayment.pay();
    }
}

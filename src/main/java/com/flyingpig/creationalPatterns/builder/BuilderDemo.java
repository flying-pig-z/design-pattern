package com.flyingpig.creationalPatterns.builder;

// 测试类
public class BuilderDemo {
    public static void main(String[] args) {
        // 使用 Builder 创建 Person 实例
        // 调用Person中内置Builder类构造函数，通过链式调用设置属性(调用的方法都返回Builder),
        // 最后调用 build() 方法根据Builder类创建 Person 实例
        Person person = new Person.Builder()
                .name("Alice")
                .age(30)
                .email("alice@example.com")
                .build();

        // 打印 Person 信息
        System.out.println(person);
    }
}

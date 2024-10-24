外观模式目的为复杂的类提供统一的接口。

具体项目中使用到的外观模式：
https://github.com/apolloconfig/apollo/blob/master/apollo-portal/src/main/java/com/ctrip/framework/apollo/portal/api/AdminServiceAPI.java

在APOLLO项目中，AdminServiceAPI为外观类，里面封装了很多静态类划分执行远程调用的方法。

将这些静态类统一放在AdminServiceAPI中从而对外提供统一的远程调用接口，便于管理。
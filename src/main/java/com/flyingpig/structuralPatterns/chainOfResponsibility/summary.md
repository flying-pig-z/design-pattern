## 一.什么是责任链模式

责任链模式是一种行为设计模式， 允许你将请求沿着处理者链进行发送。 
收到请求后， 每个处理者均可对请求进行处理， 或将其传递给链上的下个处理者。

如果你要用程序处理一件事情，那个事情的任务很长，
你就可以把那件事情分成几个小的任务，然后把这些小的任务串成一个链条，
然后让这个链条上的每一个任务去处理这个事情的一部分，

优点:
* 将请求与处理解耦。
* 请求处理者（节点对象）只需要关注自己感兴趣的请求进行处理即可，对于不感兴趣的请求，转发给下一个节点。
* 具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果。
* 链路结构灵活，可以通过改变链路的结构动态的新增或删减责任。
* 易于扩展新的请求处理类（节点），符合开闭原则。

缺点:
* 责任链太长或者处理时间过长，会影响整体性能。
* 如果节点对象存在循环引用时，会造成死循环，导致系统崩溃。

## 二.责任联模式的应用场景
在框架中，spring mvc 与 spring security 的过滤器链就是使用责任链模式。

在日常开发中，我们一般使用责任链模式实现认证授权 参数验证 流程控制等功能。

> 拿参数校验举例，虽然springboot提供了很好用的注解进行参数校验，但是还是有很多复杂的校验是注解无法满足的。
> 
> 如果整个登录校验的逻辑很复杂，就可以使用责任链模式。如果不使用，复杂的参数校验场景面临两个问题。
> 
> 如果把代码逻辑校验规则写到一起，毫无疑问这个类或者说这个方法函数奇大无比。减少代码复杂性一贯方法是：
> 将大块代码逻辑拆分成函数，将大类拆分成小类，是应对代码复杂性的常用方法。
> 如果此时说：可以把不同的校验规则拆分成不同的函数，不同的类，这样不也可以满足减少代码复杂性的要求么。
> 这样拆分是能解决代码复杂性，但是这样就会面临第二个问题开闭原则。
> 大家设想一下，假设你写了三套校验规则，运行过一段时间，这时候领导让加第四套，是不是要在原有代码上改动
> 综上所述，在合适的场景运用适合的设计模式，能够让代码设计复杂性降低，变得更为健壮。


## 二.如何实现责任链模式

在案例中，我们使用责任链模式进行了简单的参数校验。

具体分为三部分：
* 抽象处理者：Validator 是一个抽象类，定义了处理请求的接口和下一个处理者的引用。
* 具体处理者：分别实现了非空校验、长度校验和正则表达式校验的具体处理者类。
* 客户端代码：在 ValidatorClient 中构建责任链，并进行输入校验。

使用责任链模式通常还需要指定处理者的顺序，所以在这个基础上进行修改，具体代码放在order包里。

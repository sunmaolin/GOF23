# GOF23
23种设计模式总结

#类图：
1.依赖关系（dependence）

    1)类中用到了  
    2)如果是类的成员属性
    3)如果是方法的返回类型
    4)是方法接收的参数类型
    5)方法中使用到（但是违反了迪米特法则）
    
2.泛化关系（generalization:继承）

3.实现关系（implementation:接口实现）

4.关联关系（association）

    1)具有导航性：即双向关系或单向关系
    2)具有多重性：1（表示有且仅有一个）0...（表示0个或者多个）
      0，1（表示0个或者一个）n...m（表示n到m个都可以）m...（表示至少m个）
    
5.聚合关系（aggregation）
    
    1)set和get方法，关系可分开
    
6.组合关系（Composition）

    2)new对象时同时实例化（共生共灭），关系不可分开
    
#设计模式

    1.创建型模式：单例模式、抽象工厂模式、原型模式、建造者模式、工厂模式
    2.结构型模式：适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式
    3.行为型模式：模板方法模式、命令模式、访问者模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、责任链模式 

#单例模式（可用方法）

    1.饿汉式（静态常量）
    2.饿汉式（静态代码块）
    3.双重检查
    4.静态内部类
    5.枚举

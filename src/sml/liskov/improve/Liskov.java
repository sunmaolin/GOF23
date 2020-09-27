package sml.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        B b = new B();
        //因为B类不在继承A类，因此调用者，不会在认为func1是求剑法
        //调用完成的功能就会很明确
        System.out.println("11+3="+b.func1(11,3));
        System.out.println("1+8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));

        //使用组合任然可以使用A类相关方法
        System.out.println("11-3="+b.func3(11,3));
    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的方法和成员写到Base类
}

//A类
class A extends Base{
    //返回俩个数的差
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}


class B extends Base {
    //如果B需要使用A类的方法，我们使用组合的方法
    private A a = new A();

    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int num1,int num2){
        return func1(num1,num2)+9;
    }

    //我们任然想使用A的方法
    public int func3(int num1,int num2){
        return this.a.func1(num1, num2);
    }
}
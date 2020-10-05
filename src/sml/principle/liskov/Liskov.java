package sml.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        B b = new B();
        //这里本意是求出11-3
        System.out.println("11-3="+b.func1(11,3));
        //本意求出1-8
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

//A类
class A {
    //返回俩个数的差
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}


class B extends A {
    @Override
    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int num1,int num2){
        return func1(num1,num2)+9;
    }
}
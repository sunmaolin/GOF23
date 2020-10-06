package sml.singleton.type1;

/**
 * 饿汉式（静态常量）
 * 优点：写法简单，在类加载的时候就完成了实例化，避免了线程同步问题
 * 缺点：在类加载的时候就完成实例化，没有达到Lazy Loading的效果（懒加载）。如果从开始到结束从未使用过这个实例，会造成内存的浪费
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode:"+instance.hashCode());
        System.out.println("instance2的hashCode:"+instance2.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton {
    //1.构造器私有化，外部不能new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}


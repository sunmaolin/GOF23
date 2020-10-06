package sml.singleton.type2;

/**
 * 饿汉式（静态代码块）
 * 优缺点与饿汉式静态常量相同
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode:"+instance.hashCode());
        System.out.println("instance2的hashCode:"+instance2.hashCode());
    }
}

//饿汉式（静态代码块）
class Singleton {
    //1.构造器私有化，外部不能new
    private Singleton() {
    }

    private static Singleton instance;

    // 2.在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}


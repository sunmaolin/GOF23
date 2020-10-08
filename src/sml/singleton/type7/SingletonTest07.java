package sml.singleton.type7;

/**
 * 懒汉式（静态内部类）
 * 优点：
 * 1.采用了类装载的机制来保证初始化实例时只有一个线程
 * 2.静态内部类不会立即加载，只有在使用时才会加载，而类的静态属性只会在第一次加载类的时候初始化，所以JVM保证了线程的安全
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode:"+instance.hashCode());
        System.out.println("instance2的hashCode:"+instance2.hashCode());
    }
}

class Singleton {

    //构造器私有化
    private Singleton() {
    }

    //静态内部类，Singleton类加载时静态内部类不会立即加载（装载类时线程安全），只有使用到时才会加载
    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

    //提供一个静态的公有方法,直接返回静态内部类的成员变量
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}

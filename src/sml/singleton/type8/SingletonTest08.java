package sml.singleton.type8;

/**
 * 懒汉式（枚举方式）
 * 优点：借助JDK1.5中添加的枚举来实现单例模式，不尽避免了多线程同步问题，而且还能防止
 * 反序列化重新创建新的对象
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode："+instance.hashCode());
        System.out.println("instance2的hashCode："+instance.hashCode());
    }
}

enum Singleton {
    INSTANCE;
}

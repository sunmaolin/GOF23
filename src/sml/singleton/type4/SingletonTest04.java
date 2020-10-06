package sml.singleton.type4;

/**
 * 懒汉式（线程安全）
 * 优点：起到了Lazy Loading的效果，且解决了线程安全问题
 * 缺点：效率低，每个线程在想获得类的实例时候，执行instance方法都要进行同步，而其实这个
 * 方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了，方法进行同步效率太低
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode:"+instance.hashCode());
        System.out.println("instance2的hashCode:"+instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入了同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

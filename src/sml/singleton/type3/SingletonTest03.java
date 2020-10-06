package sml.singleton.type3;

/**
 * 懒汉式（线程不安全）
 * 优点：起到了Lazy Loading的效果，但是只能在单线程下使用
 * 缺点：多线程下线程不安全
 */
public class SingletonTest03 {
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

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即 懒汉式
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

package sml.singleton.type6;

/**
 * 懒汉式（双重检查）
 * 优点：线程安全，延迟加载（懒加载），效率较高
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance的hashCode:"+instance.hashCode());
        System.out.println("instance2的hashCode:"+instance2.hashCode());
    }
}

class Singleton {
    //volatile关键字为instance修改时，立即刷到主存中
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入了双重检查的代码，解决线程安全问题，同时解决懒加载问题，也是对同步代码块的优化，保证了效率
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

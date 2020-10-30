package sml.prototype.objClone;

/**
 * 浅拷贝，需要拷贝的类实现接口Cloneable接口
 */
public class PrototypeCloneObject implements Cloneable {

    String name;

    int age;

    public PrototypeCloneObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrototypeCloneObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 需要实现Cloneable接口的克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //实现接口只能是对基本类型的拷贝，对于对象只能是拷贝其地址
        return super.clone();
    }
}

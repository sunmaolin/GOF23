package sml.prototype.deepObjClone;

import java.io.Serializable;

/**
 * 需要进行深拷贝的对象
 */
public class DeepCloneObj implements Serializable,Cloneable {
    String name;
    int age;

    public DeepCloneObj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DeepCloneObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

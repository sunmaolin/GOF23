package sml.prototype.deepObjClone;

import java.io.*;

/**
 * 需要进行深拷贝的原型
 */
public class DeepClonePrototype implements Serializable,Cloneable {
    String sex;

    DeepCloneObj deepCloneObj;

    public DeepClonePrototype(String sex, DeepCloneObj deepCloneObj) {
        this.sex = sex;
        this.deepCloneObj = deepCloneObj;
    }

    @Override
    public String toString() {
        return "DeepClonePrototype{" +
                "sex='" + sex + '\'' +
                ", deepCloneObj=" + deepCloneObj +
                '}';
    }

    /**
     * 通过接口Cloneable实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected DeepClonePrototype clone() throws CloneNotSupportedException {
        DeepClonePrototype deepClonePrototype = null;
        //对原型对象的基本类型进行克隆
        deepClonePrototype = (DeepClonePrototype) super.clone();
        //对原型对象的引用类型进行克隆
        deepClonePrototype.deepCloneObj = (DeepCloneObj) deepCloneObj.clone();
        return deepClonePrototype;
    }

    /**
     * 使用序列化对原型对象进行深拷贝
     * @return
     */
    protected DeepClonePrototype serializableDeepClone()  {
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try{
            //创建输入输出流
            baos = new ByteArrayOutputStream();
            oos =  new ObjectOutputStream(baos);
            oos.writeObject(this);

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            DeepClonePrototype deepClonePrototype = (DeepClonePrototype) ois.readObject();
            return deepClonePrototype;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                baos.close();
                oos.close();
                bais.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package sml.prototype.deepObjClone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClonePrototype obj = new DeepClonePrototype("男",new DeepCloneObj("孙茂林",23));

        DeepClonePrototype clone1 = (DeepClonePrototype) obj.clone();
        DeepClonePrototype clone2 = (DeepClonePrototype) obj.serializableDeepClone();

        System.out.println(obj.toString()+"  obj.hashCode:" + obj.hashCode());
        System.out.println(clone1.toString()+"  clone1.hashCode:" + clone1.hashCode());
        System.out.println(clone2.toString()+"  clone2.hashCode:" + clone2.hashCode());
    }
}

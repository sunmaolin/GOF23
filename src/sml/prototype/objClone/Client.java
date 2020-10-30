package sml.prototype.objClone;

public class Client {
    public static void main(String[] args) {
        try{
            //创建一个原型对象
            PrototypeCloneObject obj = new PrototypeCloneObject("孙茂林",23);
            //对原型对象进行拷贝
            PrototypeCloneObject cloneObj = (PrototypeCloneObject) obj.clone();
            PrototypeCloneObject cloneOb1 = (PrototypeCloneObject) obj.clone();

            System.out.println(obj.toString()+"  obj.hashCode:"+ obj.hashCode());
            System.out.println(cloneObj.toString()+"  cloneObj.hashCode:"+cloneObj.hashCode());
            System.out.println(cloneOb1.toString()+"  cloneObj1.hashCode:"+cloneOb1.hashCode());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

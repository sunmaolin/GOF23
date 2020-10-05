package sml.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义一个接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello world";
    }
}

class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息：Hello OK";
    }
}

//方式2
class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}

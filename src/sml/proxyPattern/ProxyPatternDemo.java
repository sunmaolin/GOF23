package sml.proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("123");

        //图像从磁盘加载
        image.display();
        System.out.println("");
        //图像不需要从磁盘加载
        image.display();
    }
}

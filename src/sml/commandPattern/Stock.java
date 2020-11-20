package sml.commandPattern;

/**
 * 创建请求类
 */
public class Stock {
    private String name = "ABC";
    //数量
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+
                        ",Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+
                ",Quantity: " + quantity +" ] sold");
    }

}

package sml.factory.simpleFactory.pizzaStore.order;

import sml.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import sml.factory.simpleFactory.pizzaStore.pizza.GreekPizza;
import sml.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import sml.factory.simpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    //使用聚合模式来创建一个简单工厂
    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.setFactory(simpleFactory);
        this.createPizza();
    }

    //聚合
    public void setFactory(SimpleFactory factory){
        this.simpleFactory = factory;
    }

    public void createPizza(){
        String orderType = this.getType();
//        Pizza pizza = this.simpleFactory.createPizza(orderType);
        //换成静态的
        Pizza pizza = SimpleFactory.createPizza2(orderType);
        if(pizza != null){
            pizza.setName(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;//订购披萨的类型
//        do {
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
//            }else{
//                break;
//            }
//            pizza.setName(orderType);
//            //输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while(true);
//    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}

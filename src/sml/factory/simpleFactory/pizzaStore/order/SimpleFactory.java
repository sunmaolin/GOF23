package sml.factory.simpleFactory.pizzaStore.order;

import sml.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import sml.factory.simpleFactory.pizzaStore.pizza.GreekPizza;
import sml.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import sml.factory.simpleFactory.pizzaStore.pizza.Pizza;

//简单工厂类,无论增加多少个pizza，都交给这个工厂来做就好了
public class SimpleFactory {

//    private Pizza pizza = null;
    private static Pizza pizza = null;

//    public Pizza createPizza(String orderType){
//        System.out.println("使用简单工厂模式");
//        if(orderType.equals("greek")){
//            pizza = new GreekPizza();
//        }else if(orderType.equals("cheese")){
//            pizza = new CheesePizza();
//        }else if(orderType.equals("pepper")){
//            pizza = new PepperPizza();
//        }
//        return pizza;
//    }

    //简单工厂可以写成静态方法直接调用，也相对简单
    public static Pizza createPizza2(String orderType){
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
        }
        return pizza;
    }
}

package sml.factory.simpleFactory.pizzaStore.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给制作胡椒披萨 准备原材料 ");
    }
}

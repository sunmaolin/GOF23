package sml.factory.simpleFactory.pizzaStore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(" 给制作希腊披萨 准备原材料 ");
	}

}

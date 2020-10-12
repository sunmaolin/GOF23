package sml.factory.factoryMethod.pizzaStore.order;

import sml.factory.factoryMethod.pizzaStore.pizz.BJCheesePizza;
import sml.factory.factoryMethod.pizzaStore.pizz.BJPepperPizza;
import sml.factory.factoryMethod.pizzaStore.pizz.Pizza;


public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}

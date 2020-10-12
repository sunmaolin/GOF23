package sml.factory.factoryMethod.pizzaStore.order;

import sml.factory.factoryMethod.pizzaStore.pizz.LDCheesePizza;
import sml.factory.factoryMethod.pizzaStore.pizz.LDPepperPizza;
import sml.factory.factoryMethod.pizzaStore.pizz.Pizza;


public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}

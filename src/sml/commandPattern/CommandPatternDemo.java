package sml.commandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        //接受命令
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        //执行命令
        broker.placeOrders();
    }
}

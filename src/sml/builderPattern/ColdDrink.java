package sml.builderPattern;

public abstract class ColdDrink implements Item {
    //包装确定，直接实现方法
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

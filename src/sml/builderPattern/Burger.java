package sml.builderPattern;

public abstract class Burger implements Item {
    //包装确定，直接实现方法
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

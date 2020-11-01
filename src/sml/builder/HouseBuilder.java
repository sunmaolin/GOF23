package sml.builder;

/**
 * 抽象的建造者   也可以写成接口
 *
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造好房子将房子返回
    public House buildHouse(){
        return house;
    }


}

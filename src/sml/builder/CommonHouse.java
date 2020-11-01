package sml.builder;

/**
 * 普通房子建造过程
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通楼房打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通楼房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通楼房封顶");
    }
}

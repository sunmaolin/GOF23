package sml.builder;

/**
 * 房子的设计者
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //俩种方式进行houseBuilder的聚合
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        //将建造好的房子返回
        return houseBuilder.buildHouse();
    }
}

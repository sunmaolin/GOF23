package sml.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
       Vehicle2 vehicle = new Vehicle2();
       vehicle.runRoad("汽车");
       vehicle.runAir("飞机");
       vehicle.runWater("轮船");
    }
}

//方式3 分析
//1. 这种修改方法没有对原来的类做大的修改，只是增加方法
//2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，任然是遵守单一职责原则

class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里运行");
    }
}


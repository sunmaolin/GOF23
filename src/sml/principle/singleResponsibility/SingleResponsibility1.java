package sml.principle.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //违反了单一原则，飞机也在公路上跑，应该在天上飞
        vehicle.run("公交车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

//交通工具类
//方式1 问题分析
//1. 在方式1的run方法中，违反了单一职责原则
//2. 解决的方案非常的简单，根据交通方式运行的方法不同，分成不同的类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。");
    }
}

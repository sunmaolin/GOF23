package sml.adapter.classAdapter;

//被适配类，220V电压
public class Voltage220V {
    public int output220(){
        int src = 220;
        System.out.println("输出"+src+"伏电压");
        return src;
    }
}

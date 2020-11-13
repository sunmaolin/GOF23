package sml.adapter.classAdapter;

//适配器
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220();
        //转成5v电压
        int dstV = srcV / 44;
        System.out.println("适配器已将电压转为5V");
        return dstV;
    }
}

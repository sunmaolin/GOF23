package sml.adapter.objectAdapter;

//适配器
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if(null != voltage220V){
            int src = this.voltage220V.output220();
            dstV = src/44;
            System.out.println("适配器已将电压转为5V");
        }
        return dstV;
    }
}

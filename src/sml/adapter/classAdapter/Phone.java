package sml.adapter.classAdapter;

public class Phone {
    //充电
    public void charging(IVoltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压为5V可以充电");
        }else{
            System.out.println("电压不为5V不可以充电");
        }
    }
}

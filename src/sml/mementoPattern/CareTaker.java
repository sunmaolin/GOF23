package sml.mementoPattern;

import java.util.ArrayList;
import java.util.List;

//客户不与备忘录类耦合，与备忘录管理类耦合
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        this.mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

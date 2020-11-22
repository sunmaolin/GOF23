package sml.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observerList.add(observer);
    }

    /**
     * 通知所有观察者更新
     */
    public void notifyAllObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }
}

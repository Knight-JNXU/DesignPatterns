package MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/23.
 * 备忘录class
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

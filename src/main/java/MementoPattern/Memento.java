package MementoPattern;

/**
 * Created by Knight_JXNU on 2016/11/23.
 * 状态class
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

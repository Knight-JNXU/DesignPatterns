package MementoPattern;

/**
 * Created by Knight_JXNU on 2016/11/23.
 * http://www.runoob.com/design-pattern/memento-pattern.html
 */
public class MementoPatternDemo {
    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

    }
}